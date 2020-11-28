package com.example.demo11_11.GridView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.demo11_11.ChiTietPhim.form_Chi_Tiet_Phim;
import com.example.demo11_11.MainActivity;
import com.example.demo11_11.R;

import java.util.ArrayList;

public class GridViewTab1 extends Fragment {
    private ImageMovieGridAdapter adapter;
    private ArrayList<ListMovie> ListImage;
    private GridView gridView;
    private Intent intent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //gọi đến fragment grid view tab 1
        View view = inflater.inflate(R.layout.fragment_grid_view_tab1, container, false);
        //gọi grid view
        gridView = view.findViewById(R.id.gridtab1);
        //tạo danh sách
        ListImage = new ArrayList<>();
        //thêm thông tin vào danh sách
        ListImage.add(new ListMovie(R.drawable.anime, "Anime", "Hoạt hình, Phiêu lưu", ">14", "3.5/5"));
        ListImage.add(new ListMovie(R.drawable.chi_muoi_ba, "Chị Mười Ba: 3 ngày sinh tử", "Phiêu lưu", "16", "3.5/5"));
        ListImage.add(new ListMovie(R.drawable.four, "Fantastic Four", "Viễn tưởng, Hành động", "16", "3.5/5"));
        ListImage.add(new ListMovie(R.drawable.hoathinh, "Liên minh thú cưng", "Hoạt hình", "Mọi đối tượng", "3.5/5"));
        ListImage.add(new ListMovie(R.drawable.tiec_trang_mau, "Tiệc trăng máu", "Hài, Tâm Lý", ">18", "4.5/5"));
        adapter = new ImageMovieGridAdapter(getContext(), ListImage);
        gridView.setAdapter(adapter);
        //khi nhấp vào 1 item trên GridView
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object object = gridView.getItemAtPosition(position);
                ListMovie listMovie = (ListMovie)object;
                switch (listMovie.getImage()){
                    case R.drawable.anime:{
                        Toast.makeText(getContext(), "Anime", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.drawable.chi_muoi_ba:{
                        Toast.makeText(getContext(), "Chị mười ba", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.drawable.four:{
                        Toast.makeText(getContext(), "Fantastic Four", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.drawable.hoathinh:{
                        Toast.makeText(getContext(), "Liên minh thú cưng", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.drawable.tiec_trang_mau:{
                        intent = new Intent(getContext(), form_Chi_Tiet_Phim.class);
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