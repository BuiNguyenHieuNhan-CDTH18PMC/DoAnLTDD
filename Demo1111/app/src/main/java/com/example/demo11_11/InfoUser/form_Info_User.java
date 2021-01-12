package com.example.demo11_11.InfoUser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.demo11_11.R;

public class form_Info_User extends AppCompatActivity {

    Button thongtin, giaodich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_thong_tin);
        thongtin = findViewById(R.id.btnthongtin);
        giaodich = findViewById(R.id.btniaodich);

        thongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tk =new Intent(form_Info_User.this,form_Thong_Tin.class);
                startActivity(tk);
            }
        });

        giaodich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gd =new Intent(form_Info_User.this,form_Giao_dich.class);
                startActivity(gd);
            }
        });

    }
}