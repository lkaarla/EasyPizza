package dao;

import modelEntidade.CadPedidoItem;

public interface CadPedidoItemDAO {
	
	public String incluir(CadPedidoItem cpi);
	public String excluir(String idPedido);
	public String alterar();
	public String consultar(CadPedidoItem cpi);

}
