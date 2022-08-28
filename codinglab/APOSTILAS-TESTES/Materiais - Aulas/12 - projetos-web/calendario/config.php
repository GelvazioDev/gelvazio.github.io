<?php

$servidor='localhost'; // URl do banco, ou local
$usuario='root'; // Usuario do banco de dados
$pass="AgenTAmunC"; // Senha do banco de dados
$bd='calendario'; // Nome do banco de dados


$conexion = new mysqli($servidor, $usuario, $pass, $bd);


$conexion->set_charset('utf8');


if ($conexion->connect_errno) {
	echo "Error ao se conectar com o banco de dados {$conexion->connect_errno}";
}


$base_url="http://localhost/calendario/";

?>
