package dao;

import modelEntidade.CadPedido;

public interface CadPedidoDAO {
	
	public String incluir(CadPedido cp);
	public String excluir(String idPedido);
	public String alterar();
	public String consultar(CadPedido cp);
	
	

}
