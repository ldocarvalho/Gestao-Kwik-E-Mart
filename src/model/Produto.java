/*
* Classe Produto - Representa um produto na aplicação
* @author Lucas Carvalho 
* @version 1.0, 2020-11-08
*/

package model;

public class Produto {
	private String codBarras; /** Codigo de barras do produto */
	private String descricao; /** Descricao do produto */
	private int quantidade; /** Quantidade do produto */
	private double preco; /** Preco do produto */
	
	/*
	* Construtor da classe.
	*/
	public Produto() {
		
	}
	
	/**
	* Construtor da classe.
	* @param codBarras codigo de barras do produto
	* @param descricao descricao do produto
	* @param quantidade quantidade do produto
	* @param preco preco do produto
	* */
	public Produto(String codBarras, String descricao, int quantidade, double preco) {
		this.codBarras = codBarras;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	/**
	 * Pega o codigo de barras do produto
	 * @return String codigo de barras do produto
	 */
	public String getCodBarras() {
		return codBarras;
	}

	/**
	 * Adiciona o codigo de barras do produto
	 * @param codBarras codigo de barras do produto
	 */
	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	/**
	 * Pega a descricao do produto
	 * @return String descricao do produto 
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Adiciona a descricao do produto
	 * @param descricao descricao do produto
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Pega a quantidade do produto
	 * @return int quantidade do produto 
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * Adiciona a quantidade do produto
	 * @param quantidade quantidade do produto
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * Pega o preco do produto
	 * @return double preco do produto 
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * Adiciona o preco do produto
	 * @param preco preco do produto
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
