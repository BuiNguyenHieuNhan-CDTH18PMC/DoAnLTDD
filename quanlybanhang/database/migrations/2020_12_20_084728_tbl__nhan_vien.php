<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class TblNhanVien extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('tbl_nhanvien', function (Blueprint $table) {
            $table->Increments('staff_id');
            $table->string('staff_ho_ten');
            $table->string('staff_gioi_tinh',10);
            $table->date('staff_ngay_sinh');
            $table->string('staff_sdt',10);
            $table->string('staff_dia_chi');
            $table->string('staff_tai_khoan');
            $table->string('staff_mat_khau');
            $table->string('staff_cmnd');
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
        Schema::dropIfExists('tbl_nhanvien');
    }
}
