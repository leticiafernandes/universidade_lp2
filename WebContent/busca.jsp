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
<link href="./resources/css/plugins/metisMenu/metisMenu.min.css" rel="stylesheet">
<link href="./resources/css/plugins/dataTables.bootstrap.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<h3>Busque por qualquer pessoa cadastrada na universidade!</h3>
				<hr>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="panel panel-info">
						<div class="panel-heading"></div>
						<div class="panel-body">
							<div class="table-responsive">
								<table class="table table-bordered table-hover" id="dataTables-example">
									<thead>
										<tr>
											<th>Nome</th>
											<th>Matrícula</th>
											<th>CPF</th>
											<th>Tipo do Usuário</th>
											<th>Ação</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${listaPessoas}" var="p">
											<tr>
												<td>${p.nome}</td>
												<td>${p.matricula}</td>
												<td>${p.cpf}</td>
												<td>${p.tipoPessoa}</td>
												<td>
													<button type="button" class="btn btn-danger">Excluir</button>
													<button type="button" class="btn btn-default">Alterar</button>
												</td>
											</tr>
										</c:forEach>
									<tbody>
	
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="./resources/js/jquery.js"></script>
	<script src="./resources/js/bootstrap.js"></script>
	<script src="./resources/js/metisMenu/metisMenu.min.js"></script>
	<script src="./resources/js/dataTables/jquery.dataTables.js"></script>
	<script src="./resources/js/dataTables/dataTables.bootstrap.js"></script>
	<script src="./resources/js/cadastro_pessoa.js"></script>
	<!-- Metis Menu Plugin JavaScript -->
	<script>
		$(document).ready(function() {
			$('#dataTables-example').dataTable();
		});
	</script>

</body>
</html>