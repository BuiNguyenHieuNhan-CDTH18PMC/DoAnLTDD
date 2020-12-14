package com.example.demo11_11.ChiTietPhim;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demo11_11.R;

import java.util.ArrayList;


public class ThongTin extends Fragment {

    private ArrayList<ThongTinPhim> ListThongTin;
    private RecyclerView recyclerView;
    private ThongTinRecyclerView adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_thong_tin, container, false);
        recyclerView = view.findViewById(R.id.rv_ThongTin);
        ListThongTin = new ArrayList<>();
        ListThongTin.add(new ThongTinPhim(R.drawable.tiec_trang_mau,"Tiệc Trăng Máu","Trong buổi họp mặt của nhóm bạn thân, một thành viên bất ngờ đề xuất trò chơi chia sẻ điện thoại nhằm tăng tinh thần đoàn kết. Từ đó, những góc khuất của từng người dần hé lộ và khiến cho mối quan hệ vốn khắn khít của họ bắt đầu lay chuyển",
                "C18 - Phim cấm khán giả dưới 18 tuổi","23 Thg 10 2020","Hài, Tâm Lý","Nguyễn Quang","1 giờ 58 phút","Tiếng Việt - Phụ đề Tiếng Anh","Thái Hòa, Đức Thịnh, Hồng Ánh, Hứa Vỹ Văn, Thu Trang"));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        adapter = new ThongTinRecyclerView(getContext(),ListThongTin);
        recyclerView.setAdapter(adapter);
        return view;
    }
}