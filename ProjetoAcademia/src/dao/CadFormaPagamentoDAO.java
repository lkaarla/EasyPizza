package dao;

import modelEntidade.CadFormaPagamento;

public interface CadFormaPagamentoDAO {

	public String Incluir(CadFormaPagamento cfp);
	public String Excluir(String idFormaPagamento);
	public String Alterar();
	public String Consultar(CadFormaPagamento cfp);
	
	
}
