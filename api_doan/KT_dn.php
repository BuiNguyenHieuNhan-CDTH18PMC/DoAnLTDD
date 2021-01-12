<?php
	require "connect.php";

	/*$tai_khoan=$_POST["tai_khoan"];
	$mat_khau= $_POST["mat_khau"];*/
	
	$tai_khoan= "nhan";
	$mat_khau= "1234";
	
	$connect = new DbConnect();
 $query= "SELECT * FROM `tbl_user_manager` WHERE `tai_khoan` LIKE '$tai_khoan' AND `mat_khau` LIKE '$mat_khau' ";
 $data = mysqli_query($connect->getDb(),$query);
if(mysqli_num_rows($data)>0)
{
	echo "Login success";
	class USER{
 	        Public function __construct($id, $ten, $gioitinh, $ngaysinh, $sdt, $taikhoan, $matkhau) {
			$this->id = $id;		
			$this->ho_ten = $ten;
			$this->gioi_tinh = $gioitinh;
			$this->ngay_sinh = $ngaysinh;
			$this->sdt = $sdt;
			$this->tai_khoan = $taikhoan;
			$this->mat_khau = $matkhau;
		}
	}

	$ds=array();
	while($row=mysqli_fetch_array($data))
	{	
		$obj= new USER($row['id'],$row['ho_ten'],$row['gioi_tinh'],$row['ngay_sinh'],$row['sdt'],$row['tai_khoan'],$row['mat_khau']);
		array_push($ds,$obj);
	}
	echo json_encode($ds);
}
else
{
	echo "Login failed";
}
?>