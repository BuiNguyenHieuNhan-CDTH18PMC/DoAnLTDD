package com.example.demo11_11.GridView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
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
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GridViewTab1 extends Fragment {
    private ImageMovieGridAdapter adapter;
    private ArrayList<ListMovie> ListImage;
    private GridView gridView;
    private Intent intent;
    public static String ANIME = "anime";
    public static String CMB = "cbm";
    public static String FOUR = "four";
    public static String HOATHINH = "hh";
    public static String TTM = "ttm";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //gọi đến fragment grid view tab 1
        View view = inflater.inflate(R.layout.fragment_grid_view_tab1, container, false);
        final RecyclerView recyclerView = view.findViewById(R.id.list_phim_tab1);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));

        OkHttpClient okHttpClient = new OkHttpClient();

        Moshi moshi = new Moshi.Builder().build();
        Type type = Types.newParameterizedType(List.class, ListMovie.class);
        final JsonAdapter<List<ListMovie>> jsonAdapter = moshi.adapter(type);

        Request request = new Request.Builder().url("http://192.168.1.106/api_doan/show_movie_dang_chieu").build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("Error","Network Error");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String json = response.body().string();
                final List<ListMovie> ds = jsonAdapter.fromJson(json);

                // Cho hiển thị lên RecyclerView.
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        recyclerView.setAdapter(new ImageMovieGridAdapter(getContext(),ds));
                        recyclerView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                    }
                });
            }
        });
        return view;
    }
}