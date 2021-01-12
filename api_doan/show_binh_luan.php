<?php
 $connect=mysqli_connect("localhost","root","","dnlaravel");
 
 mysqli_query($connect,"SET NAMES 'utf8'");
 $query= "SELECT noi_dung_binhluan, danh_gia_phim ,phim_ten ,tai_khoan FROM tbl_phim, tbl_binhluan, tbl_user_manager WHERE tbl_phim.id = tbl_binhluan.phim_id AND tbl_user_manager.id = tbl_binhluan.user_id";
 $data=mysqli_query($connect,$query);

class BINHLUAN{
 	        Public function __construct($noidung, $danhgia, $phim, $user) {
			$this->noi_dung_binhluan = $noidung;
			$this->danh_gia_phim = $danhgia;
			$this->phim_ten = $phim;
			$this->tai_khoan = $user;
    }
 }

 $ds=array();
 while($row=mysqli_fetch_array($data))
 {	
	$obj= new BINHLUAN($row['noi_dung_binhluan'],$row['danh_gia_phim'],$row['phim_ten'],$row['tai_khoan']);
    array_push($ds,$obj);
 }
echo json_encode($ds);
?>