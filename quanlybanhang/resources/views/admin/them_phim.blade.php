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
                            Thêm phim
                        </header>
                        <div class="panel-body">
                            <div class="position-center">
                            <form role="form" action="{{URL::to('/save-movie')}}" enctype="multipart/form-data" method="post">
                                {{ csrf_field() }}
                                <div class="form-group">
                                    <label for="exampleInputTen">Tên phim:</label>
                                    <input type="text" name="ten_phim" class="form-control" id="exampleInputEmail1" placeholder="Nhập tên phim" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputNoiDung">Nội dung phim:</label>
                                    <input type="text" name="noi_dung_phim" class="form-control" id="exampleInputEmail1" placeholder="Nhập nội dung" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputDate">Ngày công chiếu:</label>
                                    <input type="text" name="ngay_chieu_phim" class="form-control" id="exampleInputEmail1" placeholder="Nhập ngày công chiếu" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputDaoDien">Đạo diễn:</label>
                                    <input type="text" name="dao_dien_phim" class="form-control" id="exampleInputEmail1" placeholder="Nhập đạo diễn" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputDienVien">Diễn viên:</label>
                                    <input type="text" name="dien_vien_phim" class="form-control" id="exampleInputEmail1" placeholder="Nhập diễn viên" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputThoiGian">Quốc gia:</label>
                                    <input type="text" name="quoc_gia_phim" class="form-control" id="exampleInputEmail1" placeholder="Nhập quốc gia" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputThoiGian">Thời lượng:</label>
                                    <input type="text" name="thoi_luong_phim" class="form-control" id="exampleInputEmail1" placeholder="Nhập thời lượng" >
                                </div>                        
                                <div class="form-group">
                                    <label for="exampleInputTheloai">Thể loại:</label>
                                    <select class="form-control" name="the_loai_phim">
                                    @foreach($category_movie as $key => $cate_movie)
                                        <option value ="{{$cate_movie->id_the_loai}}">{{$cate_movie->ten_the_loai}}</option>
                                    @endforeach
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputImage">Hình ảnh:</label>
                                    <input type="file" name="hinh_anh_phim" class="form-control" id="exampleInputEmail1">
                                </div>                        
                                <button type="submit" class="btn btn-info">THÊM<Main></Main></button>
                                </form>
                            </div>

                        </div>
                    </section>

            </div>
@endsection