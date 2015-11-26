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
				<h3>Busque a turma que deseja encontrar:</h3>
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
											<th>Turma</th>
											<th>Disciplina</th>
											<th>Local</th>
											<th>Horario</th>
											<th>Ação</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${listaTurmas}" var="t">
											<tr>
												<td>${t.nome}</td>
												<td>${t.disciplina.nome}</td>
												<td>${t.local}</td>
												<td>${t.horario}</td>
												<td>
													<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#exclusao">Excluir</button>
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
	
	<!-- inicio modal confirmar exclusao -->
	<div class="modal fade" id="exclusao" tabindex="-1" role="dialog">
		<div class="modal-dialog" style="z-index: 9999;">
		  <div class="modal-content">
		    <div class="modal-header">
		      <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		      <h4 class="modal-title">Excluir</h4>
		    </div>
		    <div class="modal-body">
		      <p>Tem deseja que deseja excluir esta turma?</p>
		    </div>
		    <div class="modal-footer">
		      <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
		      <button type="button" class="btn btn-danger">Excluir</button>
		    </div>
		  </div>
		</div>
	</div>
	<!-- fim modal confirmar exclusao -->
	
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