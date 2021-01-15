@extends('admin_layout')
@section('admin_content')
<div class="table-agile-info">
  <div class="panel panel-default">
    <div class="panel-heading">
      Danh sách phim
    </div>
    <div class="table-responsive">
      <?php
		    $message = Session::get('message');
		    if($message){
			    echo '<script type="text/javascript"> alert("'.$message.'")</script>';
			    Session::put('message',null);
		    }
	    ?>
      <table class="table table-striped b-t b-light">
        <thead>
          <tr>
            <th style="width:20px;">
              <label class="i-checks m-b-none">
                <input type="checkbox"><i></i>
              </label>
            </th>
            <th>Tên phim</th>
            <th>Tên thể loại</th>
            <th>Nội dung</th>
            <th>Đạo diễn</th>
            <th>Diễn viên</th>
            <th>Quốc gia</th>
            <th>Hình ảnh</th>
            <th>Ngày công chiếu</th>
            <th>Thời lượng</th>
          </tr>
        </thead>
        <tbody>
            @foreach($all_movie as $key => $pro)
          <tr>
            <td><label class="i-checks m-b-none"><input type="checkbox"><i></i></label></td>
            <td>{{$pro->phim_ten}}</td>
            <td>{{$pro->ten_the_loai}}</td>
            <td>{{$pro->phim_noi_dung}}</td>
            <td>{{$pro->phim_dao_dien}}</td>
            <td>{{$pro->phim_dien_vien}}</td>
            <td>{{$pro->phim_quoc_gia}}</td>
            <td><image src='{{$pro->phim_image}}' width="100px" height="150px"></td>
            <td>{{$pro->phim_ngay_cong_chieu}}</td>
            <td>{{$pro->phim_thoi_luong_id}}</td>
            <td>           
                <a href="{{URL::to('/edit-phim/'.$pro->id)}}" class="btn btn-warning">
                    <span class="glyphicon glyphicon-edit"></span> Sửa
                </a>    
                <a onclick="return confirm('Bạn có chắc chắn muốn xóa ?')"  href="{{URL::to('/delete-phim/'.$pro->id)}}" class="btn btn-danger">
                    <span class="glyphicon glyphicon-trash"></span> Xóa
                </a>             
            </td> 
          </tr>
          @endforeach
        </tbody>
      </table>
    </div>
  </div>
@endsection