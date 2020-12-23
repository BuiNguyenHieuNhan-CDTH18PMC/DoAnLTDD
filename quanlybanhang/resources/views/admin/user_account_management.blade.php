@extends('admin_layout')
@section('admin_content')
<div class="table-agile-info">
 <div class="panel panel-default">
    <div class="panel-heading">
     Quản lý tài khoản
    </div>
    <div>
      <table class="table" ui-jq="footable" ui-options='{
        "paging": {
          "enabled": true
        },
        "filtering": {
          "enabled": true
        },
        "sorting": {
          "enabled": true
        }}'>
        <thead>
          <tr>
            <th data-breakpoints="xs">ID</th>
            <th>Họ tên</th>
            <th>Giới tính</th>           
            <th data-breakpoints="xs sm md" data-title="DOB">Ngày sinh</th>
            <th>Số điện thoại</th>
            <th>Địa chỉ</th>
            <th>Tài khoản</th>
            <th>Mật khẩu</th>
          </tr>
        </thead>
        <tbody>
            @foreach($show_user_management as $key => $cate_pro)
          <tr data-expanded="true">             
            <td>{{$cate_pro->id}}</td>
            <td>{{$cate_pro->ho_ten}}</td>
            <td>{{$cate_pro->gioi_tinh}}</td>
            <td>{{$cate_pro->ngay_sinh}}</td>
            <td>{{$cate_pro->sdt}}</td>   
            <td>{{$cate_pro->dia_chi}}</td>
            <td>{{$cate_pro->tai_khoan}}</td>
            <td>{{$cate_pro->mat_khau}}</td>
            <td>            
                <a href="#" class="btn btn-default">
                    <span class="glyphicon glyphicon-edit"></span> Sửa
                </a>    
                <a href="#" class="btn btn-danger">
                    <span class="glyphicon glyphicon-trash"></span> Xóa
                </a>
            </td>
          </tr>
          @endforeach
        </tbody>
      </table>
    </div>
  </div>
</div>
@endsection