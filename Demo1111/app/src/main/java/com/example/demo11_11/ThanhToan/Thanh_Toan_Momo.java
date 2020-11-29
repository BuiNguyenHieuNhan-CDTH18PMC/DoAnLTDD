package com.example.demo11_11.ThanhToan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.demo11_11.R;

import java.util.ArrayList;

public class Thanh_Toan_Momo extends AppCompatActivity {
    ArrayList<ImageThanhToan> dsAnh;
    RecyclerView recyclerView;
    ImageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinh_thuc_thanh_toan_momo);
        recyclerView = findViewById(R.id.recyclerView);
        dsAnh = new ArrayList<>();
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        int momo = bundle.getInt("MOMO");
        int viettel = bundle.getInt("VIETTEL");
        int zalo = bundle.getInt("ZALO");
        int airpay = bundle.getInt("AIRPAY");
        if(momo == R.drawable.momo_logo) {
            dsAnh.add(new ImageThanhToan(R.drawable.momo_logo));
        }
        if (viettel == R.drawable.viettelpay){
            dsAnh.add(new ImageThanhToan(R.drawable.viettelpay));
        }
        if (zalo == R.drawable.zalopay){
            dsAnh.add(new ImageThanhToan(R.drawable.zalopay));
        }
        if (airpay == R.drawable.airpay){
            dsAnh.add(new ImageThanhToan(R.drawable.airpay));
        }
        LinearLayoutManager doc = new LinearLayoutManager(getApplication(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(doc);
        adapter = new ImageAdapter(getApplication(),dsAnh);
        recyclerView.setAdapter(adapter);
    }
}