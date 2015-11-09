package entity;

public class Pessoa {
	private Integer idPessoa;
	private String nome;
	private String cpf;
	private String telefoneUm;
	private String telefoneDois;
	private String tipoPessoa;
	private String cep;
	private String rua;
	private String bairro;
	private String complemento;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(Integer idPessoa, String nome, String cpf, String telefoneUm, String telefoneDois, String tipoPessoa,
			String cep, String rua, String bairro, String complemento) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.telefoneUm = telefoneUm;
		this.telefoneDois = telefoneDois;
		this.tipoPessoa = tipoPessoa;
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefoneUm() {
		return telefoneUm;
	}

	public void setTelefoneUm(String telefoneUm) {
		this.telefoneUm = telefoneUm;
	}

	public String getTelefoneDois() {
		return telefoneDois;
	}

	public void setTelefoneDois(String telefoneDois) {
		this.telefoneDois = telefoneDois;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
}