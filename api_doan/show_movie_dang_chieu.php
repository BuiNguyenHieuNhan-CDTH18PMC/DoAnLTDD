<?php
 $connect=mysqli_connect("localhost","root","","dnlaravel");
 
 mysqli_query($connect,"SET NAMES 'utf8'");
 $query= "SELECT phim_image, phim_ten, phim_thoi_luong_id, ten_the_loai FROM tbl_phim, tbltheloai WHERE the_loai_id = id_the_loai AND trang_thai_phim = 1 ORDER BY id DESC";
 $data=mysqli_query($connect,$query);

class IMAGE{
 	        Public function __construct($image, $ten, $time, $theloai) {          
			$this->phim_image = $image;
			$this->phim_ten = $ten;
			$this->phim_thoi_luong_id = $time;
			$this->ten_the_loai = $theloai;
    }
 }

 $ds=array();
 while($row=mysqli_fetch_array($data))
 {	
	$obj= new IMAGE($row['phim_image'],$row['phim_ten'],$row['phim_thoi_luong_id'],$row['ten_the_loai']);
    array_push($ds,$obj);
 }
echo json_encode($ds);
?>