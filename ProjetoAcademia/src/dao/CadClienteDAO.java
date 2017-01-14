package dao;
/*
 * 
 */
import modelEntidade.CadCliente;

public interface CadClienteDAO {
	
	public String incluir(CadCliente cc);
	public String excluir ( String idCliente, String idLogin);
	public String alterar();
	public String consultar();
	

}
