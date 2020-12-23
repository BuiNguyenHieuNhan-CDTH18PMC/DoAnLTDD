<?php 
    require "connect.php";
	
	/*$tai_khoan = "nhanvien1";
	$mat_khau = "nhan123";
	$email = "nhan@gmail.com";
	$sdt = "0123456789";
	$gioi_tinh = "Nam";*/

    if(isset($_POST["ho_ten"])){
        $ho_ten = $_POST["ho_ten"];
    }
    if(isset($_POST["gioi_tinh"])){
        $gioi_tinh = $_POST["gioi_tinh"];
    }
    if(isset($_POST["ngay_sinh"])){
        $ngay_sinh = $_POST["ngay_sinh"];
    }
    if(isset($_POST["sdt"])){
        $sdt = $_POST["sdt"];
    }
	if(isset($_POST["tai_khoan"])){
        $tai_khoan = $_POST["tai_khoan"];
    }
	if(isset($_POST["mat_khau"])){
        $mat_khau = $_POST["mat_khau"];
    }
	$connect = new DbConnect();
	   
        $CheckTaiKhoan = "SELECT * from tbl_user_manager where tai_khoan like '$tai_khoan'";
        $checktk = mysqli_query($connect->getDb(), $CheckTaiKhoan);		
        if(mysqli_num_rows($checktk)>0)
        {
            echo"Tai khoan da ton tai";
        }
        else
        {
            $themTK = "INSERT INTO `tbl_user_manager` (`ho_ten`,`gioi_tinh`,`ngay_sinh`,`sdt`,`tai_khoan`,`mat_khau`) VALUES ('$ho_ten','$gioi_tinh','$ngay_sinh','$sdt','$tai_khoan','$mat_khau')";
            $add = mysqli_query($connect->getDb(),$themTK);
            if($add)
            {
                echo"tao thanh cong";
            }
            else
            {
                echo"tao that bai";
            }
        }
?>