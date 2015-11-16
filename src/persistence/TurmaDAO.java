package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSet;

import entity.Turma;

public class TurmaDAO {

	private Connection connection;
	
	public TurmaDAO() throws ClassNotFoundException {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void incluir(Turma turma) throws SQLException, ClassNotFoundException{
		//pessoa
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO TURMA (NOME_TURMA, LOCAL, HORARIO, ID_DISCIPLINA, ID_PESSOA)");
		sql.append(" VALUES (?, ?, ?, ?, ?)");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		stmt.setString(1, turma.getNome());
		stmt.setString(2, turma.getLocal());
		stmt.setString(3, turma.getHorario());
		stmt.setInt(4, turma.getDisciplina().getIdDisciplina());
		stmt.setInt(5, turma.getPessoa().getIdPessoa());

		try {
			//executando
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Turma> listarTodos() throws SQLException {
		List<Turma> listaTurma = new ArrayList<Turma>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ID_TURMA, NOME_TURMA, LOCAL, HORARIO");
		sql.append(" FROM TURMA");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		ResultSet rs = (ResultSet) stmt.executeQuery();
		while(rs.next()){
			Turma turma = new Turma();
			turma.setIdTurma(rs.getInt("ID_TURMA"));
			turma.setNome(rs.getString("NOME_TURMA"));
			turma.setLocal(rs.getString("LOCAL"));
			turma.setHorario(rs.getString("HORARIO"));
			
			listaTurma.add(turma);
		}
		
		rs.close();
		stmt.close();
		
		return listaTurma;
	}
	
	public void alterar(Turma turma) throws SQLException, ClassNotFoundException{
		//pessoa
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE TURMA SET NOME_TURMA= ?, LOCAL=  ?, HORARIO=  ?, ID_DISCIPLINA=  ?, ID_PESSOA= ?");
		sql.append(" WHERE ID_TURMA = ?");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		stmt.setString(1, turma.getNome());
		stmt.setString(2, turma.getLocal());
		stmt.setString(3, turma.getHorario());
		stmt.setInt(4, turma.getDisciplina().getIdDisciplina());
		stmt.setInt(5, turma.getPessoa().getIdPessoa());
		stmt.setInt(6, turma.getIdTurma());
		
		try {
			//executando
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void excluir(Turma turma) throws SQLException, ClassNotFoundException{
		//pessoa
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM TURMA WHERE ID_PESSOA = ?");
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		stmt.setInt(1, turma.getIdTurma());
		
		try {
			//executando
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}