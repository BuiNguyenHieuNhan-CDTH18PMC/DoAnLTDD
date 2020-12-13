package com.example.demo11_11.ThanhToan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.demo11_11.R;

public class ThanhToan extends AppCompatActivity {

    Intent intent;
    public static final String MOMO = "Momo";
    public static final String VIETTEL = "Viettel";
    public static final String ZALO = "Zalo";
    public static final String AIR = "Air";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanh_toan);
    }

    public void ThanhToan(View view) {
        switch (view.getId()){
            case R.id.imagemomo: {
                intent = new Intent(ThanhToan.this, Thanh_Toan_Momo.class);
                intent.putExtra(MOMO,"momo");
                break;
            }
            case  R.id.imageviettelpay:{
                intent = new Intent(ThanhToan.this, Thanh_Toan_Momo.class);
                intent.putExtra(VIETTEL,"viettel");
                break;
            }
            case  R.id.imagezalopay:{
                intent = new Intent(ThanhToan.this, Thanh_Toan_Momo.class);
                intent.putExtra(ZALO,"zalo");
                break;
            }
            case  R.id.imageairpay:{
                intent = new Intent(ThanhToan.this, Thanh_Toan_Momo.class);
                intent.putExtra(AIR,"air");
                break;
            }
        }
        startActivity(intent);
    }
}