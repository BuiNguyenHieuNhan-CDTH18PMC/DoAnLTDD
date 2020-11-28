package com.example.demo11_11.GridView;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.demo11_11.R;

import java.util.ArrayList;


public class GridViewTab2 extends Fragment {
    private ArrayList<ListMovie> ListImage;
    private ImageMovieGridAdapter adapter;
    private GridView gridView;
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
        return view;
    }
}