/*
* Classe BancoDeDados - Representa a conexão com o banco de dados MySql
* @author Lucas Carvalho 
* @version 1.0, 2020-11-08
*/

package db;

import java.sql.*;

public class BancoDeDados {
	private static String url = "jdbc:mysql://localhost:3306/KwikEMartDB"; /** Url de conexao */
	private static String user = "admin"; /** Usuario */
	private static String pass = "Lucas789*"; /** Senha */
	protected static Connection conexao = null; /** Conexao */
	
	/*
	* Construtor da classe.
	*/
	public BancoDeDados() {
		if(conexao == null) {
			conecta();
		}
	}
	
	/**
	 * Faz a conexao com o BD
	 * @return boolean resultado da operacao
	 */
	private static boolean conecta() {
		try {
			conexao = DriverManager.getConnection(url, user, pass);
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	/**
	 * Desconecta com o BD
	 * @return boolean resultado da operacao
	 */
	private static boolean desconecta() {
		try {
			conexao.close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
}
