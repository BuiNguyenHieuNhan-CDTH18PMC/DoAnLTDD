<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class TblPhim extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('tbl_phim', function (Blueprint $table) {
            $table->Increments('id');
            $table->string('phim_ten_phim');
            $table->date('phim_ngay_cong_chieu');
            $table->string('phim_noi_dung');
            $table->string('phim_dao_dien');
            $table->string('phim_dien_vien');
            $table->string('phim_quoc_gia');
            $table->string('phim_image');
            $table->string('phim_thoi_luong_id');
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('tbl_phim');
    }
}
