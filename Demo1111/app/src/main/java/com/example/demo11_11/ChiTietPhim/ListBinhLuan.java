package com.example.demo11_11.ChiTietPhim;

public class ListBinhLuan {
    private String noi_dung_binhluan;
    private String danh_gia_phim;
    private String tai_khoan;

    ListBinhLuan(String tk, String nd, String dg){
        this.tai_khoan = tk;
        this.noi_dung_binhluan = nd;
        this.danh_gia_phim = dg;
    }


    public void setNoi_dung_binhluan(String noi_dung_binhluan) {
        this.noi_dung_binhluan = noi_dung_binhluan;
    }

    public String getDanh_gia_phim() {
        return danh_gia_phim;
    }

    public void setDanh_gia_phim(String danh_gia_phim) {
        this.danh_gia_phim = danh_gia_phim;
    }

    public String getTai_khoan() {
        return tai_khoan;
    }

    public void setTai_khoan(String tai_khoan) {
        this.tai_khoan = tai_khoan;
    }

    public String getNoi_dung_binhluan() {
        return noi_dung_binhluan;
    }
}
