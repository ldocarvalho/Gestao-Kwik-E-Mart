package db;

import java.sql.*;

import model.Produto;

public class ProdutoDAO extends BancoDeDados {
	
	public static boolean verificaSeProdutoEstaNoEstoque(String codBarras) {
		Statement statement;
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM produtos WHERE codBarras='" + codBarras + "'");
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
	
	public static void listaProdutosDoEstoque() {
		Statement statement;
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM produtos"); 
			while (resultSet.next()) {
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean aumentaQuantidadeNoEstoque(String codBarras, int quantidade) {
		Statement statement;
		try {
			statement = conexao.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM produtos WHERE codBarras='" + codBarras + "'");
			if (resultSet.next()) {
				int novaQuantidade = Integer.parseInt(resultSet.getString(3)) + quantidade;
				statement.executeUpdate("UPDATE produtos SET quantidade='" + novaQuantidade + "' WHERE cod_barras='" + codBarras + "')");
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
			ResultSet resultSet = statement.executeQuery("SELECT * FROM produtos WHERE codBarras='" + codBarras + "'");
			if (resultSet.next()) {
				int novaQuantidade = Integer.parseInt(resultSet.getString(3)) + quantidade;
				statement.executeUpdate("UPDATE produtos SET quantidade='" + novaQuantidade + "' WHERE cod_barras='" + codBarras + "')");
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
