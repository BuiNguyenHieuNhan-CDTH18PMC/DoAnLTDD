package com.example.demo11_11.InfoUser;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.demo11_11.R;

import static com.example.demo11_11.DangNhap.Form_Dang_Nhap.EXTRA_NAME;

public class form_Info_User extends AppCompatActivity {
    SharedPreferences mPreferences;
    String share="com.kt_dn.login";
    Button thongtin, giaodich;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_thong_tin);
        mPreferences = getSharedPreferences(share,MODE_PRIVATE);

        textView = findViewById(R.id.txtName);
        thongtin = findViewById(R.id.btnthongtin);
        giaodich = findViewById(R.id.btniaodich);

        String ten = mPreferences.getString(EXTRA_NAME,null);
        textView.setText(ten);
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