package com.example.demo11_11.ChiTietPhim;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.demo11_11.R;


public class ThongTin extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_thong_tin, container, false);
        VideoView videoView = (VideoView)view.findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+ getActivity().getPackageName()+"/"+R.raw.trailer_tiectrangmau);
        videoView.setVideoURI(uri);
        videoView.start();
        return view;
    }
}