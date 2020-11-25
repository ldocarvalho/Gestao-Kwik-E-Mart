/*
* Classe VendaDeProdutos - Representa uma venda de produtos na aplicação
* @author Lucas Carvalho 
* @version 1.0, 2020-11-08
*/

package model;

public class VendaDeProdutos {
	private double totalCompra; /** Total da venda */
	private double totalPagamento; /** Total de pagamento da venda */
	private double troco; /** Troco da venda */
	private String formaPagamento; /** Forma de pagamento */
		
	/*
	* Construtor da classe.
	*/
	public VendaDeProdutos() {
	}
	
	/**
	* Construtor da classe.
	* @param totalCompra valor total da venda
	* @param totalPagamento valor total do pagamento da venda
	* @param troco valor do troco da venda
	* @param formaPagamento forma de pagamento da venda
	* */
	public VendaDeProdutos(double totalCompra, double totalPagamento, double troco, String formaPagamento) {
		this.totalCompra = totalCompra;
		this.totalPagamento = totalPagamento;
		this.troco = troco;
		this.formaPagamento = formaPagamento;
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

	/**
	 * Pega o valor total do pagamento
	 * @return double valor total do pagamento 
	 */
	public double getTotalPagamento() {
		return totalPagamento;
	}

	/**
	 * Adiciona o valor total do pagamento
	 * @param totalPagamento valor total do pagamento
	 */
	public void setTotalPagamento(double totalPagamento) {
		this.totalPagamento = totalPagamento;
	}

	/**
	 * Pega o valor do troco
	 * @return double valor do troco 
	 */
	public double getTroco() {
		return troco;
	}

	/**
	 * Adiciona o valor total do troco
	 * @param troco valor do troco
	 */
	public void setTroco(double troco) {
		this.troco = troco;
	}

	/**
	 * Pega a forma de pagamento
	 * @return String forma de pagamento 
	 */
	public String getFormaPagamento() {
		return formaPagamento;
	}

	/**
	 * Adiciona a forma de pagamento
	 * @param formaPagamento forma de pagamento
	 */
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
 }
