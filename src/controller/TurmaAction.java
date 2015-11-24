package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Disciplina;
import entity.Turma;
import persistence.TurmaDAO;

public class TurmaAction extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void incluir(HttpServletRequest request, HttpServletResponse response) throws
	ServletException,IOException,SQLException {
	try {
		Turma turma = new Turma();
		turma.setNome(request.getParameter("nome"));
		turma.setLocal(request.getParameter("local"));
		turma.setHorario(request.getParameter("horario"));
		
		Disciplina disciplina = new Disciplina();
		disciplina.setIdDisciplina(new Integer(request.getParameter("disciplina")));
		
		turma.setDisciplina(disciplina);
		
		new TurmaDAO().incluir(turma);
	} catch (Exception e) {
		request.getRequestDispatcher("erro.jsp").forward(request, response);
	} finally {
		request.getRequestDispatcher("busca.jsp").forward(request, response);						
	}
}	
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			incluir(request, response);
		} catch (Exception ex){	
			request.getRequestDispatcher("erro.jsp").forward(request, response);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			new DisciplinaAction().listarDisciplinas(request, response);
		} catch (Exception ex){	
			request.getRequestDispatcher("erro.jsp").forward(request, response);
	} finally {
			request.getRequestDispatcher("cadastro_turma.jsp").forward(request, response);						
		}
	}
	
}