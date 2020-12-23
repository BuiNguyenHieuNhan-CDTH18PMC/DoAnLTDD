<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use DB;
use Session;
use Illuminate\Support\Facades\Redirect;
session_start();
class NhanVienController extends Controller
{
    public function all_staff(){
        $result = DB::table('tbl_nhanvien')->get(); 
        $manager = view('nhan_vien.all_nhan_vien')->with('all_nhan_vien',$result);

        return view('admin_layout')->with('nhan_vien.all_nhan_vien',$manager);
    }

    public function add_staff(){
        return view('nhan_vien.add_nhan_vien');
    }

    public function save_staff(Request $request){
        $data = array();
        $data['staff_ho_ten']=$request->ten_staff;
        $data['staff_image']=$request->hinh_anh_staff;
        $data['staff_gioi_tinh']=$request->gioi_tinh_staff;
        $data['staff_ngay_sinh']=$request->ngay_sinh_staff;
        $data['staff_sdt']=$request->sdt_staff;
        $data['staff_dia_chi']=$request->dia_chi_staff;
        $data['staff_tai_khoan']=$request->tai_khoan_staff;
        $data['staff_mat_khau']=md5($request->mat_khau_staff);
        $data['staff_cmnd']=$request->cmnd_staff;
        $get_image = $request->file('hinh_anh_staff');
        if($get_image){
            $get_name_image = $get_image->getClientOriginalName();
            $name_image = current(explode('.',$get_name_image));
            $new_image = $name_image.rand(0,99).'.'.$get_image->getClientOriginalExtension();
            $get_image->move('public/Images/staff',$new_image);
            $data['staff_image'] = $new_image;
            DB::table('tbl_nhanvien')->insert($data);
        }else{
            $data['staff_image'] = '';
            DB::table('tbl_nhanvien')->insert($data);
        }
        Session::put('message','Thêm thành công');
        return Redirect::to('add-staff');
    }

    public function edit_staff($staff_id){
        $result = DB::table('tbl_nhanvien')->where('staff_id',$staff_id)->get(); 
        $manager = view('nhan_vien.edit_nhan_vien')->with('edit_staff',$result);

        return view('admin_layout')->with('nhan_vien.edit_nhan_vien',$manager);
    }

    public function update_staff(Request $request, $staff_id){
        $data = array();
        $data['staff_ho_ten']=$request->ten_staff;
        $data['staff_image']=$request->hinh_anh_staff;
        $data['staff_gioi_tinh']=$request->gioi_tinh_staff;
        $data['staff_ngay_sinh']=$request->ngay_sinh_staff;
        $data['staff_sdt']=$request->sdt_staff;
        $data['staff_dia_chi']=$request->dia_chi_staff;
        $data['staff_tai_khoan']=$request->tai_khoan_staff;
        $data['staff_mat_khau']=md5($request->mat_khau_staff);
        $data['staff_cmnd']=$request->cmnd_staff;
        $get_image = $request->file('hinh_anh_staff');
        if($get_image){
            $get_name_image = $get_image->getClientOriginalName();
            $name_image = current(explode('.',$get_name_image));
            $new_image = $name_image.rand(0,99).'.'.$get_image->getClientOriginalExtension();
            $get_image->move('public/Images/staff',$new_image);
            $data['staff_image'] = $new_image;
            DB::table('tbl_nhanvien')->where('staff_id', $staff_id)->update($data);
        }else{
            DB::table('tbl_nhanvien')->where('staff_id', $staff_id)->update($data);
        }
        Session::put('message','Cập nhật thành công');
        return Redirect::to('all-staff');
    }

    public function delete_staff($staff_id){
        DB::table('tbl_nhanvien')->where('staff_id',$staff_id)->delete();
        Session::put('message',"Xóa thành công");
        return Redirect::to('all-staff');
    }

    public function forgot_password(){
        return view('/nhan_vien.forgot_password');
    }

    public function find_phone_number(Request $request){
        $data=array();
        $data['staff_sdt'] = $request->staff_sodt;
        $data['staff_mat_khau']=md5($request->staff_pass);
        $request = DB::table('tbl_nhanvien')->where('staff_sdt',$data)->update($data);
        if($request){
            Session::put('message',"Tạo mới thành công");
            return Redirect::to('admin');
        }
        else{
            Session::put('message',"Số điện thoại không tồn tại");
            return view('nhan_vien.forgot_password');
        }
    }
}
