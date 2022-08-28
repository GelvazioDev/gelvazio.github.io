<?php
	require "../../pattern/config.php";// carrega as constantes
	require "../../process/connectiondb.php";

	$pc = array(
		"prf_proCodigo" => $_POST['prf_proCodigo'],
		"prf_curCodigo" => $_POST['prf_curCodigo']
	);

	$grava = DBCreate('professor_curso', $pc);
	if($grava){
		echo ":-)";
		echo"<script>alert('Sucesso');</script>;";
	}else{
		echo ":/";
		echo"<script>alert('Falha');</script>;";
	}
	// echo '<meta http-equiv="refresh" content=1;url="../../gui/cad_pecas.php">';
?>
