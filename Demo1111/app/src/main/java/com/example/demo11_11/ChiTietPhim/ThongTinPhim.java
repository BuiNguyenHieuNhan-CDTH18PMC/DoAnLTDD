package com.example.demo11_11.ChiTietPhim;

public class ThongTinPhim {
    private int Image;
    private String TenPhim;
    private String NoiDung;
    private String KiemDuyet;
    private String KhoiChieu;
    private String TheLoai;
    private String DaoDien;
    private String ThoiLuong;
    private String NgonNgu;
    private String DienVien;

    public ThongTinPhim(int image, String tenPhim, String noiDung, String kiemDuyet, String khoiChieu, String theLoai, String daoDien, String thoiLuong, String ngonNgu, String dienVien) {
        Image = image;
        TenPhim = tenPhim;
        NoiDung = noiDung;
        KiemDuyet = kiemDuyet;
        KhoiChieu = khoiChieu;
        TheLoai = theLoai;
        DaoDien = daoDien;
        ThoiLuong = thoiLuong;
        NgonNgu = ngonNgu;
        DienVien = dienVien;
    }

    public int getImage() {
        return Image;
    }

    public String getTenPhim() {
        return TenPhim;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public String getKiemDuyet() {
        return KiemDuyet;
    }

    public String getKhoiChieu() {
        return KhoiChieu;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public String getDaoDien() {
        return DaoDien;
    }

    public String getThoiLuong() {
        return ThoiLuong;
    }

    public String getNgonNgu() {
        return NgonNgu;
    }

    public String getDienVien() {
        return DienVien;
    }
}
