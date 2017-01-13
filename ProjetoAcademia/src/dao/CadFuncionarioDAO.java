package dao;

import modelEntidade.CadFuncionario;

public interface CadFuncionarioDAO {
	
	public String incluir(CadFuncionario cf);
	public String excluir(String IdFuncionario, String idLogin);
	public String alterar();
	public String consultar(CadFuncionario cf);
	

}
