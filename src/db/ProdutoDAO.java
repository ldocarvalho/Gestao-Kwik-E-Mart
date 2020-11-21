package db;

import java.sql.*;
import java.util.ArrayList;

import model.CompraDeProdutos;
import model.Produto;

public class ProdutoDAO extends BancoDeDados {
	
	public static boolean verificaSeProdutoEstaNoEstoque(String codBarras) {
		Statement statement;
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM produtos WHERE cod_barras='" + codBarras + "'");
			if (resultSet.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean adicionaProdutoNoEstoque(Produto produto) {
		Statement statement;
		try {
			statement = conexao.createStatement();
			statement.executeUpdate("INSERT INTO produtos VALUES ('" + produto.getCodBarras() + "'," + 
																  " '" + produto.getDescricao() + "'," + 
																  " '" + produto.getQuantidade() + "'," + 
																  " '" + produto.getPreco() + "')");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static ArrayList<Produto> listaProdutosNoEstoque() {
		ArrayList<Produto> produtosNoEstoque = new ArrayList<Produto>();
		
		Statement statement;
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM produtos"); 
			while (resultSet.next()) {
				Produto produto = new Produto(resultSet.getString(1), resultSet.getString(2), Integer.parseInt(resultSet.getString(3)), Double.parseDouble(resultSet.getString(4)));
				produtosNoEstoque.add(produto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produtosNoEstoque;
	}
	
	public static boolean aumentaQuantidadeNoEstoque(String codBarras, int quantidade) {
		Statement statement;
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM produtos WHERE cod_barras='" + codBarras + "'");
			if (resultSet.next()) {
				int novaQuantidade = Integer.parseInt(resultSet.getString(3)) + quantidade;
				statement.executeUpdate("UPDATE produtos SET quantidade='" + novaQuantidade + "' WHERE cod_barras='" + codBarras + "'");
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean diminuiQuantidadeNoEstoque(String codBarras, int quantidade) {
		Statement statement;
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM produtos WHERE cod_barras='" + codBarras + "'");
			if (resultSet.next()) {
				int novaQuantidade = Integer.parseInt(resultSet.getString(3)) - quantidade;
				statement.executeUpdate("UPDATE produtos SET quantidade='" + novaQuantidade + "' WHERE cod_barras='" + codBarras + "'");
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static int numeroDeProdutosNoEstoque() {
		int numProdutos = 0;
		Statement statement;
		
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * from produtos");
			while(resultSet.next()) {
				numProdutos += Integer.parseInt(resultSet.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return numProdutos;
	}
	
	public static double valorFinanceiroDoEstoque() {
		double valorFinanceiro = 0;
		Statement statement;
		
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * from produtos");
			while(resultSet.next()) {
				valorFinanceiro += Integer.parseInt(resultSet.getString(3)) * Double.parseDouble(resultSet.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return valorFinanceiro;
	}
}
