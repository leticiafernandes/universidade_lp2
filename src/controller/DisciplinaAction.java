package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Disciplina;
import persistence.DisciplinaDAO;

public class DisciplinaAction extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	
	protected void listarDisciplinas(HttpServletRequest request, HttpServletResponse response)throws
	ServletException, IOException{
		try {
			List<Disciplina> listaDisciplinas = new DisciplinaDAO().listarTodos(); 
			request.setAttribute("listaDisciplina", listaDisciplinas);
		} catch (Exception e) {
			request.getRequestDispatcher("erro.jsp").forward(
					request, response);
		}
	}
}