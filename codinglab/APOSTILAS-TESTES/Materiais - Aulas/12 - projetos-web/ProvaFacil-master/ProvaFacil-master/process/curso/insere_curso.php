<?php
	require "../../pattern/config.php";// carrega as constantes
	require "../../process/connectiondb.php";

  $curso = array("curNome" => 0);
	$curso = array(
		"curNome" => $_POST['curNome']
	);

	$grava = DBCreate('curso', $curso);
	if($grava){
		echo ":-)";
		echo"<script>alert('Sucesso');</script>;";
	}else{
		echo ":/";
		echo"<script>alert('Falha');</script>;";
	}
	echo '<meta http-equiv="refresh" content=1;url="..\..\pages\cad_curso.html">';
?>
