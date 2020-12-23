<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\AdminController;
use App\Http\Controllers\categoryPhim;
use App\Http\Controllers\UserController;
use App\Http\Controllers\MovieController;
use App\Http\Controllers\NhanVienController;
use App\Http\Controllers\CommentController;
/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

//Backend
Route::get('/admin',[AdminController::class,'index']);
 
Route::get('/dashboard',[AdminController::class,'show_dashboard']);

Route::post('/admin-dashboard',[AdminController::class,'dashboard']);

Route::get('/logout',[AdminController::class,'logout']);

//category-movie

Route::get('/add-category-movie',[categoryPhim::class,'add_the_loai_phim']);

Route::get('/all-category-movie',[categoryPhim::class,'all_the_loai_phim']);

Route::get('/sua-the-loai/{category_id}',[categoryPhim::class,'sua_the_loai']);

Route::get('/delete-category-the-loai/{category_id}',[categoryPhim::class,'delete_the_loai_phim']);

Route::post('/save-category-the-loai',[categoryPhim::class,'save_the_loai_phim']);

Route::post('/update-category-the-loai/{category_id}',[categoryPhim::class,'update_the_loai_phim']);

//management user

Route::get('/all-user-management',[UserController::class,'all_user_management']);

//movie

Route::get('/add-movie',[MovieController::class,'add_movie']);

Route::get('/all-movie',[MovieController::class,'all_movie']);

Route::get('/edit-phim/{id}',[MovieController::class,'sua_phim']);

Route::get('/delete-phim/{id}',[MovieController::class,'xoa_phim']);

Route::post('/update-phim/{id}',[MovieController::class,'update_phim']);

Route::post('/save-movie',[MovieController::class,'save_movie']);

//nhân viên

Route::get('/all-staff',[NhanvienController::class,'all_staff']);

Route::get('/add-staff',[NhanVienController::class,'add_staff']);

Route::get('delete-staff/{staff_id}',[NhanVienController::class,'delete_staff']);

Route::get('/edit-staff/{staff_id}',[NhanVienController::class,'edit_staff']);

Route::get('forgot-password',[NhanVienController::class,'forgot_password']);

Route::post('save-staff',[NhanVienController::class,'save_staff']);

Route::post('update-staff/{staff_id}',[NhanVienController::class,'update_staff']);

Route::post('/find-phone-number',[NhanVienController::class,'find_phone_number']);

//comment

Route::get('/all-comment',[CommentController::class,'all_comment']);

