<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./layout.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
 	<link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap-theme.min.css" />
 	<link rel="stylesheet" type="text/css" href="./resources/css/cadastro_pessoa.css" />
</head>
<body>
	<!-- Inicio Formulário -->
	<div id="formulario" class="container">
	    <div class="row">
	        <form action="InserirPessoa" method="POST">
	        		<div class="row">
		            	<div class="col-lg-6">
			            	<div class="form-group">
							    <label>Eu sou: </label>
							    <input type="hidden" value="idPessoa" name="idPessoa">
							    <select name="tipoPessoa" class = "form-control">
							       <option value="">Escolher</option>
							       <option value="Aluno">Aluno</option>
							       <option value="Professor">Professor</option>
							    </select>
						    </div>
					    </div>
					    <div class="col-lg-6">
						    <div class="form-group">
							     <label>Matrícula:</label>
							     <div class="input-group">
		                         	<input type="text" class="form-control" name="matricula" id="matricula" placeholder="Digite sua matrícula" required>
		                         	<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
			                    </div>
						    </div>
					    </div>
				    </div>
	            	<div class="row">
		                <div class="col-lg-6">
		                	<div class="form-group">
			                    <label>Nome:</label>
			                    <div class="input-group">
			                        <input type="text" class="form-control" name="nome" id="nome" placeholder="Digite seu nome completo" required>
			                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
			                    </div>
		                    </div>
		                </div>
		                <div class="col-lg-6">
		                	<div class="form-group">
			                    <label>CPF</label>
			                    <div class="input-group">
			                        <input type="text" class="form-control" id="cpf" name="cpf" placeholder="Digite seu cpf" required>
			                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
			                    </div>
		                    </div>
		                </div>
	                </div>
	             <div class="row">
		             <div class="col-lg-6">
		            	<div class="form-group">
		                    <label>Telefone Residencial</label>
		                    <div class="input-group">
		                        <input type="text" class="form-control" id="telResidencial" name="telefoneUm" placeholder="Digite seu telefone" required>
		                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
		                    </div>
	                    </div>
		            </div>
		            <div class="col-lg-6">
		            	<div class="form-group">
		                    <label>Telefone Celular</label>
		                    <div class="input-group">
		                        <input type="text" class="form-control" name="telefoneDois" placeholder="Digite seu telefone" required>
		                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
		                	</div>
	                	</div>
		            </div>
	            </div>
	            <div class="row">
		            <div class="col-lg-4">
		            	<div class="form-group">
		                    <label>Rua:</label>
		                    <input type="hidden" value="idEndereco" name="idEndereco">
		                    <div class="input-group">
		                        <input type="text" class="form-control" name="rua" id="rua" placeholder="Digite o nome de sua rua" required>
		                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
		                    </div>
                    	</div>
	               </div>
	               <div class="col-lg-4">
	               		<div class="form-group">
		                    <label>CEP:</label>
		                    <div class="input-group">
		                        <input type="text" class="form-control" name="cep" id="cep" placeholder="Digite o seu cep" required>
		                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
		                    </div>
	               		</div>
	               </div>
	               <div class="col-lg-4">
	               		<div class="form-group">
		                    <label>Complemento:</label>
		                    <div class="input-group">
		                        <input type="text" class="form-control complemento" name="complemento" id="complemento" placeholder="Ex: próximo ao hospital...">
		                    </div>
	                    </div>
	               </div>
               </div>
               <div class="row">
                  <div class="col-lg-6">
			    	   <div class="form-group">
			    	      <label>Bairro:</label>
			    	      <input type="text" class="form-control" name="bairro" id="bairro" placeholder="Digite seu bairro">
			    	   </div>
		          </div>
               </div>
               <div class="row">
               	   <div class="form-group">
			    	   <div class="col-lg-6">
			    			<div class="well well-sm"><strong><span class="glyphicon glyphicon-asterisk"></span> Campo obrigatório</strong></div>
				        </div>
				        <div class="col-lg-6">
		                  <input type="submit" id="enviar" value="Enviar" class="btn btn-info pull-right">
		               </div>
	    			</div>
	    		</div>
        	</form>
    	</div>
    </div>
	<!-- Fim Formulário -->
	<script src="./resources/jquery/jquery-ui.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
	<script src="./resources/js/cadastro.js"></script>
</body>
</html>