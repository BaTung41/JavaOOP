package model;

import util.Configs;

public class NhanVienPartTime extends NhanVien {
    private int soGioLam;

    public NhanVienPartTime(String ten, int soGioLam) {
        super(ten);
        this.soGioLam = soGioLam;
    }

    @Override
    protected String loaiNhanVien() {
        return "Nhân viên Part-Time";
    }

    public void tinhLuong() {
        luong = soGioLam * Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO;
    }
}