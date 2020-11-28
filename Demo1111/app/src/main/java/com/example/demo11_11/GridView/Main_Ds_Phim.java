package com.example.demo11_11.GridView;

import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import com.example.demo11_11.R;
import com.example.demo11_11.TabAdapter;

public class Main_Ds_Phim extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    TabAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__ds__phim);
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new GridViewTab1(),"Đang chiếu");
        adapter.addFragment(new GridViewTab2(),"Sắp chiếu");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search,menu);
        return super.onCreateOptionsMenu(menu);
    }
}