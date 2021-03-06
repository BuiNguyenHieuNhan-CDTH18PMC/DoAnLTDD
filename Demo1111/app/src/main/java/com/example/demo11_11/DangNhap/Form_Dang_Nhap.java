package com.example.demo11_11.DangNhap;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Authenticator;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.demo11_11.ChiTietPhim.form_Chi_Tiet_Phim;
import com.example.demo11_11.GridView.Main_Ds_Phim;
import com.example.demo11_11.MainActivity;
import com.example.demo11_11.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Form_Dang_Nhap extends AppCompatActivity {

    public static String EXTRA_IDUSER = "id_user";
    public static String EXTRA_NAME = "ho_ten";
    public static String EXTRA_USERNAME = "tai_khoan";
    public static String EXTRA_GIOITINH = "gioi_tinh";
    public static String EXTRA_SDT = "sdt";
    public static String EXTRA_NGAY = "ngay_sinh";

    EditText tk, mk;
    Button btn;
    SharedPreferences mPreferences;
    String sharedprofFile="com.kt_dn.login";
    SharedPreferences.Editor preferencesEditor;

    private String url = "http://192.168.1.103/api_doan/KT_dn.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form__dang__nhap);
        //lấy EditText
        tk = findViewById(R.id.edit_formDN_tk);
        mk = findViewById(R.id.edit_formDN_mk);
        btn = findViewById(R.id.bth_DN);
        mPreferences=getSharedPreferences(sharedprofFile,MODE_PRIVATE);
        preferencesEditor = mPreferences.edit();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tạo string de giu gia tri nhap trong EditText
                String taikhoan=tk.getText().toString().trim();
                String matkhau=mk.getText().toString().trim();
                //kiểm tra string do ó null ko
                if (taikhoan.isEmpty()||matkhau.isEmpty()){
                    Toast.makeText(getApplicationContext(),"VUi LÒNG NHẬP ĐẦY ĐỦ THÔNG TIN",Toast.LENGTH_LONG).show();
                }else {
                   DN(url);
                }
            }
        });

    }
    public void DN(String url){
        //cần để cài api bắt buộc (theo tôi)
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String success = jsonObject.getString("success");
                    String message = jsonObject.getString("message");
                    String iduser = jsonObject.getString("id_user");
                    String hoten = jsonObject.getString("ho_ten");
                    String taikhoan = jsonObject.getString("tai_khoan");
                    String gioitinh = jsonObject.getString("gioi_tinh");
                    String ngay = jsonObject.getString("ngay_sinh");
                    String sdt = jsonObject.getString("sdt");
                    if(success.equals("1")){
                        preferencesEditor.putString(EXTRA_IDUSER,iduser);
                        preferencesEditor.putString(EXTRA_NAME,hoten);
                        preferencesEditor.putString(EXTRA_USERNAME,taikhoan);
                        preferencesEditor.putString(EXTRA_GIOITINH,gioitinh);
                        preferencesEditor.putString(EXTRA_NGAY,ngay);
                        preferencesEditor.putString(EXTRA_SDT,sdt);
                        preferencesEditor.apply();
                        Intent intent = new Intent(Form_Dang_Nhap.this,MainActivity.class);
                        startActivity(intent);
                    }
                    if(success.equals("0")){
                        Toast.makeText(Form_Dang_Nhap.this, message, Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Form_Dang_Nhap.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }){
            protected Map<String , String> getParams() throws AuthFailureError{
                Map<String,String> params=new HashMap<>();
                //"tai_khoan" theo $_POST['tai_khoan'] php
                params.put("tai_khoan",tk.getText().toString().trim());
                params.put("mat_khau",mk.getText().toString().trim());

                return params;
            }
        };
        requestQueue.add(stringRequest);
    }
}