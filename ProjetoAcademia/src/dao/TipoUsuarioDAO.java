package dao;

import modelEntidade.TipoUsuario;

public interface TipoUsuarioDAO {
	
	public String incluir(TipoUsuario tp);
	public String excluir (String idUsuario);
	public String alterar();
	public String consultar(TipoUsuario tp);
	
	

}
