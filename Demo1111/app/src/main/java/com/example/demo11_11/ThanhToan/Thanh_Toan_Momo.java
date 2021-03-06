package com.example.demo11_11.ThanhToan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.demo11_11.R;

import java.util.ArrayList;

public class Thanh_Toan_Momo extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageAdapter adapter;
    ArrayList<ImageThanhToan> ds;
    String momo, viettel, zalo, air;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinh_thuc_thanh_toan_momo);
        Intent intent = getIntent();
        recyclerView = findViewById(R.id.recyclerHinhAnh);
        ds = new ArrayList<>();
        if(intent != null){
            momo = intent.getStringExtra(ThanhToan.MOMO);
            viettel = intent.getStringExtra(ThanhToan.VIETTEL);
            zalo = intent.getStringExtra(ThanhToan.ZALO);
            air = intent.getStringExtra(ThanhToan.AIR);
            if(momo != null){
                ds.add(new ImageThanhToan(R.drawable.momo_logo));
            }
            if(viettel != null){
                ds.add(new ImageThanhToan(R.drawable.viettelpay));
            }
            if(zalo != null){
                ds.add(new ImageThanhToan(R.drawable.zalopay));
            }
            if(air != null){
                ds.add(new ImageThanhToan(R.drawable.airpay));
            }
        }

        adapter = new ImageAdapter(this,ds);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);
    }
}