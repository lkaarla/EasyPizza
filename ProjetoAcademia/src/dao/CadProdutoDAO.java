package dao;

import modelEntidade.CadProduto;

public interface CadProdutoDAO {
	
	public String incluir(CadProduto cpr);
	public String excluir(String idProduto);
	public String alterar();
	public String consultar(CadProduto cpr);

}
