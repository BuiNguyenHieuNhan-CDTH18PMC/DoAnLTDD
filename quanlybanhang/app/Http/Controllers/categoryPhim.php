<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use DB;
use Session;
use Illuminate\Support\Facades\Redirect;
session_start();

class categoryPhim extends Controller
{
    public function add_the_loai_phim(){
        return view('admin.category_movie');
    }

    public function all_the_loai_phim(){
        
        $category_movie_all = DB::table('tbltheloai')->get();
        $manager = view('admin.category_movie_all')->with('category_movie_all',$category_movie_all);
        return view('admin_layout')->with('admin.category_movie_all',$manager);
    }

    public function save_the_loai_phim(Request $request){
        $data = array();
        $data['ten_the_loai'] = $request->category_ten_the_loai;
        $check = DB::table('tbltheloai')->where('ten_the_loai',$data)->first();
        if($check)
        {
            Session::put('message','Đã tồn tại');
        }
        else
        {
            DB::table('tbltheloai')->insert($data);   
            Session::put('message','Thêm thành công');
        }
        return Redirect::to('add-category-movie');
    }

    public function sua_the_loai($category_id){
        $edit = DB::table('tbltheloai')->where('id_the_loai',$category_id)->get();
        $manager = view('admin.edit_category')->with('edit_category',$edit);
        return view('admin_layout')->with('admin.edit_category',$manager);
    }

    public function update_the_loai_phim(Request $request, $category_id){
        $data = array();
        $data['ten_the_loai'] = $request->category_ten_the_loai;
        DB::table('tbltheloai')->where('id_the_loai',$category_id)->update($data);
        Session::put('message','Cập nhật thành công');
        return Redirect::to('all-category-movie');
    }

    public function delete_the_loai_phim(Request $request, $category_id){
        DB::table('tbltheloai')->where('id_the_loai',$category_id)->delete();
        Session::put('message','Xóa thành công');
        return Redirect::to('all-category-movie');
    }
}
