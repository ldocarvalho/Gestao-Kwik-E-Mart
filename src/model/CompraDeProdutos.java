package model;

public class CompraDeProdutos {
	private double totalCompra;
	
	public CompraDeProdutos() {
	}
	
	public CompraDeProdutos(double totalCompra) {
		this.totalCompra = totalCompra;
	}

	public double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}
}
