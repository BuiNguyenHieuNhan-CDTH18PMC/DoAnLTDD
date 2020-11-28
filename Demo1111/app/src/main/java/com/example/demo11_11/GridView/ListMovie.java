package com.example.demo11_11.GridView;

public class ListMovie {
    private int Image;
    private String TenPhim;
    private String TheLoai;
    private String DoTuoi;
    private String DiemSo;

    ListMovie(int Image, String TenPhim, String TheLoai, String DoTuoi, String DiemSo){
        this.DoTuoi = DoTuoi;
        this.Image = Image;
        this.TenPhim = TenPhim;
        this.TheLoai = TheLoai;
        this.DiemSo = DiemSo;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTenPhim() {
        return TenPhim;
    }

    public void setTenPhim(String tenPhim) {
        TenPhim = tenPhim;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String theLoai) {
        TheLoai = theLoai;
    }

    public String getDoTuoi() {
        return DoTuoi;
    }

    public void setDoTuoi(String doTuoi) {
        DoTuoi = doTuoi;
    }

    public String getDiemSo() {
        return DiemSo;
    }

    public void setDiemSo(String diemSo) {
        DiemSo = diemSo;
    }
}
