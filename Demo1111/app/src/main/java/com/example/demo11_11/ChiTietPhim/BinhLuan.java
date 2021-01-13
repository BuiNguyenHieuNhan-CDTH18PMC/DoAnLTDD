package com.example.demo11_11.ChiTietPhim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.demo11_11.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.example.demo11_11.DangNhap.Form_Dang_Nhap.EXTRA_IDUSER;
import static com.example.demo11_11.GridView.GridViewTab1.EXTRA_ID;

public class BinhLuan extends Fragment {
    TextView nd, diem;
    String phim, tk;
    ArrayList<ListBinhLuan> dsBinhLuan;
    RecyclerView recyclerView;
    BinhLuanAdapter adapter;
    Button btnNhap;
    Intent intent;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_binh_luan, container, false);
        intent = getActivity().getIntent();
        recyclerView = view.findViewById(R.id.showbinhluan);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false));

        nd = view.findViewById(R.id.edit_formBinhLuan_ND);
        diem = view.findViewById(R.id.edit_formBinhLuan_DG);
        btnNhap = view.findViewById(R.id.btn_binhluan);
        tk = intent.getStringExtra(EXTRA_IDUSER);
        phim = intent.getStringExtra(EXTRA_ID);

        dsBinhLuan = new ArrayList<>();
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addBinhLuan();
            }
        });
        return view;
    }

    public void addBinhLuan(){
        String url = "http://192.168.1.106/api_doan/binh_luan";
        RequestQueue request = Volley.newRequestQueue(getContext());
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.equals("them thanh cong")){
                    Intent intent = new Intent(getContext(),ThongTin.class);
                    startActivity(intent);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

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

    }
}