<html>
<head>
<?php
session_start();
require "../../pattern/config.php"; // carrega as constantes
require "../../process/connection_operations.php";
?>
<script type="text/javascript">
var x = new Array("");
	
var Brasil = new Array(
<?php
	$cursos = (DBReadSql("SELECT curNome, curCodigo FROM professor JOIN professor_curso JOIN curso WHERE proCodigo = prf_proCodigo AND curCodigo = prf_curCodigo AND proEmail = '".$email."'"));
	for ($i = 0; $i < count($cursos); $i++) {
						 
		print_r ("$cursos[$i]['curNome']"." ,");
						
	}
?>
);

var Argentina = new Array("Buenos Aires","Chaco","Catamarca","Chubut","Córdoba","Corrientes","Entre Ríos","Formosa","Jujuy","La Pampa","La Rioja","Mendoza","Misiones","Neuquén","Río Negro","Salta","San Juan","San Luis","Santa Cruz","Santa Fe","Santiago del Estero","Tierra del Fuego","Tucumán");

var Paraguai = new Array("Departamento Alto Paraguay","Departamento Alto Paraná","Departamento Amambay","Distrito Capital","Departamento Boquerón","Departamento Caaguazú","Departamento Caazapá","Departamento Canindeyú","Departamento Central","Departamento de Concepción","Departamento Cordillera","Departamento Guairá","Departamento Itapúa","Departamento Misiones","Departamento Ñeembucú","Departamento Paraguarí","Departamento Presidente Hayes","Departamento San Pedro");

//Outra opção é deixar a primeira opção em branco. Exemplo:
//var Argentina = new Array("","Cidade de Buenos...


function loadList(v) {
var objSpan1 = document.getElementById("estado");
var listaEscolhida = eval(v);
/*
if (listaEscolhida==x) {
	objSpan1.style.display = "none";
}else{
	objSpan1.style.display = "block";
}
*/

document.form1.sEstado.options.length = listaEscolhida.length;
	for (i=0; i<listaEscolhida.length; i++) {
		document.form1.sEstado.options[i] = new Option(listaEscolhida[i], listaEscolhida[i]);
	}
}

function resetLists() {
	loadList("x");
	document.form1.sPais.options[0].selected = true;
}
window.onload = resetLists;
</script>
</head>
<body>
<form name="form1" method="post" action="echo_post.php">
País: <select name="sPais" onchange="loadList(this.value)" size="1">
<option value="x" selected></option>
<option value="Argentina">Argentina</option>
<option value="Brasil">Brasil</option>
<option value="Paraguai">Paraguai</option>
</select>

<span id="estado">
<br><br>Estados ou Distritos:
<select name="sEstado" size="1"></select></span>
</form>
</body>
</html>