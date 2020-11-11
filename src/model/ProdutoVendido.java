package model;

public class ProdutoVendido {
	private int codBarras;
	private int quantidade;
	private double totalCompra;
	private double totalPagamento;
	private double troco;
	private String formaPagamento;
	
	public ProdutoVendido() {
		
	}
	
	public ProdutoVendido(int codBarras, int quantidade, double totalCompra, double totalPagamento, double troco, String formaPagamento) {
		this.codBarras = codBarras;
		this.quantidade = quantidade;
		this.totalCompra = totalCompra;
		this.totalPagamento = totalPagamento;
		this.troco = troco;
		this.formaPagamento = formaPagamento;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
