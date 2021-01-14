<?php
	require "connect.php";

	$tai_khoan=$_POST["tai_khoan"];
	$mat_khau=$_POST["mat_khau"];
	
	/*$tai_khoan= "nhan";
	$mat_khau= "1234";*/
	$list="";
	$connect = new DbConnect();
 $query= "SELECT * FROM `tbl_user_manager` WHERE `tai_khoan` LIKE '$tai_khoan' AND `mat_khau` LIKE '$mat_khau' ";
 $data = mysqli_query($connect->getDb(),$query);
	if(mysqli_num_rows($data)>0)
	{	
		while($row=mysqli_fetch_array($data))
		{
            if($list=="")
            {            
                $id=$row['id_user'];
                $name=$row['ho_ten'];
                $username=$row['tai_khoan'];
				$gt=$row['gioi_tinh'];
                $ngaysinh=$row['ngay_sinh'];
                $sdt=$row['sdt'];
            }          
        }
	}
    if(mysqli_num_rows($data)==0)
    {
           $response["success"] = "0";
           $response["message"]="user is not Registered, Please Register";
           echo json_encode($response);
    }
    else
    {
        //response to android app
            $response["success"]="1";
            $response["message"]="Logged in successful";
            $response["id_user"]=$id;
            $response["ho_ten"]=$name;
            $response["tai_khoan"]=$username;
            $response["gioi_tinh"]=$gt;
			$response["ngay_sinh"]=$ngaysinh;
			$response["sdt"]=$sdt;
        //converting response data into json format
            echo json_encode($response);
	}
?>