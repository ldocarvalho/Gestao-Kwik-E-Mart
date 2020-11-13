package model;

public class VendaDeProdutos {
	private double totalCompra;
	private double totalPagamento;
	private double troco;
	private String formaPagamento;
		
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
 }
