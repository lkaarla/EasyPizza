package modelEntidade;

public class CadPedido {
	
	private String idPedido;
	private String idCliente;
	private double valorPedido;
	private String idFormPagamento;
	private double valorPago;
	private double troco;
	
	public String getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public double getValorPedido() {
		return valorPedido;
	}
	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}
	public String getIdFormPagamento() {
		return idFormPagamento;
	}
	public void setIdFormPagamento(String idFormPagamento) {
		this.idFormPagamento = idFormPagamento;
	}
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	public double getTroco() {
		return troco;
	}
	public void setTroco(double troco) {
		this.troco = troco;
	}
	
	

}
