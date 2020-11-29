package com.example.demo11_11.ThanhToan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.demo11_11.R;

public class ThanhToan extends AppCompatActivity {
    public static int MOMO = R.drawable.momo_logo;
    public static int VIETTEL = R.drawable.viettelpay;
    public static int ZALO = R.drawable.zalopay;
    public static int AIRPAY = R.drawable.airpay;

    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanh_toan);
    }

    public void ThanhToan(View view) {
        switch (view.getId()){
            case R.id.imagemomo: {
                intent = new Intent(ThanhToan.this, Thanh_Toan_Momo.class);
                Bundle bundle = new Bundle();
                bundle.putInt("MOMO", MOMO);
                intent.putExtra("data",bundle);
                startActivity(intent);
                break;
            }
            case  R.id.imageviettelpay:{
                intent = new Intent(ThanhToan.this, Thanh_Toan_Momo.class);
                Bundle bundle = new Bundle();
                bundle.putInt("VIETTEL", VIETTEL);
                intent.putExtra("data",bundle);
                startActivity(intent);
                break;
            }
            case  R.id.imagezalopay:{
                intent = new Intent(ThanhToan.this, Thanh_Toan_Momo.class);
                Bundle bundle = new Bundle();
                bundle.putInt("ZALO", ZALO);
                intent.putExtra("data",bundle);
                startActivity(intent);
                break;
            }
            case  R.id.imageairpay:{
                intent = new Intent(ThanhToan.this, Thanh_Toan_Momo.class);
                Bundle bundle = new Bundle();
                bundle.putInt("AIRPAY", AIRPAY);
                intent.putExtra("data",bundle);
                startActivity(intent);
                break;
            }
        }
    }
}