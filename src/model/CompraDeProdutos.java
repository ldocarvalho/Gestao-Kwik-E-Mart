/*
* Classe CompraDeProdutos - Representa uma compra de produtos na aplicação
* @author Lucas Carvalho 
* @version 1.0, 2020-11-08
*/

package model;

public class CompraDeProdutos {
	private double totalCompra; /** Valor total da compra */
	
	/*
	* Construtor da classe.
	*/
	public CompraDeProdutos() {
	}
	
	/*
	* Construtor da classe.
	* @param totalCompra valor total da compra
	*/
	public CompraDeProdutos(double totalCompra) {
		this.totalCompra = totalCompra;
	}

	/**
	 * Pega o valor total da compra
	 * @return double valor total da compra 
	 */
	public double getTotalCompra() {
		return totalCompra;
	}

	/**
	 * Adiciona o valor total da compra
	 * @param totalCompra valor total da compra
	 */
	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}
}
