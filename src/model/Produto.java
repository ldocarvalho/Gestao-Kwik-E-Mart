package model;

public class Produto {
	private String codBarras;
	private String descricao;
	private int quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String codBarras, String descricao, int quantidade) {
		this.codBarras = codBarras;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [codBarras=" + codBarras + ", descricao=" + descricao + ", quantidade=" + quantidade + "]";
	}
}
