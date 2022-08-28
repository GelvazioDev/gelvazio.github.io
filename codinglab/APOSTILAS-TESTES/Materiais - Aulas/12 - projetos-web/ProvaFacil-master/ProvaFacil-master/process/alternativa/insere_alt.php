<?php
	require "../../pattern/config.php";// carrega as constantes
	require "../../process/connectiondb.php";

	$alternativas1 = array("altCorreta" => 0, "alt_queCodigo" => 0, "altText" => 0);
	$alternativas2 = array("altCorreta" => 0, "alt_queCodigo" => 0, "altText" => 0);
	$alternativas3 = array("altCorreta" => 0, "alt_queCodigo" => 0, "altText" => 0);
	$alternativas4 = array("altCorreta" => 0, "alt_queCodigo" => 0, "altText" => 0);

	$alternativas1 = array(
		"altCorreta" => $_POST['altCorreta'],
		"alt_queCodigo" => $_POST['alt_queCodigo'],
		"altText" => $_POST['altText1']
	);
	$alternativas2 = array(
		"altCorreta" => $_POST['altCorreta'],
		"alt_queCodigo" => $_POST['alt_queCodigo'],
		"altText" => $_POST['altText2']
	);
	$alternativas3 = array(
		"altCorreta" => $_POST['altCorreta'],
		"alt_queCodigo" => $_POST['alt_queCodigo'],
		"altText" => $_POST['altText3']
	);
	$alternativas4 = array(
		"altCorreta" => $_POST['altCorreta'],
		"alt_queCodigo" => $_POST['alt_queCodigo'],
		"altText" => $_POST['altText4']
	);

	$grava1 = DBCreate('alternativa', $alternativas1);
	$grava2 = DBCreate('alternativa', $alternativas2);
	$grava3 = DBCreate('alternativa', $alternativas3);
	$grava4 = DBCreate('alternativa', $alternativas4);

	if($grava1 && $grava2 && $grava3 && $grava4){
		echo ":-)";
		echo"<script>alert('Sucesso');</script>;";
	}else{
		echo ":/";
		echo"<script>alert('Falha');</script>;";
	}
	echo '<meta http-equiv="refresh" content=1;url="..\..\pages\cad_alt.html">';
?>
