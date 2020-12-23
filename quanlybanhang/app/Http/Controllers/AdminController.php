<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use DB;
use Session;
use Illuminate\Support\Facades\Redirect;
session_start();

class AdminController extends Controller
{
    public function index(){
        return view('admin_login');
    }

    public function show_dashboard(){
        return view('admin.dashboard');
    }

    public function dashboard(Request $request){
        $admin_email = $request->admin_email;
        $admin_password =md5($request->admin_password);

        $result = DB::table('tbl_nhanvien')->where('staff_tai_khoan',$admin_email)->where('staff_mat_khau',$admin_password)->first();
        if($result)
        {
            Session::put('admin_name',$result->staff_tai_khoan);
            Session::put('admin_id',$result->staff_id);
            return Redirect::to('/dashboard');
        }
        else{
            Session::put('message',"Tài khoản hoặc mật khẩu sai, vui lòng nhập lại");
            return Redirect::to('/admin');
        }
    }

    public function logout(){
        Session::put('admin_name',null);
        Session::put('admin_id',null);
        return Redirect::to('/admin');
    }
}
