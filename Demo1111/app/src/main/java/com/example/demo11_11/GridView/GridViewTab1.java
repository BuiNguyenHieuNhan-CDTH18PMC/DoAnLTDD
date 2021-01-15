package com.example.demo11_11.GridView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.demo11_11.ChiTietPhim.ThongTin;
import com.example.demo11_11.ChiTietPhim.form_Chi_Tiet_Phim;
import com.example.demo11_11.DangNhap.Form_Dang_Nhap;
import com.example.demo11_11.MainActivity;
import com.example.demo11_11.R;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;

import static android.widget.Toast.LENGTH_LONG;

public class GridViewTab1 extends Fragment implements ImageMovieGridAdapter.OnItemClickListener {
    public static String EXTRA_ID = "id";
    public static String EXTRA_NAME = "phim_ten";
    public static String EXTRA_IMAGE = "phim_image";
    public static String EXTRA_CONTENT  = "phim_noi_dung";
    public static String EXTRA_PREMIERE = "phim_ngay_cong_chieu";
    public static String EXTRA_CATEGORY = "ten_the_loai";
    public static String EXTRA_DIRECTORS = "phim_dao_dien";
    public static String EXTRA_CAST = "phim_dien_vien";
    public static String EXTRA_TIME = "phim_thoi_luong_id";
    public static String EXTRA_NATION = "phim_quoc_gia";
    public static String EXTRA_VIDEO = "video";

    ArrayList<ListMovie> ds;
    RecyclerView recyclerView;
    ImageMovieGridAdapter adapter;
    SharedPreferences mPreferences;
    String shareProFile = "com.show_phim.dang_chieu";
    SharedPreferences.Editor editor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //gọi đến fragment grid view tab 1
        View view = inflater.inflate(R.layout.fragment_grid_view_tab1, container, false);
        mPreferences = this.getActivity().getSharedPreferences(shareProFile,Context.MODE_PRIVATE);
        editor = mPreferences.edit();
        recyclerView = (RecyclerView) view.findViewById(R.id.list_phim_tab1);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        ds = new ArrayList<>();
        json();

        return view;
    }

    public void json(){
        String url = "http://192.168.1.103/api_doan/show_movie_dang_chieu";
        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        JSONObject jsonObject = null;
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                jsonObject = response.getJSONObject(i);
                                String id = jsonObject.getString("id");
                                String image = jsonObject.getString("phim_image");
                                String ten = jsonObject.getString("phim_ten");
                                String theloai = jsonObject.getString("ten_the_loai");
                                String thoiluong = jsonObject.getString("phim_thoi_luong_id");
                                String ngaychieu = jsonObject.getString("phim_ngay_cong_chieu");
                                String nd = jsonObject.getString("phim_noi_dung");
                                String dd = jsonObject.getString("phim_dao_dien");
                                String dv = jsonObject.getString("phim_dien_vien");
                                String qg = jsonObject.getString("phim_quoc_gia");
                                String vd = jsonObject.getString("video");
                                ListMovie listMovie = new ListMovie(id,image,ten,theloai,thoiluong,ngaychieu,nd,dd,dv,qg,vd);
                                ds.add(listMovie);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            adapter = new ImageMovieGridAdapter(getContext(),ds);
                            recyclerView.setAdapter(adapter);
                            adapter.setOnItemClickListener(GridViewTab1.this);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(), "Lỗi", LENGTH_LONG).show();
            }
        });
        requestQueue.add(jsonArrayRequest);
    }

    @Override
    public void onItemClick(int position) {
        ListMovie listMovie = ds.get(position);
        editor.putString(EXTRA_ID,listMovie.getId());
        editor.putString(EXTRA_CAST,listMovie.getPhim_dien_vien());
        editor.putString(EXTRA_CATEGORY,listMovie.getTen_the_loai());
        editor.putString(EXTRA_CONTENT,listMovie.getPhim_noi_dung());
        editor.putString(EXTRA_DIRECTORS,listMovie.getPhim_dao_dien());
        editor.putString(EXTRA_IMAGE,listMovie.getPhim_image());
        editor.putString(EXTRA_NAME,listMovie.getPhim_ten());
        editor.putString(EXTRA_NATION,listMovie.getPhim_quoc_gia());
        editor.putString(EXTRA_PREMIERE,listMovie.getPhim_ngay_cong_chieu());
        editor.putString(EXTRA_TIME,listMovie.getPhim_thoi_luong_id());
        editor.putString(EXTRA_VIDEO,listMovie.getVideo());
        editor.apply();
        Intent intent = new Intent(getContext(),form_Chi_Tiet_Phim.class);
        startActivity(intent);
    }
}