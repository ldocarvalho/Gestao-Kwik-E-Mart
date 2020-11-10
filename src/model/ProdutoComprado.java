package model;

import enums.UnidadesMedida;

public class ProdutoComprado {
	private int codBarras;
	private String descricao;
	private double precoCompra;
	private double precoVenda;
	private int quantidadeComprada; 
	private UnidadesMedida unidadeMedida;
	
	public ProdutoComprado() {
	}
	
	public ProdutoComprado(int codBarras, String descricao, double precoCompra, double precoVenda, int quantidadeComprada, UnidadesMedida unidadeMedida) {
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

	public UnidadesMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadesMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	@Override
	public String toString() {
		return "ProdutoComprado [codBarras=" + codBarras + ", descricao=" + descricao + ", precoCompra=" + precoCompra
				+ ", precoVenda=" + precoVenda + ", quantidadeComprada=" + quantidadeComprada + ", unidadeMedida="
				+ unidadeMedida + "]";
	}
}
