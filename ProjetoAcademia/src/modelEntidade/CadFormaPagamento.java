package modelEntidade;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity


@Table (name = "CADFORMAPAGAMENTO")

public class CadFormaPagamento {
	
	@Column (name = "ID")
	@id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column (name = "DESCRICAO", lenght=50)
	private String descricao;
	
	
	public long getId(){
		return id;
}
	public void setId(long id){
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


/*
	
	private String idFormaPagamento;
	private String descForma;
	
	public String getIdFormaPagamento() {
		return idFormaPagamento;
	}
	public void setIdFormaPagamento(String idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}
	public String getDescForma() {
		return descForma;
	}
	public void setDescForma(String descForma) {
		this.descForma = descForma;
	}
	*/

}
