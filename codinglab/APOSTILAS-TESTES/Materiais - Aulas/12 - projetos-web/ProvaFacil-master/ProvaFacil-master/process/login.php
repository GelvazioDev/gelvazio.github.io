<?php
	require "../pattern/config.php";// carrega as constantes
	require "connection.php";

  $usuario = DBRead("professor", "WHERE proEmail = '".$_POST["proEmail"]."' AND proSenha='".$_POST["proSenha"]."'");
  var_dump($usuario);
  if ($usuario){
    echo 'entrou!';
    session_start();
    $_SESSION["proEmail"] = $_POST["proEmail"];
    echo '<meta http-equiv="refresh" content=0;url="../index1.php">';
  } else {
    echo 'não entrou!';
    echo "<script>alert('Falha ao autenticar o login!');</script>";
    session_unset();
    //session_destroy();
    echo '<meta http-equiv="refresh" content=0;url="../login.php">';
  }


?>
