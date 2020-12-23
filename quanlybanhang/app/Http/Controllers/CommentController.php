<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use DB;
use Session;
use Illuminate\Support\Facades\Redirect;
session_start();

class CommentController extends Controller
{
    public function all_comment(){
        $result=DB::table('tbl_binhluan')->join('tbl_phim','tbl_phim.id','=','tbl_binhluan.phim_id')->join('tbl_user_manager','tbl_user_manager.id','=','tbl_binhluan.user_id')->get();
        return view('binh_luan.comment')->with('all_comment',$result);
    }
}
