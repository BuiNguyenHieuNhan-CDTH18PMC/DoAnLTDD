<?php
	require "connect.php";

	$tai_khoan=$_POST["tai_khoan"];
	$mat_khau= $_POST["mat_khau"];
	
	/*$tai_khoan= "admin";
	$mat_khau= "admin";*/
	
	$connect = new DbConnect();
 $query= "SELECT * FROM `tbl_user_manager` WHERE `tai_khoan` LIKE '$tai_khoan' AND `mat_khau` LIKE '$mat_khau' ";
 $data = mysqli_query($connect->getDb(),$query);
if(mysqli_num_rows($data)>0)
{
	echo "Login success";
}else
{
	echo "Login failed";
}
?>