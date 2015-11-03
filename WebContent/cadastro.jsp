<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
 	<link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap-theme.min.css" />
</head>
<body>
	<%@ include file="./layout.jsp"%>
	
	<!-- Inicio Modal Professor ou Aluno -->
	<div class="modal fade" id="tipoUsuario" role="dialog">
	    <div class="modal-dialog">
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal">&times;</button>
	          <h4 class="modal-title">Antes de se cadastrar na Universidade</h4>
	        </div>
	        <div class="modal-body">
       			<p>Informe:</p>
  				<form role="form">
    			<div class="checkbox">
      				<label><input type="checkbox" value="" required>Sou professor.</label>
    			</div>
    			<div class="checkbox">
      				<label><input type="checkbox" value="" required>Sou aluno.</label>
    			</div> 
    			</form>      			
	        </div>
	        <div class="modal-footer">
	          <button id="prosseguir" type="button" class="btn btn-default" onclick="verificarTipoUsuario();">Ok!</button>
	        </div>
	      </div>
	    </div>
	</div>
	<!-- Fim Modal Professor ou Aluno -->
  
      
	<!-- Inicio Formulário -->
	<div id="formulario" class="container" style="display:none;">
	    <div class="row">
	        <form role="form">
	            <div class="col-lg-12">
	                <div class="form-group">
	                    <label>Nome:</label>
	                    <div class="input-group">
	                        <input type="text" class="form-control" name="nome" id="nome" placeholder="Digite seu nome completo" required>
	                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
	                    </div>
	                </div>
	                <div class="form-group">
	                    <label>Email</label>
	                    <div class="input-group">
	                        <input type="email" class="form-control" id="email" name="email" placeholder="Digite seu email" required>
	                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
	                    </div>
	                </div>
	             </div>
	             <div class="col-lg-6">
	                <div class="form-group">
	                    <label>Telefone Residencial</label>
	                    <div class="input-group">
	                        <input type="text" class="form-control" id="telResidencial" name="telefone" placeholder="Digite seu telefone" required>
	                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
	                    </div>
	                </div>
	            </div>
	            <div class="col-lg-6">
	                <div class="form-group">
	                    <label>Telefone Celular</label>
	                    <div class="input-group">
	                        <input type="text" class="form-control" name="telefone" placeholder="Digite seu telefone" required>
	                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
	                    </div>
	                </div>
	            </div>
	            <div class="col-lg-6">
	                <div class="form-group">
	                    <label>Endereço:</label>
	                    <div class="input-group">
	                        <input type="text" class="form-control" name="endereco" id="endereco" placeholder="Digite seu endereço" required>
	                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
	                    </div>
	                </div>
               </div>
               <div class="col-lg-3">
	                <div class="form-group">
	                    <label>Bairro:</label>
	                    <div class="input-group">
	                        <input type="text" class="form-control" name="bairro" id="bairro" placeholder="Digite seu bairro" required>
	                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
	                    </div>
	                </div>
               </div>
               <div class="col-lg-3">
	                <div class="form-group">
	                    <label>Complemento:</label>
	                    <div class="input-group">
	                        <input type="text" class="form-control" name="complemento" id="complemento" placeholder="Ex: próximo ao hospital...">
	                    </div>
	                </div>
               </div>
               <div class="col-lg-12">
               	  <br/>
                  <input type="submit" name="enviar" id="submit" value="Enviar" class="btn btn-info pull-right">
               </div>
	        </form>
	    </div>
	    <br/>
	    <div class="row">
		    <div class="col-lg-12">
		    	<div class="well well-sm"><strong><span class="glyphicon glyphicon-asterisk"></span> Campo obrigatório</strong></div>
		    </div>
	    </div>
	</div>
	<!-- Fim Formulário -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="./resources/jquery/jquery-ui.min.js"></script>
	<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
	<script src="./resources/js/cadastro.js"></script>
</body>
</html>