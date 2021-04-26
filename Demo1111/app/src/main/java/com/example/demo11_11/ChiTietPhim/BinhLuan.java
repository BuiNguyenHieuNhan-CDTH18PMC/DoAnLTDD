package com.example.demo11_11.ChiTietPhim;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.demo11_11.R;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.example.demo11_11.DangNhap.Form_Dang_Nhap.EXTRA_IDUSER;
import static com.example.demo11_11.GridView.GridViewTab1.EXTRA_ID;

public class BinhLuan extends Fragment {
    TextView nd, diem;
    String tk, phim;
    ArrayList<ListBinhLuan> dsBinhLuan;
    RecyclerView recyclerView;
    BinhLuanAdapter adapter;
    Button btnNhap;
    Intent intent;
    SharedPreferences mPreferences, mPreferences1;
    String sharedproFile = "com.kt_dn.login";
    String shareProFileShow = "com.show_phim.dang_chieu";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_binh_luan, container, false);
        intent = getActivity().getIntent();
        recyclerView = view.findViewById(R.id.showbinhluan);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false));
        mPreferences= this.getActivity().getSharedPreferences(sharedproFile, Context.MODE_PRIVATE);
        mPreferences1= this.getActivity().getSharedPreferences(shareProFileShow, Context.MODE_PRIVATE);

        nd = view.findViewById(R.id.edit_formBinhLuan_ND);
        diem = view.findViewById(R.id.edit_formBinhLuan_DG);
        btnNhap = view.findViewById(R.id.btn_binhluan);
        tk = mPreferences.getString(EXTRA_IDUSER,"null");
        phim = mPreferences1.getString(EXTRA_ID,"null");
    
        showBinhLuan();
        dsBinhLuan = new ArrayList<>();
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tk!="null") {
                    addBinhLuan();
                }
                else {
                    Toast.makeText(getContext(), "Vui lòng đăng nhập trước khi bình luận", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

    public void addBinhLuan(){
        String url = "http://192.168.1.103/api_doan/binh_luan";
        RequestQueue request = Volley.newRequestQueue(getContext());
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.equals("them thanh cong")){
                    Intent intent = new Intent(getContext(),BinhLuan.class);
                    startActivity(intent);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }){
            protected Map<String , String> getParams() throws AuthFailureError {
                Map<String,String> params=new HashMap<>();
                params.put("noi_dung_binhluan",nd.getText().toString());
                params.put("danh_gia_phim",diem.getText().toString());
                params.put("phim_id",phim);
                params.put("user_id",tk);
                return params;
            }
        };
        request.add(stringRequest);
    }

    public void showBinhLuan(){
        String url ="http://10.16.209.200/api_doan/show_binh_luan";
        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                try{
                    for(int i =0;i<response.length();i++){
                        jsonObject = response.getJSONObject(i);

                        String nd = jsonObject.getString("noi_dung_binhluan");
                        String dg = jsonObject.getString("danh_gia_phim");
                        String ten = jsonObject.getString("tai_khoan");

                        ListBinhLuan listBinhLuan = new ListBinhLuan(ten,nd,dg);
                        dsBinhLuan.add(listBinhLuan);
                    }
                    adapter = new BinhLuanAdapter(getContext(),dsBinhLuan);
                    recyclerView.setAdapter(adapter);
                }catch (Exception e){
                    Toast.makeText(getContext(), "Lỗi kết nối", Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        requestQueue.add(jsonArrayRequest);
    }
}