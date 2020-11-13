package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.CompraDeProdutos;

public class CompraDeProdutosDAO extends BancoDeDados {
	public static boolean adicionaCompra(CompraDeProdutos compra) {
		Statement statement;
		try {
			statement = conexao.createStatement();
			statement.executeUpdate("INSERT INTO compras VALUES ('" + compra.getTotalCompra() + "')");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static void listaCompras() {
		Statement statement;
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM compras"); 
			while (resultSet.next()) {
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
