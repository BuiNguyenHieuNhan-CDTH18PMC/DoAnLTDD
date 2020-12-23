<?php

namespace App\Http\Controllers;
use Illuminate\Http\Request;
use DB;
use Session;
use Illuminate\Support\Facades\Redirect;
session_start();

class MovieController extends Controller
{
    public function add_movie(){
        $category_movie = DB::table('tbltheloai')->orderby('id_the_loai','desc')->get();
        
        return view('admin.them_phim')->with('category_movie',$category_movie);
    }

    public function save_movie(Request $request){
        $data = array();
        $data['phim_ten']=$request->ten_phim;
        $data['phim_ngay_cong_chieu']=$request->ngay_chieu_phim;
        $data['phim_noi_dung']=$request->noi_dung_phim;
        $data['phim_dao_dien']=$request->dao_dien_phim;
        $data['phim_dien_vien']=$request->dien_vien_phim;
        $data['phim_quoc_gia']=$request->quoc_gia_phim;
        $data['phim_thoi_luong_id']=$request->thoi_luong_phim;
        $data['the_loai_id']=$request->the_loai_phim;
        $data['phim_image']=$request->thoi_luong_phim;
        $get_image = $request->file('hinh_anh_phim');
        if($get_image){
            $get_name_image = $get_image->getClientOriginalName();
            $name_image = current(explode('.',$get_name_image));
            $new_image = $name_image.rand(0,99).'.'.$get_image->getClientOriginalExtension();
            $get_image->move('public/Images/movie',$new_image);
            $data['phim_image'] = $new_image;
            DB::table('tbl_phim')->insert($data);
        }else{
            $data['phim_image'] = '';
            DB::table('tbl_phim')->insert($data);
        }
        Session::put('message','Thêm thành công');
        return Redirect::to('add-movie');
    }

    public function all_movie(){
        $result = DB::table('tbl_phim')->join('tbltheloai','tbltheloai.id_the_loai','=','tbl_phim.the_loai_id')->get();  
        $manager = view('admin.all_movie')->with('all_movie',$result);

        return view('admin_layout')->with('admin.all_movie',$manager);
    }

    public function sua_phim($id){
        $result = DB::table('tbltheloai')->get();  
        $data = DB::table('tbl_phim')->where('id',$id)->get();
        $manager = view('admin.edit_phim')->with('sua_phim',$data)->with('category_movie',$result);

        return view('admin_layout')->with('admin.edit_phim',$manager);
    }

    public function update_phim(Request $request,$id){
        $data=array();
        $data['phim_ten']=$request->ten_phim;
        $data['phim_ngay_cong_chieu']=$request->ngay_chieu_phim;
        $data['phim_noi_dung']=$request->noi_dung_phim;
        $data['phim_dao_dien']=$request->dao_dien_phim;
        $data['phim_dien_vien']=$request->dien_vien_phim;
        $data['phim_quoc_gia']=$request->quoc_gia_phim;
        $data['phim_thoi_luong_id']=$request->thoi_luong_phim;
        $data['the_loai_id']=$request->the_loai_phim;
        $get_image = $request->file('hinh_anh_phim');
        if($get_image){
            $get_name_image = $get_image->getClientOriginalName();
            $name_image = current(explode('.',$get_name_image));
            $new_image = $name_image.rand(0,99).'.'.$get_image->getClientOriginalExtension();
            $get_image->move('public/Images/movie',$new_image);
            $data['phim_image'] = $new_image;
            DB::table('tbl_phim')->where('id',$id)->update($data);
            Session::put('message','Cập nhật thành công');
        }else{
            DB::table('tbl_phim')->where('id',$id)->update($data);
            Session::put('message','Cập nhật thành công');
        }
        return Redirect::to('all-movie');
    }

    public function xoa_phim($id){
        DB::table('tbl_phim')->where('id',$id)->delete();
        Session::put('message',"Xóa thành công");
        return Redirect::to('/all-movie');
    }
}
