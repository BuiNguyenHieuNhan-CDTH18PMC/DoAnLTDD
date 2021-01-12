package com.example.demo11_11;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class tab2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);
        final RecyclerView recyclerView = view.findViewById(R.id.tab2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        OkHttpClient client = new OkHttpClient();

        Moshi moshi = new Moshi.Builder().build();
        Type usersType = Types.newParameterizedType(List.class, ImageMovie.class);
        final JsonAdapter<List<ImageMovie>> jsonAdapter = moshi.adapter(usersType);

        Request request = new Request.Builder().url("http://192.168.43.183/api_doan/show_movie_sap_chieu").build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("Error","Network Error");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String json = response.body().string();
                final List<ImageMovie> movie = jsonAdapter.fromJson(json);

                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        recyclerView.setAdapter(new RecyclerImageMovie(getContext(),movie));
                    }
                });
            }
        });

        return view;
    }
}