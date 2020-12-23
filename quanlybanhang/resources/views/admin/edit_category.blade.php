@extends('admin_layout')
@section('admin_content')
<div class="row">
            <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            Cập nhật thể loại phim
                        </header>                
                        <div class="panel-body">
                            @foreach($edit_category as $key => $edit_value)
                            <div class="position-center">
                                <form role="form" action="{{URL::to('/update-category-the-loai/'.$edit_value->id_the_loai)}}" method="post">
                                {{ csrf_field() }}
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Tên thể loại</label>
                                    <input type="text" value="{{$edit_value->ten_the_loai}}" name="category_ten_the_loai" class="the-loai" id="exampleInputEmail1">  

                                    <button type="submit" class="btn btn-info">Cập nhật </button>
                                </div>
                                </form>                           
                            </div>                   
                            @endforeach
                        </div>
                    </section>
            </div>
@endsection