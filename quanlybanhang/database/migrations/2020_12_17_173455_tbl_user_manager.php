<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class TblUserManager extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('tbl_user_manager', function (Blueprint $table) {
            $table->Increments('id');
            $table->string('ho_ten');
            $table->string('gioi_tinh',10);
            $table->date('ngay_sinh');
            $table->string('sdt',10);
            $table->string('dia_chi');
            $table->string('tai_khoan');
            $table->string('mat_khau');
            $table->string('so_cmnd');
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
        Schema::dropIfExists('tbl_user_manager');
    }
}
