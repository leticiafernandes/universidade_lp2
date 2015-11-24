package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Pessoa;
import persistence.PessoaDAO;

public class PessoaAction extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void incluir(HttpServletRequest request, HttpServletResponse response) throws
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
			pessoa.setMatricula(request.getParameter("matricula"));
			
			new PessoaDAO().incluir(pessoa);
			
		} catch (Exception e) {
			request.getRequestDispatcher("erro.jsp").forward(request, response);
		}
	}	
	
	
	protected void listarPessoas(HttpServletRequest request, HttpServletResponse response)throws
	ServletException, IOException{
		try {
			List<Pessoa> listaPessoas = new PessoaDAO().listarTodos(); 
			request.setAttribute("listaPessoas", listaPessoas);
		} catch (Exception e) {
			request.getRequestDispatcher("erro.jsp").forward(
					request, response);
		} finally {
				request.getRequestDispatcher("busca.jsp").forward(request, response);						
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			incluir(request, response);
		} catch (SQLException ex) {
			ex.getMessage();
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		try {
			listarPessoas(request, response);
		} catch (Exception ex) {
			ex.getMessage();
		} finally {
			request.getRequestDispatcher("busca.jsp").forward(request, response);						
		}
	}
}