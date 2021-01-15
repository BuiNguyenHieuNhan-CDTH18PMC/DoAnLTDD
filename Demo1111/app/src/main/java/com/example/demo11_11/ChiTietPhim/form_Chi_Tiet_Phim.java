package com.example.demo11_11.ChiTietPhim;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

import com.example.demo11_11.R;
import com.example.demo11_11.ThanhToan.form_Ghe;

public class form_Chi_Tiet_Phim extends AppCompatActivity {
    Button btnDatVe;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form__chi__tiet__phim);
        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.view_pager);
        mTabLayout.setupWithViewPager(mViewPager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ThongTin(),"Thông tin");
        adapter.addFragment(new LichChieu(),"Lịch chiếu");
        adapter.addFragment(new BinhLuan(),"Bình luận");
        //cài ViewPagerAdapter vào ViewPager
        mViewPager.setAdapter(adapter);
        //cài ViewPager vào TabLayout
        mTabLayout.setupWithViewPager(mViewPager);
    }

    public void Buy(View view){
        Intent intent = new Intent(form_Chi_Tiet_Phim.this,form_Ghe.class);
        startActivity(intent);
    }
}