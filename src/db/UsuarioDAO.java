package db;

import model.Usuario;
import java.sql.*;

public class UsuarioDAO extends BancoDeDados {
	
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
