<?php
	require "connect.php";
	
	if(isset($_POST['noi_dung_binhluan'])){
		$nd = $_POST['noi_dung_binhluan'];
	}
	if(isset($_POST['danh_gia_phim'])){
		$dg = $_POST['danh_gia_phim'];
	}
	if(isset($_POST['phim_id'])){
		$phim = $_POST['phim_id'];
	}
	if(isset($_POST['user_id'])){
		$tk = $_POST['user_id'];
	}
	$connect = new DbConnect();
	
	$addBL = "INSERT INTO `tbl_binhluan` (`noi_dung_binhluan`,`danh_gia_phim`,`phim_id`,`user_id`) VALUES ('$nd','$dg','$phim','$tk')";
	$query = mysqli_query($connect->getDb(),$addBL);
    if($query)
    {
        echo"them thanh cong";
    }
    else
    {
        echo"them that bai";
    }
?>