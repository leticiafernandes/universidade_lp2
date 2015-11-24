<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ include file="./layout.jsp"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
 	<link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap-theme.min.css" />
</head>
<body>
	<!-- Inicio Formulário -->
	<div id="formulario" class="container">
		<div class="row">
			<form action="InserirTurma" method="POST">
			    <div class="row">
		            <div class="col-lg-4">
		                <div class="form-group">
		                    <label>Nome de identificação da turma:</label>
		                    <div class="input-group">
		                        <input type="text" class="form-control" name="nome" id="nome" placeholder="Digite um nome de identificação da turma" required>
		                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
		                    </div>
		                </div>
		             </div>
		             <div class="col-lg-4">
			             <div class="form-group">
						    <label>Disciplina</label>
						    <select name="disciplina" class="form-control">
						       <option value="">Escolher</option>
						       <c:forEach var="d" items="${listaDisciplina}"> 
						          <option value="${d.idDisciplina}">
						             <c:out value="${d.nome}" /> 
						          </option> 
						       </c:forEach> 
						    </select>
					    </div>
		            </div>
		        </div>
		        <div class="row">
		             <div class="col-lg-4">
		                <div class="form-group">
		                    <label>Local</label>
		                    <div class="input-group">
		                        <input type="text" class="form-control" id="local" name="local" placeholder="Digite em que sala a aula será aplicada" required>
		                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
		                    </div>
		                </div>
		            </div>
		            <div class="col-lg-4">
		                <div class="form-group">
		                    <label>Horário:</label>
		                    <div class="input-group">
		                        <input type="text" class="form-control" name="horario" id="horario" placeholder="Digite o horário" required>
		                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
		                    </div>
		                </div>
	               </div>
		        </div>
		        <div class="row">
		        	<div class="col-lg-4">

		        	</div>
		        </div>
			    <br/>
			    <div class="row">
			    	<div class="col-lg-8">
				    	<div class="well well-sm"><strong><span class="glyphicon glyphicon-asterisk"></span> Campo obrigatório</strong></div>
				    </div>
			    </div>
			    <div class="row">
			    	<div class="col-lg-8">
		                  <input type="submit" name="enviar" id="submit" value="Enviar" class="btn btn-info pull-right">
		            </div>
				</div>  
			</form> 
		</div>        
	</div>
	<!-- Fim Formulário -->
	<script src="./resources/js/cadastro.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="./resources/jquery/jquery-ui.min.js"></script>
	<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>