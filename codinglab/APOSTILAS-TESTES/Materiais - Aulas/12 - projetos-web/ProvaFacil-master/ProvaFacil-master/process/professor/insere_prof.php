<?php
	require "../../pattern/config.php";// carrega as constantes
	require "../../process/connection_operations.php";

	$prof = array('proNome' => 0,'proSenha' => 0,'proEmail' => 0);

	$prof = array(
		'proNome' => $_POST['proNome'],
		'proSenha' => $_POST['proSenha'],
		'proEmail' => $_POST['proEmail']
	);


	$grava = DBCreate('professor', $prof);
	if($grava){
		echo ":-)";
		echo"<script>alert('Sucesso');</script>;";
	}else{
		echo ":/";
		echo"<script>alert('Falha');</script>;";
	}
	echo '<meta http-equiv="refresh" content=1;url="..\..\login.php">';
?>
