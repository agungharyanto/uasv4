<?php  

	include 'koneksi.php'; 
	// $hasil         = mysql_query("SELECT * FROM users") or die(mysql_error());
	// $json_response = array();
 
	// if(mysql_num_rows($hasil)> 0){
	// 	while ($row = mysql_fetch_array($hasil)) {
	//     	$json_response[] = $row;
	// 	}
	// 	echo json_encode(array('user' => $json_response));
	// } 


$result = mysqli_query($conn, "SELECT * FROM users")



// cek apakah nama tabel benar
if (!$result){
	echo mysqli_error($conn);


?>