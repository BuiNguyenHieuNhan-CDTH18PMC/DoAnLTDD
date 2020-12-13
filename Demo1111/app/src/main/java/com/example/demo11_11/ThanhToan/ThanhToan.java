package com.example.demo11_11.ThanhToan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.demo11_11.R;

public class ThanhToan extends AppCompatActivity {

    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanh_toan);
    }

    public void ThanhToan(View view) {
        switch (view.getId()){
            case R.id.imagemomo: {
                startActivity(intent = new Intent(ThanhToan.this, Thanh_Toan_Momo.class));
                break;
            }
            case  R.id.imageviettelpay:{
                startActivity(intent = new Intent(ThanhToan.this, Thanh_Toan_Viettel.class));
                break;
            }
        }
    }
}