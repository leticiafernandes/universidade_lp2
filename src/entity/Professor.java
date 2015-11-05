package entity;

public class Professor extends Pessoa{
	private String matricula;
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(Integer idPessoa, String nome, String cpf, String telefoneUm, String telefoneDois,
			Endereco endereco, String matricula) {
		super(idPessoa, nome, cpf, telefoneUm, telefoneDois, endereco);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
