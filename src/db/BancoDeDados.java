package db;

import java.sql.*;

public class BancoDeDados {
	private static String url = "jdbc:mysql://localhost:3306/KwikEMartDB"; 
	private static String user = "admin";
	private static String pass = "Lucas789*";
	protected static Connection conexao = null;
	
	public BancoDeDados() {
		if(conexao == null) {
			conecta();
		}
	}
	
	private static boolean conecta() {
		try {
			conexao = DriverManager.getConnection(url, user, pass);
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	private static boolean desconecta() {
		try {
			conexao.close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
}
