package com.example.demo11_11.DangNhap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.example.demo11_11.MainActivity;
import com.example.demo11_11.R;

public class Form_Dang_Nhap extends AppCompatActivity {
    private Toolbar toolbar;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form__dang__nhap);
    }

}