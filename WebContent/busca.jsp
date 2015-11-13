<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="./layout.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
 	<link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap-theme.min.css" />
 	<link rel="stylesheet" type="text/css" href="./resources/css/busca.css" />
</head>
<body>
	<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<h3>
				Busque por qualquer pessoa cadastrada na universidade!
			</h3>
			<form action="ListarPessoa" method="GET">
				<table class="table">
					<thead>
						<tr>
							<th>
								Nome
							</th>
							<th>
								CPF
							</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listaPessoas}" var="p">
							<tr>
								<td>${p.nome}</td>
							</tr>
							<tr>
								<td>${p.cpf}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</form>
		</div>
	</div>
</div>
	
	<script src="./resources/jquery/jquery-ui.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>