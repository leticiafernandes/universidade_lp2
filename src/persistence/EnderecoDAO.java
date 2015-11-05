package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Endereco;

public class EnderecoDAO {
	
private Connection connection;
	
	public EnderecoDAO() throws ClassNotFoundException {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void incluir(Endereco endereco) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO ENDERECO (CEP, RUA, BAIRRO, COMPLEMENTO) VALUES (?, ?, ?, ?)");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		stmt.setString(1, endereco.getCep());
		stmt.setString(2, endereco.getRua());
		stmt.setString(3, endereco.getBairro());
		stmt.setString(4, endereco.getComplemento());
		
		try {
			//executando
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void alterar(Endereco endereco) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE ENDERECO SET CEP= ?, RUA= ?, BAIRRO= ?, COMPLEMENTO= ?");
		sql.append(" WHERE ID_ENDERECO= ?");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		stmt.setString(1, endereco.getCep());
		stmt.setString(2, endereco.getRua());
		stmt.setString(3, endereco.getBairro());
		stmt.setString(4, endereco.getComplemento());
		stmt.setInt(5, endereco.getIdEndereco());
		
		try {
			//executando
			stmt.execute();
			stmt.close();
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void excluir(Endereco endereco) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM ENDERECO WHERE ID_ENDERECO = ?");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		stmt.setInt(1, endereco.getIdEndereco());
		stmt.execute();
		stmt.close();
		
		try {
			//executando
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}