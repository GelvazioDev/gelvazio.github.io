<?php
	require "../../pattern/config.php";// carrega as constantes
	require "../../process/connectiondb.php";
	$tema = array("temNome"=> 0, "tem_disCodigo" => 0);
	$tema = array(
		"temNome" => $_POST['temNome'],
		"tem_disCodigo" => $_POST['tem_disCodigo']
	);

	$grava = DBCreate('tema', $tema);
	if($grava){
		echo ":-)";
		echo"<script>alert('Sucesso');</script>;";
	}else{
		echo ":/";
		echo"<script>alert('Falha');</script>;";
	}
	echo '<meta http-equiv="refresh" content=1;url="..\..\pages\cad_tema.html">';
?>
