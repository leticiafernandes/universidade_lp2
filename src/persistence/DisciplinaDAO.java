package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSet;

import entity.Disciplina;

public class DisciplinaDAO {
	
	private Connection connection;
	
	public DisciplinaDAO() throws ClassNotFoundException {
		this.connection = new ConnectionFactory().getConnection();
	}

	public List<Disciplina> listarTodos() throws SQLException {
		List<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ID_DISCIPLINA, NOME FROM DISCIPLINA");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		ResultSet rs = (ResultSet) stmt.executeQuery();
		while(rs.next()){
			Disciplina disciplina = new Disciplina();
			disciplina.setIdDisciplina(rs.getInt("ID_DISCIPLINA"));
			disciplina.setNome(rs.getString("NOME"));
			
			listaDisciplina.add(disciplina);
		}
		
		rs.close();
		stmt.close();
		
		return listaDisciplina;
	}
	
}
