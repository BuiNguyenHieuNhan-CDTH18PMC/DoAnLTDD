<?php
 $connect=mysqli_connect("localhost","root","","dnlaravel");
 
mysqli_query($connect,"SET NAMES 'utf-8'");
 $query= "SELECT * FROM tbl_phim where trang_thai_phim = 0 ORDER BY id DESC;";
 $data=mysqli_query($connect,$query);

class IMAGE{
 	        Public function __construct($phim_ten,$phim_noi_dung,$image) {          
			$this->phim_image = $image;
			$this->phim_ten = $phim_ten;
			$this->phim_noi_dung = $phim_noi_dung;
    }
 }

 $ds=array();
 while($row=mysqli_fetch_array($data))
 {	
	$obj= new IMAGE($row['phim_ten'],$row['phim_noi_dung'],$row['phim_image']);
    array_push($ds,$obj);
 }
echo json_encode($ds);
?>