<?php
	
	$server		= "localhost"; //sesuaikan dengan nama server
	$user		= "root"; //sesuaikan username
	$pass	= ""; //sesuaikan password
	$database	= "uas"; //sesuaikan target databese
	
	$con = mysqli_connect($server, $user, $pass, $database);
	if (mysqli_connect_error()) {
		echo "Gagal terhubung MySQL: ".mysqli_connect_error();
	}

?>