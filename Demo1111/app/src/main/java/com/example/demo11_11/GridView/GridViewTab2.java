package com.example.demo11_11.GridView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.demo11_11.ChiTietPhim.form_Chi_Tiet_Phim;
import com.example.demo11_11.R;

import java.util.ArrayList;


public class GridViewTab2 extends Fragment {
    private ArrayList<ListMovie> ListImage;
    private ImageMovieGridAdapter adapter;
    private GridView gridView;
    private Intent intent;
    public static String TT = "tt";
    public static String HH = "gd";
    public static String PT = "pt";
    public static String VS = "vs";
    public static String ST = "st";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_grid_view_tab2, container, false);
        ListImage = new ArrayList<>();
        gridView = view.findViewById(R.id.gridtab2);
        ListImage.add(new ListMovie(R.drawable.trangquynh,"Trạng Quỳnh","Hài hước","Mọi đối tượng","3.5/5"));
        ListImage.add(new ListMovie(R.drawable.giadinhcroods,"Gia đình Croods: Kỷ nguyên mới","Hoạt hình ,Phiêu lưu","Mọi đối tượng","3.5/5"));
        ListImage.add(new ListMovie(R.drawable.phuthuy,"Phù thủy, phù thủy","Gia đình, Hài, Phiêu Lưu","Mọi đối tượng","3.5/5"));
        ListImage.add(new ListMovie(R.drawable.vi_sao_dua_ban_toi,"Jungle beat: the movie","Hoạt Hình, Gia Đình, Phiêu Lưu","Mọi đối tượng","3.5/5"));
        ListImage.add(new ListMovie(R.drawable.sieuthu,"Liên quân siêu thú","Hài","Mọi đối tượng","4.5/5"));
        adapter = new ImageMovieGridAdapter(getContext(),ListImage);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object object = gridView.getItemAtPosition(position);
                ListMovie listMovie = (ListMovie) object;
                switch (listMovie.getImage()) {
                    case R.drawable.trangquynh: {
                        intent = new Intent(getContext(), form_Chi_Tiet_Phim.class);
                        intent.putExtra(TT, "tt");
                        break;
                    }
                    case R.drawable.giadinhcroods: {
                        intent = new Intent(getContext(), form_Chi_Tiet_Phim.class);
                        intent.putExtra(HH, "gd");
                        break;
                    }
                    case R.drawable.phuthuy: {
                        intent = new Intent(getContext(), form_Chi_Tiet_Phim.class);
                        intent.putExtra(PT, "pt");
                        break;
                    }
                    case R.drawable.vi_sao_dua_ban_toi: {
                        intent = new Intent(getContext(), form_Chi_Tiet_Phim.class);
                        intent.putExtra(VS, "vs");
                        break;
                    }
                    case R.drawable.sieuthu: {
                        intent = new Intent(getContext(), form_Chi_Tiet_Phim.class);
                        intent.putExtra(ST, "st");
                        break;
                    }
                    default:
                        Toast.makeText(getContext(), "Lỗi dữ liệu", Toast.LENGTH_SHORT).show();
                }
                startActivity(intent);
            }
        });
        return view;
    }
}