<?php
	require "../../pattern/config.php";// carrega as constantes
	require "../../process/connection_operations.php";
	
	$queCodigo = "queCodigo = ".$_POST['queCodigo'];
        
	$exclui = DBDelete('questao', $queCodigo);
	if($exclui){
		echo ":-)";
		echo"<script>alert('Sucesso');</script>;";
	}else{
		echo ":/";
		echo"<script>alert('Falha');</script>;";
	}
	echo '<meta http-equiv="refresh" content=1;url="..\..\pages\visualizarprovas.php">';
?>