<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<?php
	session_start();
	if (!empty($_SESSION["proEmail"])) {
		echo '<meta http-equiv="refresh" content0;url="principal.php">';
		# code...
	}
?>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 2 | Dashboard</title>
  <link rel="stylesheet" href="../dist/css/login.css"
</head>
<body>
<div class="login-page">
    <div class="form">
        <form class="login-form" name="cadPecas" method="post" action="../process/professor/alterar-professor-process.php">
            <img class="logo" src="../dist/img/logo.png"></img>
            <input type="text" name="proEmail" placeholder="email" />
            <input type="password" name="proSenha" placeholder="senha antiga" />
            <input type="password" name="proSenhaNova1" placeholder="nova senha" />
            <input type="password" name="proSenhaNova2" placeholder="digite novamente" />
            <input type="hidden" name="loginx" value="1">
            <button type="submit" value="Cadastrar">confirmar</button>
            <p class="message"><a href="../login.php">Cancelar</a></p>
        </form>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
</body>
</html>
