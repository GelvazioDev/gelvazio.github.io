<?php
//apturn studio 3 ambitente de desenviovimento
	//abre conexão
	function DBConnect(){
		$link = mysqli_connect(DB_HOSTNAME,DB_USERNAME,DB_PASSWORD, DB_DATABASE)or die(mysqli_error($link));
		mysqli_set_charset($link,DB_CHARSET)or die(mysqli_error($link)) ;
		return $link; //retorna a conexão
	}
	//fecha conexão
	function DBClose($link){
		@mysqli_close($link) or die (mysqli_error($link));
	}

?>
