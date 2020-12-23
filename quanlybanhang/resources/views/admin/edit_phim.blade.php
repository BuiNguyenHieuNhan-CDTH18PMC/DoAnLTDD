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
                            Cập nhật phim
                        </header>
                        <div class="panel-body">
                            <div class="position-center">   
                            @foreach($sua_phim as $key => $value)                        
                            <form role="form" action="{{URL::to('/update-phim/'.$value->id)}}" enctype="multipart/form-data" method="post">
                                {{ csrf_field() }}
                                
                                <div class="form-group">
                                    <label for="exampleInputTen">Tên phim:</label>
                                    <input type="text" name="ten_phim" class="form-control" id="exampleInputEmail1" value="{{$value->phim_ten}}" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputNoiDung">Nội dung phim:</label>
                                    <input type="text" name="noi_dung_phim" class="form-control" id="exampleInputEmail1" value="{{$value->phim_noi_dung}}" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputDate">Ngày công chiếu:</label>
                                    <input type="text" name="ngay_chieu_phim" class="form-control" id="exampleInputEmail1" value="{{$value->phim_ngay_cong_chieu}}" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputDaoDien">Đạo diễn:</label>
                                    <input type="text" name="dao_dien_phim" class="form-control" id="exampleInputEmail1" value="{{$value->phim_dao_dien}}" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputDienVien">Diễn viên:</label>
                                    <input type="text" name="dien_vien_phim" class="form-control" id="exampleInputEmail1" value="{{$value->phim_dien_vien}}" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputThoiGian">Quốc gia:</label>
                                    <input type="text" name="quoc_gia_phim" class="form-control" id="exampleInputEmail1" value="{{$value->phim_quoc_gia}}" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputThoiGian">Thời lượng:</label>
                                    <input type="text" name="thoi_luong_phim" class="form-control" id="exampleInputEmail1" value="{{$value->phim_thoi_luong_id}}" >
                                </div>                        
                                <div class="form-group">
                                    <label for="exampleInputTheloai">Thể loại:</label>
                                    <select class="form-control" name="the_loai_phim">
                                    @foreach($category_movie as $key => $cate_movie)
                                        @if($cate_movie->id_the_loai == $value->the_loai_id)
                                        <option selected value ="{{$cate_movie->id_the_loai}}">{{$cate_movie->ten_the_loai}}</option>
                                        @else
                                        <option value ="{{$cate_movie->id_the_loai}}">{{$cate_movie->ten_the_loai}}</option>
                                        @endif
                                    @endforeach
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputImage">Hình ảnh:</label>
                                    <input type="file" name="hinh_anh_phim" class="form-control">
                                    <image src="{{URL::to('public/Images/movie/'.$value->phim_image )}}" width="100px" height="150px">
                                </div>                        
                                <button type="submit" class="btn btn-info">Cập nhật<Main></Main></button>
                                
                                </form>
                                @endforeach
                            </div>

                        </div>
                    </section>

            </div>
@endsection