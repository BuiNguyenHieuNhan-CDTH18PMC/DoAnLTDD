package com.example.demo11_11;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerImageMovie extends RecyclerView.Adapter<RecyclerImageMovie.ViewHolder>{
    private List<ImageMovie> dsAnh;
    private Context context;

    RecyclerImageMovie(Context context, List<ImageMovie> ds){
        this.dsAnh = ds;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ImageMovie image = dsAnh.get(i);
        Picasso.with(context).load(image.phim_image).into(viewHolder.anh);
    }

    @Override
    public int getItemCount() {
        return dsAnh.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView anh;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            anh = itemView.findViewById(R.id.imageView);
        }
    }
}
