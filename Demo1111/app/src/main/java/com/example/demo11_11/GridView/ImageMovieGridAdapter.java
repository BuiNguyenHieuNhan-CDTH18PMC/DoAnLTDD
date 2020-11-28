package com.example.demo11_11.GridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demo11_11.R;

import java.util.ArrayList;

public class ImageMovieGridAdapter extends BaseAdapter implements Filterable {
    private ArrayList<ListMovie> listMovies;
    private ArrayList<ListMovie> listMoviesFilter;
    private LayoutInflater mInflater;
    private Context context;

    public ImageMovieGridAdapter(Context context, ArrayList<ListMovie> listMovies){
        this.listMovies = listMovies;
        this.listMoviesFilter = listMovies;
        mInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return listMovies.size();
    }

    @Override
    public Object getItem(int position) {
        return listMovies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.gridview_item,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.imageView =(ImageView)convertView.findViewById(R.id.imageView_Movie);
            viewHolder.DiemSo = (TextView) convertView.findViewById(R.id.change_DiemSo);
            viewHolder.DoTuoi =(TextView)convertView.findViewById(R.id.change_DoTuoi);
            viewHolder.TenPhim = (TextView)convertView.findViewById(R.id.change_TenPhim);
            viewHolder.TheLoai = (TextView)convertView.findViewById(R.id.change_TheLoai);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder)convertView.getTag();
        }
        ListMovie listMovie = this.listMovies.get(position);
        viewHolder.TenPhim.setText(listMovie.getTenPhim());
        viewHolder.TheLoai.setText(listMovie.getTheLoai());
        viewHolder.DoTuoi.setText(listMovie.getDoTuoi());
        viewHolder.DiemSo.setText(listMovie.getDiemSo());
        viewHolder.imageView.setImageResource(listMovie.getImage());
        return convertView;
    }

    @Override
    public Filter getFilter() {
        Filter filter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults filterResults = new FilterResults();
                if (constraint == null || constraint.length() == 0) {

                    filterResults.count = listMoviesFilter.size();
                    filterResults.values = listMoviesFilter;

                } else {

                    String searchChar = constraint.toString().toLowerCase();
                    ArrayList<ListMovie> search = new ArrayList<>();

                    for (ListMovie listMovie : listMoviesFilter) {
                        if (listMovie.getTenPhim().toLowerCase().contains(searchChar)) {
                            search.add(listMovie);
                        }
                    }

                    filterResults.count = listMoviesFilter.size();
                    filterResults.values = listMoviesFilter;
                }
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults filterResults) {
                listMovies = (ArrayList<ListMovie>) filterResults.values;
                notifyDataSetChanged();
            }
        };
        return filter;
    }

    static class ViewHolder{
        ImageView imageView;
        TextView TenPhim, TheLoai, DoTuoi, DiemSo;
    }
}
