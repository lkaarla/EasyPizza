package modelEntidade;

public class CadCliente {

	private String idCliente; 
	private String idLogin; 
	private String nome;
	private String cidade;
	private String bairro; 
	private String endereco; 
	private String complemento;
	
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(String idLogin) {
		this.idLogin = idLogin;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public int getNumImovel() {
		return numImovel;
	}
	public void setNumImovel(int numImovel) {
		this.numImovel = numImovel;
	}
	public int getContatoUm() {
		return contatoUm;
	}
	public void setContatoUm(int contatoUm) {
		this.contatoUm = contatoUm;
	}
	public int getContatoDois() {
		return contatoDois;
	}
	public void setContatoDois(int contatoDois) {
		this.contatoDois = contatoDois;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private int numImovel; 
	private int contatoUm;
	private int contatoDois;
	private String email; 
	
	



}
