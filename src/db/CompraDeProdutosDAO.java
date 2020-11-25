/*
* Classe CompraDeProdutosDAO - Representa a manipulação dos obj CompraDeProdutos no BD
* @author Lucas Carvalho 
* @version 1.0, 2020-11-12
*/

package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.CompraDeProdutos;

public class CompraDeProdutosDAO extends BancoDeDados {
	
	/**
	 * Adiciona uma compra ao BD
	 * @param compra compra feita 
	 * @return boolean resultado da operacao
	 */
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
	
	/**
	 * Busca todas as compras salvas no BD 
	 * @return ArrayList lista com compras salvas no BD
	 */
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
	
	/**
	 * Busca pelo valor financeiro das compras salvas no BD
	 * @return double valor financeiro das compras salvas 
	 */
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
