package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.ResultSet;

import entity.Endereco;
import entity.Pessoa;

public class PessoaDAO{
	
	private Connection connection;
	
	private EnderecoDAO enderecoDao;
	
	public PessoaDAO() throws ClassNotFoundException {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void incluir(Pessoa pessoa, Endereco endereco) throws SQLException{
		//pessoa
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO PESSOA (NOME, CPF, TELEFONE_UM, TELEFONE_DOIS, ID_ENDERECO)");
		sql.append(" VALUES (?, ?, ?, ?, ?)");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		stmt.setString(1, pessoa.getNome());
		stmt.setString(2, pessoa.getCpf());
		stmt.setString(3, pessoa.getTelefoneUm());
		stmt.setString(4, pessoa.getTelefoneDois());
		stmt.setInt(5, pessoa.getEndereco().getIdEndereco());
		
		//endereco
		enderecoDao.incluir(endereco);
		
		try {
			//executando
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Pessoa> listarTodos(Pessoa pessoa) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ID_PESSOA, NOME, CPF, TELEFONE_UM, TELEFONE_DOIS, E.CEP, E.RUA, E.BAIRRO, E.COMPLEMENTO");
		sql.append(" FROM PESSOA");
		sql.append(" INNER JOIN ENDERECO E ON E.ID_ENDERECO = PESSOA.ID_ENDERECO");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		ResultSet rs = (ResultSet) stmt.executeQuery();
		while(rs.next()){
			pessoa.setIdPessoa(rs.getInt("ID_PESSOA"));
			pessoa.setNome(rs.getString("NOME"));
			pessoa.setCpf(rs.getString("CPF"));
			pessoa.setTelefoneUm(rs.getString("TELEFONE_UM"));
			pessoa.setTelefoneDois(rs.getString("TELEFONE_DOIS"));
			//pessoa.setEndereco.(rs.getInt("ID_ENDERECO"));
		}
		return null;
	}
	
	public void alterar(Pessoa pessoa, Endereco endereco) throws SQLException{
		//pessoa
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE PESSOA SET NOME= ?, CPF=  ?, TELEFONE_UM=  ?, TELEFONE_DOIS=  ?, ID_ENDERECO= ?");
		sql.append(" WHERE ID_PESSOA = ?");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		stmt.setString(1, pessoa.getNome());
		stmt.setString(2, pessoa.getCpf());
		stmt.setString(3, pessoa.getTelefoneUm());
		stmt.setString(4, pessoa.getTelefoneDois());
		stmt.setInt(5, pessoa.getEndereco().getIdEndereco());
		stmt.setInt(6, pessoa.getIdPessoa());
		
		//endereco
		enderecoDao.incluir(endereco);
		
		try {
			//executando
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void excluir(Pessoa pessoa, Endereco endereco) throws SQLException{
		//pessoa
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM PESSOA WHERE ID_PESSOA = ?");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		stmt.setInt(1, pessoa.getIdPessoa());
		
		//endereco
		enderecoDao.excluir(endereco);
		
		try {
			//executando
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}