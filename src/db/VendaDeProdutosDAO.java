/*
* Classe VendaDeProdutosDAO - Representa a manipulação dos obj VendaDeProdutos no BD
* @author Lucas Carvalho 
* @version 1.0, 2020-11-12
*/

package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.VendaDeProdutos;

public class VendaDeProdutosDAO extends BancoDeDados {
	
	/**
	 * Adiciona uma venda ao BD
	 * @param venda venda feita 
	 * @return boolean resultado da operacao
	 */
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
	
	/**
	 * Busca todas as vendas salvas no BD 
	 * @return ArrayList lista com vendas salvas no BD
	 */
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
	
	/**
	 * Busca pelo valor financeiro das vendas salvas no BD
	 * @return double valor financeiro das vendas salvas 
	 */
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
