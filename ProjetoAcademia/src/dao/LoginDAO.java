package dao;

import modelEntidade.Login;

public interface LoginDAO {
	
	public String incluir(Login l);
	public String excluir(String idLogin);
	public String alterar();
	public String consultar(Login l);
	
	

}
