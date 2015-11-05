package entity;

public class Aluno extends Pessoa{
	private String matricula;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(String matricula) {
		super();
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}