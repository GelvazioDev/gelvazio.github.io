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
  <title>ProvaFácil</title>
  <link rel="stylesheet" href="dist/css/login.css"
</head>
<body>
  <div class="login-page">
    <div class="form">
      <form class="register-form" method="POST" action="process/professor/insere_prof.php">
        <img class="logo" src="dist/img/logo.png"></img>
        <input type="text" placeholder="nome" name="proNome"/>
        <input type="text" placeholder="email" name="proEmail"/>
        <input type="password" placeholder="senha" name="proSenha"/>
        <button>criar conta</button>
        <p class="message">Já é cadastrado? <a href="#"> Entrar</a></p>
      </form>
        <form class="login-form" name="cadPecas" method="post" action="process/login.php">
        <img class="logo" src="dist/img/logo.png"></img>
        <input type="text" name="proEmail" placeholder="Email" />
        <input type="password" name="proSenha" placeholder="Senha" />
        <input type="hidden" name="loginx" value="1">
          <p class="message">Esqueceu sua senha?<a href="pages/alterar-senha.php"> Mude aqui</a></p><br>
        <button type="submit" value="Cadastrar">entrar</button>
        <p class="message">Não é cadastrado?<a href="#"> Crie a sua conta aqui</a></p>
      </form>'
	    
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
  <script src="dist/js/pages/login.js"></script>
</body>
</html>
