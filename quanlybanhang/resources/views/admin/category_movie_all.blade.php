@extends('admin_layout')
@section('admin_content')
<div class="table-agile-info">
  <div class="panel panel-default">
    <div class="panel-heading">
      Danh sách thể loại
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
            <th>Tên thể loại</th>
            <th style="width:30px;"></th>
          </tr>
        </thead>
        <tbody>
            @foreach($category_movie_all as $key => $cate_pro)
          <tr>
            <td><label class="i-checks m-b-none"><input type="checkbox"><i></i></label></td>
            <td>{{$cate_pro->ten_the_loai}}</td>
            <td>           
                <a href="{{URL::to('/sua-the-loai/'.$cate_pro->id_the_loai)}}" class="btn btn-warning">
                    <span class="glyphicon glyphicon-edit"></span> Sửa
                </a>    
                <a onclick="return confirm('Bạn có chắc chắn muốn xóa ?')"  href="{{URL::to('/delete-category-the-loai/'.$cate_pro->id_the_loai)}}" class="btn btn-danger">
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