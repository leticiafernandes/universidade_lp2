package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSet;

import entity.Pessoa;

public class PessoaDAO{
	
	private Connection connection;
	
	public PessoaDAO() throws ClassNotFoundException {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void incluir(Pessoa pessoa) throws SQLException, ClassNotFoundException{
		//pessoa
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO PESSOA (NOME, CPF, TELEFONE_UM, TELEFONE_DOIS, TIPO_PESSOA, CEP, RUA, BAIRRO, COMPLEMENTO)");
		sql.append(" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		stmt.setString(1, pessoa.getNome());
		stmt.setString(2, pessoa.getCpf());
		stmt.setString(3, pessoa.getTelefoneUm());
		stmt.setString(4, pessoa.getTelefoneDois());
		stmt.setString(5, pessoa.getTipoPessoa());
		stmt.setString(6, pessoa.getCep());
		stmt.setString(7, pessoa.getRua());
		stmt.setString(8, pessoa.getBairro());
		stmt.setString(9, pessoa.getComplemento());
		
		try {
			//executando
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Pessoa> listarTodos(Pessoa pessoa) throws SQLException {
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ID_PESSOA, NOME, CPF, TELEFONE_UM, TELEFONE_DOIS, TIPO_PESSOA, CEP, RUA, BAIRRO, COMPLEMENTO");
		sql.append(" FROM PESSOA");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		ResultSet rs = (ResultSet) stmt.executeQuery();
		while(rs.next()){
			pessoa = new Pessoa();
			pessoa.setIdPessoa(rs.getInt("ID_PESSOA"));
			pessoa.setNome(rs.getString("NOME"));
			pessoa.setCpf(rs.getString("CPF"));
			pessoa.setTelefoneUm(rs.getString("TELEFONE_UM"));
			pessoa.setTelefoneDois(rs.getString("TELEFONE_DOIS"));
			pessoa.setTipoPessoa(rs.getString("TIPO_PESSOA"));
			pessoa.setCep(rs.getString("CEP"));
			pessoa.setRua(rs.getString("RUA"));
			pessoa.setBairro(rs.getString("BAIRRO"));
			pessoa.setComplemento(rs.getString("COMPLEMENTO"));
			
			listaPessoa.add(pessoa);
		}
		
		rs.close();
		stmt.close();
		
		return listaPessoa;
	}
	
	public void alterar(Pessoa pessoa) throws SQLException, ClassNotFoundException{
		//pessoa
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE PESSOA SET NOME= ?, CPF=  ?, TELEFONE_UM=  ?, TELEFONE_DOIS=  ?, TIPO_PESSOA= ?, CEP= ?, RUA= ?, BAIRRO= ?,COMPLEMENTO= ?");
		sql.append(" WHERE ID_PESSOA = ?");
		
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		
		stmt.setString(1, pessoa.getNome());
		stmt.setString(2, pessoa.getCpf());
		stmt.setString(3, pessoa.getTelefoneUm());
		stmt.setString(4, pessoa.getTelefoneDois());
		stmt.setString(5, pessoa.getTipoPessoa());
		stmt.setString(6, pessoa.getCep());
		stmt.setString(7, pessoa.getRua());
		stmt.setString(8, pessoa.getBairro());
		stmt.setString(9, pessoa.getComplemento());
		stmt.setInt(10, pessoa.getIdPessoa());
		
		try {
			//executando
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void excluir(Pessoa pessoa) throws SQLException, ClassNotFoundException{
		//pessoa
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM PESSOA WHERE ID_PESSOA = ?");
		PreparedStatement stmt = connection.prepareStatement(sql.toString());
		stmt.setInt(1, pessoa.getIdPessoa());
		
		try {
			//executando
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}