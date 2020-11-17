package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.VendaDeProdutos;

public class VendaDeProdutosDAO extends BancoDeDados {
	public static boolean adicionaVenda(VendaDeProdutos venda) {
		Statement statement;
		try {
			statement = conexao.createStatement();
			statement.executeUpdate("INSERT INTO vendas VALUES ('" + venda.getTotalCompra() + "'," + 
																  " '" + venda.getTotalPagamento() + "'," + 
																  " '" + venda.getTroco() + "'," + 
																  " '" + venda.getFormaPagamento() + "')");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static ArrayList<VendaDeProdutos> listaVendas() {
		ArrayList<VendaDeProdutos> listaDeVendas = new ArrayList<VendaDeProdutos>();
 		Statement statement;
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM vendas"); 
			while (resultSet.next()) {
				VendaDeProdutos venda = new VendaDeProdutos(Double.parseDouble(resultSet.getString(1)), Double.parseDouble(resultSet.getString(2)), Double.parseDouble(resultSet.getString(3)), resultSet.getString(4));
				listaDeVendas.add(venda);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaDeVendas;
	}
	
	public static double valorFinanceiroVendas() {
		double valorFinanceiro = 0;
		Statement statement;
		
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * from vendas");
			while(resultSet.next()) {
				valorFinanceiro += Double.parseDouble(resultSet.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return valorFinanceiro;
	}
}
