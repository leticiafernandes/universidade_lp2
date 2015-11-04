package entity;

public class Turma {
	private Integer idTurma;
	private String nome;
	private String local;
	private String horario;
	private Disciplina disciplina;
	
	public Turma() {
		// TODO Auto-generated constructor stub
	}

	public Turma(Integer idTurma, String nome, String local, String horario, Disciplina disciplina) {
		super();
		this.idTurma = idTurma;
		this.nome = nome;
		this.local = local;
		this.horario = horario;
		this.disciplina = disciplina;
	}

	public Integer getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
}