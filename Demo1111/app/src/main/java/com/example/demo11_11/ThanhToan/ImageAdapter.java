package com.example.demo11_11.ThanhToan;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.demo11_11.ImageMovie;
import com.example.demo11_11.R;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHoler> {
    private ArrayList<ImageThanhToan> dsAnh;
    private LayoutInflater mInflater;

    public ImageAdapter(Context context, ArrayList<ImageThanhToan> dsAnh) {
        this.dsAnh = dsAnh;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.imagethanhtoan_item,viewGroup,false);
        return new ViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler viewHoler, int i) {
        ImageThanhToan imageThanhToan =  dsAnh.get(i);
        viewHoler.imageView.setImageResource(imageThanhToan.getImage());
    }

    @Override
    public int getItemCount() {
        return dsAnh.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder{
        ImageView imageView;
        public ViewHoler(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView3);
        }
    }
}
