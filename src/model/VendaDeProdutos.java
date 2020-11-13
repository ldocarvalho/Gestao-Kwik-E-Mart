package model;

import java.util.ArrayList;

public class VendaDeProdutos {
	private double totalCompra;
	private double totalPagamento;
	private double troco;
	private String formaPagamento;
	
	private ArrayList<Produto> produtosVendidos;
	
	public VendaDeProdutos() {
	}
	
	public VendaDeProdutos(double totalCompra, double totalPagamento, double troco, String formaPagamento) {
		this.totalCompra = totalCompra;
		this.totalPagamento = totalPagamento;
		this.troco = troco;
		this.formaPagamento = formaPagamento;
	}

	public double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}

	public double getTotalPagamento() {
		return totalPagamento;
	}

	public void setTotalPagamento(double totalPagamento) {
		this.totalPagamento = totalPagamento;
	}

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public ArrayList<Produto> getProdutosVendidos() {
		return produtosVendidos;
	}

	public void setProdutosVendidos(ArrayList<Produto> produtosVendidos) {
		this.produtosVendidos = produtosVendidos;
	}
	
	public void addProduto(Produto produto) {
		this.produtosVendidos.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		this.produtosVendidos.remove(produto);
	}
 }
