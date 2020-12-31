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
                            Thêm nhân viên
                        </header>
                        <div class="panel-body">
                            <div class="position-center">
                            <form role="form" action="{{URL::to('/save-staff')}}" enctype="multipart/form-data" method="post">
                                {{ csrf_field() }}
                                <div class="form-group">
                                    <label for="exampleInputTen">Họ tên:</label>
                                    <input type="text" name="ten_staff" class="form-control" id="exampleInputEmail1" placeholder="Nhập họ tên" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputImage">Hình ảnh:</label>
                                    <input type="file" name="hinh_anh_staff" class="form-control" id="exampleInputEmail1">
                                </div>  
                                <div class="form-group">
                                    <label for="exampleInputTheloai">Giới tính:</label>
                                    <select class="form-control" name="gioi_tinh_staff">                               
                                        <option value ="Nam">Nam</option>
                                        <option value ="Nữ">Nữ</option>
                                        <option value ="Không">Không </option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputDaoDien">Ngày sinh:</label>
                                    <input type="text" name="ngay_sinh_staff" class="form-control" id="exampleInputEmail1" placeholder="Nhập ngày sinh" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputDienVien">Số điện thoại:</label>
                                    <input type="text" name="sdt_staff" class="form-control" id="exampleInputEmail1" placeholder="Nhập số điện thoại" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputThoiGian">Địa chỉ:</label>
                                    <input type="text" name="dia_chi_staff" class="form-control" id="exampleInputEmail1" placeholder="Nhập địa chỉ" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputThoiGian">Tài khoản:</label>
                                    <input type="text" name="tai_khoan_staff" class="form-control" id="exampleInputEmail1" placeholder="Nhập tài khoản" >
                                </div>     
                                <div class="form-group">
                                    <label for="exampleInputThoiGian">Mật khẩu:</label>
                                    <input type="password" name="mat_khau_staff" class="form-control" id="exampleInputEmail1" placeholder="Nhập mật khẩu" >
                                </div>     
                                <div class="form-group">
                                    <label for="exampleInputThoiGian">CMND:</label>
                                    <input type="text" name="cmnd_staff" class="form-control" id="exampleInputEmail1" placeholder="Nhập cmnd" >
                                </div>                                             
                                <button type="submit" class="btn btn-info">THÊM<Main></Main></button>
                                </form>
                            </div>

                        </div>
                    </section>

            </div>
@endsection