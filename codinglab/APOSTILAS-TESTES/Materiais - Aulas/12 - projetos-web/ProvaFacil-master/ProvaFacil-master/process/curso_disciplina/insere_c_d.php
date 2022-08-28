<?php
	require "../../pattern/config.php";// carrega as constantes
	require "../../process/connectiondb.php";

	$cd = array(
		"cud_curCodigo" => $_POST['cud_curCodigo'],
		"cud_disCodigo" => $_POST['cud_disCodigo']
	);

	$grava = DBCreate('curso_disciplina', $cd);
	if($grava){
		echo ":-)";
		echo"<script>alert('Sucesso');</script>;";
	}else{
		echo ":/";
		echo"<script>alert('Falha');</script>;";
	}
	// echo '<meta http-equiv="refresh" content=1;url="../../gui/cad_pecas.php">';
?>
