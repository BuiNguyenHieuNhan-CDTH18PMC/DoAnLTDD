@extends('admin_layout')
@section('admin_content')
            <div class="col-lg-12">
                    <section class="panel">
                        <?php
                            $message = Session::get('message');
                            if($message)
                            {
                                echo '<script type="text/javascript"> alert("'.$message.'")</script>';
                                Session::put('message',null);
                            }
                        ?>
                        <header class="panel-heading">
                            Cập nhật thông tin nhân viên
                        </header>
                        <div class="panel-body">
                            <div class="position-center">
                            @foreach($edit_staff as $key => $value)
                            <form role="form" action="{{URL::to('/update-staff/'.$value->staff_id)}}" enctype="multipart/form-data" method="post">
                                {{ csrf_field() }}
                                <div class="form-group">
                                    <label for="exampleInputTen">Họ tên:</label>
                                    <input type="text" name="ten_staff" class="form-control" id="exampleInputEmail1" value="{{$value->staff_ho_ten}}">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputImage">Hình ảnh:</label>
                                    <input type="file" name="hinh_anh_staff" class="form-control" id="exampleInputEmail1">
                                    <image src="{{URL::to('public/Images/staff/'.$value->staff_image )}}" width ="100px" height ="150px">
                                </div>  
                                <div class="form-group">
                                    <label for="exampleInputTheloai">Giới tính:</label>
                                    <select class="form-control" name="gioi_tinh_staff">  
                                    @if($value->staff_gioi_tinh=="Nam")
                                        <option value ="{{$value->staff_gioi_tinh}}">{{$value->staff_gioi_tinh}}</option>
                                        <option value ="Nữ">Nữ</option>
                                    @else
                                        <option value ="{{$value->staff_gioi_tinh}}">{{$value->staff_gioi_tinh}}</option>
                                        <option value ="Nam">Nam</option>
                                    @endif
                                    </select>                                  
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputDaoDien">Ngày sinh:</label>
                                    <input type="text" name="ngay_sinh_staff" class="form-control" id="exampleInputEmail1" value="{{$value->staff_ngay_sinh}}">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputDienVien">Số điện thoại:</label>
                                    <input type="text" name="sdt_staff" class="form-control" id="exampleInputEmail1" value="{{$value->staff_sdt}}">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputThoiGian">Địa chỉ:</label>
                                    <input type="text" name="dia_chi_staff" class="form-control" id="exampleInputEmail1" value="{{$value->staff_dia_chi}}">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputThoiGian">Tài khoản:</label>
                                    <input type="text" name="tai_khoan_staff" class="form-control" id="exampleInputEmail1" value="{{$value->staff_tai_khoan}}">
                                </div>     
                                <div class="form-group">
                                    <label for="exampleInputThoiGian">Mật khẩu:</label>
                                    <input type="password" name="mat_khau_staff" class="form-control" id="exampleInputEmail1" value="{{$value->staff_mat_khau}}">
                                </div>     
                                <div class="form-group">
                                    <label for="exampleInputThoiGian">CMND:</label>
                                    <input type="text" name="cmnd_staff" class="form-control" id="exampleInputEmail1" value="{{$value->staff_cmnd}}">
                                </div>                                             
                                <button type="submit" class="btn btn-info">Cập nhật<Main></Main></button>                          
                                </form>
                                @endforeach
                            </div>

                        </div>
                    </section>

            </div>
@endsection