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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.toolbox.StringRequest;
import com.example.demo11_11.GridView.GridViewTab1;
import com.example.demo11_11.GridView.GridViewTab2;
import com.example.demo11_11.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static com.example.demo11_11.GridView.GridViewTab1.EXTRA_CAST;
import static com.example.demo11_11.GridView.GridViewTab1.EXTRA_CATEGORY;
import static com.example.demo11_11.GridView.GridViewTab1.EXTRA_CONTENT;
import static com.example.demo11_11.GridView.GridViewTab1.EXTRA_DIRECTORS;
import static com.example.demo11_11.GridView.GridViewTab1.EXTRA_ID;
import static com.example.demo11_11.GridView.GridViewTab1.EXTRA_IMAGE;
import static com.example.demo11_11.GridView.GridViewTab1.EXTRA_NAME;
import static com.example.demo11_11.GridView.GridViewTab1.EXTRA_NATION;
import static com.example.demo11_11.GridView.GridViewTab1.EXTRA_PREMIERE;
import static com.example.demo11_11.GridView.GridViewTab1.EXTRA_TIME;


public class ThongTin extends Fragment {
    SharedPreferences mPreferences;
    String shareProFile = "com.show_phim.dang_chieu";
    TextView ten, nd;
    EditText khoichieu, theloai, daodien, dienvien, thoiluong, quocgia;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_thong_tin, container, false);
        mPreferences = getActivity().getSharedPreferences(shareProFile, Context.MODE_PRIVATE);

        String image = mPreferences.getString(EXTRA_IMAGE,"null");
        String tenphim = mPreferences.getString(EXTRA_NAME,"null");
        String noidung = mPreferences.getString(EXTRA_CONTENT,"null");
        String ngaychieu = mPreferences.getString(EXTRA_PREMIERE,"null");
        String theLoai = mPreferences.getString(EXTRA_CATEGORY,"null");
        String dd = mPreferences.getString(EXTRA_DIRECTORS,"null");
        String dv = mPreferences.getString(EXTRA_CAST,"null");
        String tl = mPreferences.getString(EXTRA_TIME,"null");
        String qg = mPreferences.getString(EXTRA_NATION,"null");

        ImageView imageView = view.findViewById(R.id.image_formThongTin_anh);
        ten = view.findViewById(R.id.tv_formThongTin_TenPhim);
        nd = view.findViewById(R.id.tv_formThongTin_NoiDung);
        khoichieu = view.findViewById(R.id.edit_formThongTin_KhoiChieu);
        theloai = view.findViewById(R.id.edit_formThongTin_TheLoai);
        daodien = view.findViewById(R.id.edit_formThongTin_DaoDien);
        dienvien = view.findViewById(R.id.edit_formThongTin_DienVien);
        thoiluong = view.findViewById(R.id.edit_formThongTin_ThoiLuong);
        quocgia = view.findViewById(R.id.edit_formThongTin_QuocGia);

        Picasso.with(getContext()).load(image).into(imageView);
        ten.setText(tenphim);
        nd.setText(noidung);
        khoichieu.setText(ngaychieu);
        theloai.setText(theLoai);
        daodien.setText(dd);
        dienvien.setText(dv);
        thoiluong.setText(tl);
        quocgia.setText(qg);
        return view;
    }
}