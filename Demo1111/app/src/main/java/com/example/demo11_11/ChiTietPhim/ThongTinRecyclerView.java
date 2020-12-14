package com.example.demo11_11.ChiTietPhim;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.demo11_11.R;

import java.util.ArrayList;

public class ThongTinRecyclerView extends RecyclerView.Adapter<ThongTinRecyclerView.ViewHoler> {

    ArrayList<ThongTinPhim> ListThongTin;
    LayoutInflater mInflater;

    ThongTinRecyclerView(Context context, ArrayList<ThongTinPhim> ds){
        ListThongTin = ds;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.item_thongtin, viewGroup,false);
        return new ViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler viewHoler, int i) {
        ThongTinPhim thongTinPhim = ListThongTin.get(i);
        viewHoler.imageView.setImageResource(thongTinPhim.getImage());
        viewHoler.tenphim.setText(thongTinPhim.getTenPhim());
        viewHoler.kd.setText(thongTinPhim.getKiemDuyet());
        viewHoler.kc.setText(thongTinPhim.getKhoiChieu());
        viewHoler.tl.setText(thongTinPhim.getTheLoai());
        viewHoler.dd.setText(thongTinPhim.getDaoDien());
        viewHoler.tluong.setText(thongTinPhim.getThoiLuong());
        viewHoler.nn.setText(thongTinPhim.getNgonNgu());
        viewHoler.nd.setText(thongTinPhim.getNoiDung());
        viewHoler.dv.setText(thongTinPhim.getDienVien());
    }

    @Override
    public int getItemCount() {
        return ListThongTin.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tenphim, nd;
        EditText kd, kc, tl, dd, tluong, nn, dv;

        public ViewHoler(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_formThongTin_anh);
            tenphim = itemView.findViewById(R.id.tv_formThongTin_TenPhim);
            nd = itemView.findViewById(R.id.tv_formThongTin_NoiDung);
            kd = itemView.findViewById(R.id.edit_formThongTin_KiemDuyet);
            kc = itemView.findViewById(R.id.edit_formThongTin_KhoiChieu);
            tl = itemView.findViewById(R.id.edit_formThongTin_TheLoai);
            dd = itemView.findViewById(R.id.edit_formThongTin_DaoDien);
            tluong = itemView.findViewById(R.id.edit_formThongTin_ThoiLuong);
            nn = itemView.findViewById(R.id.edit_formThongTin_NgonNgu);
            dv = itemView.findViewById(R.id.edit_formThongTin_DienVien);
        }
    }
}
