@extends('admin_layout')
@section('admin_content')
<div class="row">
            <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            Thêm thể loại phim
                        </header>                
                        <div class="panel-body">                      
                            <div class="position-center">
                                <form role="form" action="{{URL::to('/save-category-the-loai')}}" method="post">
                                {{ csrf_field() }}
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Tên thể loại</label>
                                    <input type="text" name="category_ten_the_loai" class="form-control" id="exampleInputEmail1" placeholder="Nhập thể loại" >  

                                    <button type="submit" class="btn btn-info">Thêm</button>
                                </div>
                                </form>
                            </div>                      
                        </div>
                    </section>
            </div>
@endsection