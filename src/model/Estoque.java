package model;

public class Estoque {
	private int quantidadeProdutos;
	private double valorFinanceiroProdutos;
	private double lucroTotal;
	
	public Estoque() {
	}
	
	public Estoque(int quantidadeProdutos, double valorFinanceiroProdutos, double lucroTotal) {
		this.quantidadeProdutos = quantidadeProdutos;
		this.valorFinanceiroProdutos = valorFinanceiroProdutos;
		this.lucroTotal = lucroTotal;
	}

	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}

	public void setQuantidadeProdutos(int quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
	}

	public double getValorFinanceiroProdutos() {
		return valorFinanceiroProdutos;
	}

	public void setValorFinanceiroProdutos(double valorFinanceiroProdutos) {
		this.valorFinanceiroProdutos = valorFinanceiroProdutos;
	}

	public double getLucroTotal() {
		return lucroTotal;
	}

	public void setLucroTotal(double lucroTotal) {
		this.lucroTotal = lucroTotal;
	}

	@Override
	public String toString() {
		return "Estoque [quantidadeProdutos=" + quantidadeProdutos + ", valorFinanceiroProdutos="
				+ valorFinanceiroProdutos + ", lucroTotal=" + lucroTotal + "]";
	}
}
