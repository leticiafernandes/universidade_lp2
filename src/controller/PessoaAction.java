package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Pessoa;
import persistence.PessoaDAO;

public class PessoaAction extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
		ServletException,IOException,SQLException {
		try {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(request.getParameter("nome"));
			pessoa.setCpf(request.getParameter("cpf"));
			pessoa.setTelefoneUm(request.getParameter("telefoneUm"));
			pessoa.setTelefoneDois(request.getParameter("telefoneDois"));
			pessoa.setTipoPessoa(request.getParameter("tipoPessoa"));
			pessoa.setCep(request.getParameter("cep"));
			pessoa.setRua(request.getParameter("rua"));
			pessoa.setBairro(request.getParameter("bairro"));
			pessoa.setComplemento(request.getParameter("complemento"));
			
			new PessoaDAO().incluir(pessoa);
		} catch (Exception e) {
			e.getMessage();
		}
	}	
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			processRequest(request, response);
		} catch (SQLException ex) {
			
		} catch (Exception ex) {
			
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			processRequest(request, response);
		} catch (SQLException ex) {

		} catch (Exception ex) {
		
		}
	}
}