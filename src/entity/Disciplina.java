package entity;

import java.util.List;

public class Disciplina {
	private Integer idDisciplina;
	private String nome;
	private List<Turma> turmas;
	
	public Disciplina() {
		// TODO Auto-generated constructor stub
	}

	public Disciplina(Integer idDisciplina, String nome, List<Turma> turmas) {
		super();
		this.idDisciplina = idDisciplina;
		this.nome = nome;
		this.turmas = turmas;
	}

	public Integer getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Integer idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
}