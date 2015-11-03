 $(window).load(function(){
    $("#tipoUsuario").modal("show");
});
 
function verificarTipoUsuario(){
	$("#tipoUsuario").modal("hide");
	
	if ( $("#formulario").is(":hidden")) {
		  $("#formulario").slideDown("slow");
	} else {
		  $("#formulario").hide();
	}
}