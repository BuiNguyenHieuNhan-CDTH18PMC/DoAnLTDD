@extends('admin_layout')
@section('admin_content')
<div class="table-agile-info">
  <div class="panel panel-default">
    <div class="panel-heading">
      Danh sách nhân viên
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
            <th>Họ tên</th>
            <th>Hình ảnh</th>
            <th>Giới tính</th>
            <th>Ngày sinh</th>
            <th>Số điện thoại</th>
            <th>Địa chỉ</th>
            <th>Tài khoản</th>
            <th>Mật khẩu</th>
            <th>CMND</th>
          </tr>
        </thead>
        <tbody>
            @foreach($all_nhan_vien as $key => $pro)
          <tr>
            <td><label class="i-checks m-b-none"><input type="checkbox"><i></i></label></td>
            <td>{{$pro->staff_ho_ten}}</td>
            @if($pro->staff_image != null)
            <td><image src='{{$pro->staff_image}}'width ="100px" height="150px"></td>
            @else
            <td><image src=''></td>
            @endif
            <td>{{$pro->staff_gioi_tinh}}</td>
            <td>{{$pro->staff_ngay_sinh}}</td>
            <td>{{$pro->staff_sdt}}</td>
            <td>{{$pro->staff_dia_chi}}</td>
            <td>{{$pro->staff_tai_khoan}}</td>
            <td>{{$pro->staff_mat_khau}}</td>
            <td>{{$pro->staff_cmnd}}</td>           
            <td>           
                <a href="{{URL::to('/edit-staff/'.$pro->staff_id)}}" class="btn btn-warning">
                    <span class="glyphicon glyphicon-edit"></span> Sửa
                </a>    
                <a onclick="return confirm('Bạn có chắc chắn muốn xóa ?')"  href="{{URL::to('/delete-staff/'.$pro->staff_id)}}" class="btn btn-danger">
                    <span class="glyphicon glyphicon-trash"></span> Xóa
                </a>             
            </td> 
          </tr>
          @endforeach
        </tbody>
      </table>
    </div>
    <footer class="panel-footer">
      <div class="row">
        
        <div class="col-sm-5 text-center">
          <small class="text-muted inline m-t-sm m-b-sm">Hiển thị 10 - 20 item</small>
        </div>
        <div class="col-sm-7 text-right text-center-xs">                
          <ul class="pagination pagination-sm m-t-none m-b-none">
            <li><a href=""><i class="fa fa-chevron-left"></i></a></li>
            <li><a href="">1</a></li>
            <li><a href="">2</a></li>
            <li><a href="">3</a></li>
            <li><a href="">4</a></li>
            <li><a href=""><i class="fa fa-chevron-right"></i></a></li>
          </ul>
        </div>
      </div>
    </footer>
  </div>
@endsection