<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Movies extends Model
{
    public $timestamps = false;
    protected $fillable=['phim_ten','phim_ngay_cong_chieu','phim_noi_dung','the_loai_id','phim_dao_dien','phim_dien_vien','phim_quoc_gia','phim_image','phim_thoi_luong_id'];
    protected $primaryKey ='id';
    protected $table = 'tbl_phim';
}
