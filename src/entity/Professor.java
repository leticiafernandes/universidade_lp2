package entity;

public class Professor extends Pessoa{
	private String matricula;
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	
	public Professor(String matricula) {
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
