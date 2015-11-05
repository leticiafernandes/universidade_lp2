package entity;

public class Aluno extends Pessoa{
	private String matricula;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(Integer idPessoa, String nome, String cpf, String telefoneUm, String telefoneDois, Endereco endereco,
			String matricula) {
		super(idPessoa, nome, cpf, telefoneUm, telefoneDois, endereco);
		this.setMatricula(matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}