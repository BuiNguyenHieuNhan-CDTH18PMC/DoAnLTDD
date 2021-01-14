package com.example.demo11_11.InfoUser;

import android.app.DatePickerDialog;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.demo11_11.DangNhap.User;
import com.example.demo11_11.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import static android.widget.Toast.LENGTH_LONG;
import static com.example.demo11_11.DangNhap.Form_Dang_Nhap.EXTRA_GIOITINH;
import static com.example.demo11_11.DangNhap.Form_Dang_Nhap.EXTRA_NAME;
import static com.example.demo11_11.DangNhap.Form_Dang_Nhap.EXTRA_NGAY;
import static com.example.demo11_11.DangNhap.Form_Dang_Nhap.EXTRA_SDT;

public class form_Thong_Tin extends AppCompatActivity {
    String shareProFile = "com.kt_dn.login";
    EditText hoten, sdt, ngaysinh, gioitinh;
    String name, phone, day, sex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form__thong__tin);
        SharedPreferences mPreferences = getSharedPreferences(shareProFile,MODE_PRIVATE);

        hoten = findViewById(R.id.editTextHoTen);
        sdt = findViewById(R.id.editTextSDT);
        ngaysinh = findViewById(R.id.ngay);
        gioitinh = findViewById(R.id.editTextGioiTinh);

        name = mPreferences.getString(EXTRA_NAME,"null");
        phone = mPreferences.getString(EXTRA_SDT,"null");
        day = mPreferences.getString(EXTRA_NGAY,"null");
        sex = mPreferences.getString(EXTRA_GIOITINH,"null");

        hoten.setText(name);
        sdt.setText(phone);
        ngaysinh.setText(day);
        gioitinh.setText(sex);
    }
}