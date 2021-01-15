<?php
 $connect=mysqli_connect("localhost","root","","dnlaravel");
 
 mysqli_query($connect,"SET NAMES 'utf8'");
 //$tenphim="thợ săn";
 $tenphim=$_POST["phim_ten"];
 $list="";
 $query= "SELECT *, ten_the_loai FROM tbl_phim, tbltheloai WHERE the_loai_id = id_the_loai AND trang_thai_phim = 1 AND phim_ten LIKE '%$tenphim%'";
 $data=mysqli_query($connect,$query);
 if(mysqli_num_rows($data)>0)
	{	
		while($row=mysqli_fetch_array($data))
		{
            if($list=="")
            {            
                $id=$row['id'];
                $anh=$row['phim_image'];
                $ten=$row['phim_ten'];
				$time=$row['phim_thoi_luong_id'];
                $theloai=$row['ten_the_loai'];
                $ngay=$row['phim_ngay_cong_chieu'];
				$noidung=$row['phim_noi_dung'];
				$daodien=$row['phim_dao_dien'];
                $dienvien=$row['phim_dien_vien'];
                $quocgia=$row['phim_quoc_gia'];
            }          
        }
	}
    if(mysqli_num_rows($data)==0)
    {
           $response["success"] = "0";
           $response["message"]= "Không có phim cần tìm";
           echo json_encode($response);
    }
    else
    {
        //response to android app
            $response["success"]="1";
			$response["message"]= "";
            $response["id"]=$id;
            $response["phim_image"]=$anh;
            $response["phim_ten"]=$ten;
            $response["phim_thoi_luong_id"]=$time;
			$response["ten_the_loai"]=$theloai;
			$response["phim_ngay_cong_chieu"]=$ngay;
			$response["phim_noi_dung"]=$noidung;
            $response["phim_dao_dien"]=$daodien;
			$response["phim_dien_vien"]=$dienvien;
			$response["phim_quoc_gia"]=$quocgia;
        //converting response data into json format
            echo json_encode($response);
	}
?>