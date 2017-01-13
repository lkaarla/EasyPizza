package modelEntidade;

public class CadPedidoItem {
	
	private String idPedido;
	private String idProduto;
	private double precoUnitario;
	private int quantVendida;
	
	public String getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}
	public String getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public int getQuantVendida() {
		return quantVendida;
	}
	public void setQuantVendida(int quantVendida) {
		this.quantVendida = quantVendida;
	}

}
