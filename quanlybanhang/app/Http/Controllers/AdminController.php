<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use DB;
use Session;
use Illuminate\Support\Facades\Redirect;
session_start();

class AdminController extends Controller
{
    public function AuthLogin(){
        $staff_id = Session::get('staff_id');
        if($staff_id){
           return Redirect::to('dashboard');
        }
        else{
           return Redirect::to('admin')->send();
        }
    }

    public function index(){
        return view('admin_login');
    }

    public function show_dashboard(){
        $this->AuthLogin();
        return view('admin.dashboard');
    }

    public function dashboard(Request $request){
        $staff_email = $request->staff_email;
        $staff_password =md5($request->staff_password);

        $result = DB::table('tbl_nhanvien')->where('staff_tai_khoan',$staff_email)->where('staff_mat_khau',$staff_password)->first();
        if($result)
        {
            Session::put('staff_name',$result->staff_tai_khoan);
            Session::put('staff_id',$result->staff_id);
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
