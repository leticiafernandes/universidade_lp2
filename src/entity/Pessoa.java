package entity;

public class Pessoa {
	private Integer idPessoa;
	private String nome;
	private String cpf;
	private String telefoneUm;
	private String telefoneDois;
	private Endereco endereco;
	
	public Pessoa(Integer idPessoa, String nome, String cpf, String telefoneUm, String telefoneDois,
			Endereco endereco) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.telefoneUm = telefoneUm;
		this.telefoneDois = telefoneDois;
		this.endereco = endereco;
	}

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}