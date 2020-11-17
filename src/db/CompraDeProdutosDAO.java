package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
	
	public static ArrayList<CompraDeProdutos> listaCompras() {
		ArrayList<CompraDeProdutos> listaDeCompras = new ArrayList<CompraDeProdutos>();
		
		Statement statement;
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM compras"); 
			while (resultSet.next()) {
				CompraDeProdutos compra = new CompraDeProdutos(Double.parseDouble(resultSet.getString(1)));
				listaDeCompras.add(compra);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaDeCompras;
	}
	
	public static double valorFinanceiroCompras() {
		double valorFinanceiro = 0;
		Statement statement;
		
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * from compras");
			while(resultSet.next()) {
				valorFinanceiro += Double.parseDouble(resultSet.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return valorFinanceiro;
	}
}
