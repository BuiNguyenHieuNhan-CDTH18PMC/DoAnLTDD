package com.example.demo11_11.DangNhap;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.demo11_11.MainActivity;
import com.example.demo11_11.R;

import java.util.HashMap;
import java.util.Map;

public class form_Dang_Ki extends AppCompatActivity {
    EditText tk, mk, sdt, email;
    RadioGroup radioGroup;
    Button dk;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form__dang__ki);
        tk = findViewById(R.id.edit_formDK_TK);
        mk = findViewById(R.id.edit_formDK_MK);
        sdt = findViewById(R.id.edit_formDK_SDT);
        email = findViewById(R.id.edit_formDK_Email);
        radioGroup = findViewById(R.id.group);

        dk = findViewById(R.id.button);
        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taikhoan, matkhau, sodt, Email;
                taikhoan = tk.getText().toString();
                matkhau = mk.getText().toString();
                sodt = sdt.getText().toString();
                Email = email.getText().toString();
                int checkradio = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = radioGroup.findViewById(checkradio);
                if(taikhoan.isEmpty() ||matkhau.isEmpty() ||sodt.isEmpty()||Email.isEmpty()){
                    Toast.makeText(form_Dang_Ki.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(radioButton == null){
                        Toast.makeText(form_Dang_Ki.this, "Vui lòng chọn giới tính", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        String gioitinh = radioButton.getText().toString();
                        DK(taikhoan, matkhau, sodt, Email, gioitinh);
                    }
                }
            }
        });

    }
    public void DK(String taikhoan, String matkhau, String sdt, String email, String gioitinh){
        String url = "http://192.168.1.7/api_doan/dangki.php";
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.equals("tao thanh cong")){
                    Toast.makeText(form_Dang_Ki.this, "Đăng kí thành công", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(form_Dang_Ki.this, MainActivity.class));
                    finish();
                }
                else {
                    Toast.makeText(form_Dang_Ki.this, "Đăng kí thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(form_Dang_Ki.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }){
            protected Map<String, String> getParams() throws AuthFailureError{
                Map<String, String> parmas = new HashMap<>();
                parmas.put("taikhoan",taikhoan);
                parmas.put("matkhau",matkhau);
                parmas.put("sdt",sdt);
                parmas.put("email",email);
                parmas.put("gioitinh",gioitinh);

                return parmas;
            }
        };
        requestQueue.add(stringRequest);
    }

}