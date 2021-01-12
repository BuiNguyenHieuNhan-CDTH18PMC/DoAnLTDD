<?php
 $connect=mysqli_connect("localhost","root","","dnlaravel");
 
 mysqli_query($connect,"SET NAMES 'utf8'");
 $query= "SELECT *, ten_the_loai FROM tbl_phim, tbltheloai WHERE the_loai_id = id_the_loai AND trang_thai_phim = 1 ORDER BY id DESC";
 $data=mysqli_query($connect,$query);

class IMAGE{
 	        Public function __construct($id, $image, $ten, $time, $theloai, $ngay, $noidung, $daodien, $dienvien, $quocgia) {
			$this->id = $id;		
			$this->phim_image = $image;
			$this->phim_ten = $ten;
			$this->phim_thoi_luong_id = $time;
			$this->ten_the_loai = $theloai;
			$this->phim_ngay_cong_chieu = $ngay;
			$this->phim_noi_dung = $noidung;
			$this->phim_dao_dien = $daodien;
			$this->phim_dien_vien = $dienvien;
			$this->phim_quoc_gia = $quocgia;
    }
 }

 $ds=array();
 while($row=mysqli_fetch_array($data))
 {	
	$obj= new IMAGE($row['id'],$row['phim_image'],$row['phim_ten'],$row['phim_thoi_luong_id'],$row['ten_the_loai'],$row['phim_ngay_cong_chieu'],$row['phim_noi_dung'],$row['phim_dao_dien'],$row['phim_dien_vien'],$row['phim_quoc_gia']);
    array_push($ds,$obj);
 }
echo json_encode($ds);
?>