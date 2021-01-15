package com.example.demo11_11.GridView;

public class ListMovie {
    private String id;
    private String phim_ten;
    private String ten_the_loai;
    private String phim_thoi_luong_id;
    private String phim_image;
    private String phim_ngay_cong_chieu;
    private String phim_noi_dung;
    private String phim_dao_dien;
    private String phim_dien_vien;
    private String phim_quoc_gia;
    private String video;

    public ListMovie(String id,String image, String ten, String tl, String thoiluong, String ngay, String nd, String dd, String dv, String qg, String video){
        this.id = id;
        this.phim_image = image;
        this.phim_ten = ten;
        this.ten_the_loai = tl;
        this.phim_thoi_luong_id = thoiluong;
        this.phim_ngay_cong_chieu = ngay;
        this.phim_noi_dung = nd;
        this.phim_dao_dien = dd;
        this.phim_dien_vien = dv;
        this.phim_quoc_gia = qg;
        this.video = video;
    }

    public String getPhim_ten() {
        return phim_ten;
    }

    public void setPhim_ten(String phim_ten) {
        this.phim_ten = phim_ten;
    }

    public String getTen_the_loai() {
        return ten_the_loai;
    }

    public void setTen_the_loai(String ten_the_loai) {
        this.ten_the_loai = ten_the_loai;
    }

    public String getPhim_thoi_luong_id() {
        return phim_thoi_luong_id;
    }

    public void setPhim_thoi_luong_id(String phim_thoi_luong_id) {
        this.phim_thoi_luong_id = phim_thoi_luong_id;
    }

    public String getPhim_image() {
        return phim_image;
    }

    public void setPhim_image(String phim_image) {
        this.phim_image = phim_image;
    }

    public String getPhim_ngay_cong_chieu() {
        return phim_ngay_cong_chieu;
    }

    public void setPhim_ngay_cong_chieu(String phim_ngay_cong_chieu) {
        this.phim_ngay_cong_chieu = phim_ngay_cong_chieu;
    }

    public String getPhim_noi_dung() {
        return phim_noi_dung;
    }

    public void setPhim_noi_dung(String phim_noi_dung) {
        this.phim_noi_dung = phim_noi_dung;
    }

    public String getPhim_dao_dien() {
        return phim_dao_dien;
    }

    public void setPhim_dao_dien(String phim_dao_dien) {
        this.phim_dao_dien = phim_dao_dien;
    }

    public String getPhim_dien_vien() {
        return phim_dien_vien;
    }

    public void setPhim_dien_vien(String phim_dien_vien) {
        this.phim_dien_vien = phim_dien_vien;
    }

    public String getPhim_quoc_gia() {
        return phim_quoc_gia;
    }

    public void setPhim_quoc_gia(String phim_quoc_gia) {
        this.phim_quoc_gia = phim_quoc_gia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}


