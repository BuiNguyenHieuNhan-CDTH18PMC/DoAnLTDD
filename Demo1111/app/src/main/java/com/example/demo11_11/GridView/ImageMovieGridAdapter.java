package com.example.demo11_11.GridView;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demo11_11.ChiTietPhim.ThongTin;
import com.example.demo11_11.R;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class ImageMovieGridAdapter extends RecyclerView.Adapter<ImageMovieGridAdapter.ViewHolder>{
    private ArrayList<ListMovie> listMovies;
    private Context context;
    private OnItemClickListener mListener;


    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        this.mListener = listener;
    }

    ImageMovieGridAdapter(Context context, ArrayList<ListMovie> ds){
        this.listMovies = ds;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_phim,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ListMovie listMovie = listMovies.get(i);
        viewHolder.tenphim.setText(listMovie.getPhim_ten());
        viewHolder.theloai.setText(listMovie.getTen_the_loai());
        viewHolder.thoiluong.setText(listMovie.getPhim_thoi_luong_id());
        Picasso.with(context).load(listMovie.getPhim_image()).error(R.drawable.error).into(viewHolder.image);
    }

    @Override
    public int getItemCount() {
        return listMovies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView tenphim, theloai, thoiluong;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_list_phim);
            tenphim = itemView.findViewById(R.id.edit_phim_ten_lismovie);
            theloai = itemView.findViewById(R.id.edit_the_loai_lismovie);
            thoiluong = itemView.findViewById(R.id.edit_thoi_luong_lismovie);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mListener != null){
                        int position = getAdapterPosition();
                        if(position!= RecyclerView.NO_POSITION){
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }

    }
}
