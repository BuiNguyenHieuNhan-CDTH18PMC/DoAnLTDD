<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use DB;
use Session;
use Illuminate\Support\Facades\Redirect;
session_start();

class UserController extends Controller
{
    public function all_user_management(){
        $show_user_management = DB::table('tbl_user_manager')->get();
        $manager = view('admin.user_account_management')->with('show_user_management',$show_user_management);
        return view('admin_layout')->with('admin.user_account_management',$manager);
    }

}
