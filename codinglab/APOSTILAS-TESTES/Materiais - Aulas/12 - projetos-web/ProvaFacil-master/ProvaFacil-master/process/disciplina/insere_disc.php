<?php
	require "../../pattern/config.php";// carrega as constantes
	require "../../process/connectiondb.php";

	$disc = array("disNome"=> 0, "disAbreviacao" => 0);
	$disc = array(
		"disNome" => $_POST['disNome'],
		"disAbreviacao" => $_POST['disAbreviacao']
	);

	$grava = DBCreate('disciplina', $disc);
	if($grava){
		echo ":-)";
		echo"<script>alert('Sucesso');</script>;";
	}else{
		echo ":/";
		echo"<script>alert('Falha');</script>;";
	}
	echo '<meta http-equiv="refresh" content=1;url="..\..\process\disciplina\insere_disc.php">';
?>
