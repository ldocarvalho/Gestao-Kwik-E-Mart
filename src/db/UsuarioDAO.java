/*
* Classe CompraDeProdutosDAO - Representa a manipulação dos obj Usuario no BD
* @author Lucas Carvalho 
* @version 1.0, 2020-11-12
*/

package db;

import model.Usuario;
import java.sql.*;

public class UsuarioDAO extends BancoDeDados {
	
	/**
	 * Busca um usuario salvo no BD
	 * @param nomeUsuario nome de usuario do usuario 
	 * @param senha senha do usuario
	 * @return Usuario usuario salvo no sistema
	 */
	public static Usuario getUsuarioSalvo(String nomeUsuario, String senha) {
		Statement statement;
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios WHERE nome_usuario='" + nomeUsuario + "' AND senha='" + senha + "'");
			if (resultSet.next()) {
				return new Usuario();
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Insere um usuario no BD
	 * @param nomeUsuario nome de usuario do usuario 
	 * @param senha senha do usuario
	 * @return boolean resultado da operacao
	 */
	public static boolean cadastraUsuario(String nomeUsuario, String senha) {
		Statement statement;
		try {
			statement = conexao.createStatement();
			statement.executeUpdate("INSERT INTO usuarios VALUES('" + nomeUsuario + "'," +  " '" + senha + "')");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
