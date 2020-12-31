<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class TblRap extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('tbl_rap', function (Blueprint $table) {
            $table->Increments('id');
            $table->string('ten_rap');
            $table->string('dia_chi');
            $table->integer('phong_chieu_id')->unsigned();
            $table->foreign('phong_chieu_id')->references('id')->on('tbl_phong_chieu');
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
        Schema::dropIfExists('tbl_rap');
    }
}
