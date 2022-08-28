<?php

include "../../pattern/config.php";
require "../connection_operations.php";

$email = $_POST['proEmail'];
$senha = $_POST['proSenha'];
$novaSenha1 =$_POST['proSenhaNova1'];
$novaSenha2 =$_POST['proSenhaNova1'];

if ($novaSenha1 == $novaSenha2) {

  $var = DBReadSql("UPDATE professor SET proSenha = '".$novaSenha1."' WHERE proEmail = '".$email."' AND proSenha = '".$senha."';");


}
