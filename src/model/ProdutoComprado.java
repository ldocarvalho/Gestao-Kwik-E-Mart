package model;

public class ProdutoComprado {
	private int codBarras;
	private String descricao;
	private double precoCompra;
	private double precoVenda;
	private int quantidadeComprada; 
	private String unidadeMedida;
	
	public ProdutoComprado() {
	}
	
	public ProdutoComprado(int codBarras, String descricao, double precoCompra, double precoVenda, int quantidadeComprada, String unidadeMedida) {
		this.codBarras = codBarras;
		this.descricao = descricao;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.quantidadeComprada = quantidadeComprada;
		this.unidadeMedida = unidadeMedida;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	
	
}
