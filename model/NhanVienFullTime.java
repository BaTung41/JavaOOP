package model;

import util.Configs;

public class NhanVienFullTime extends NhanVien {
    private int loaiChucVu;
    private int soNgayLamThem;

    public NhanVienFullTime(String ten) {
        super(ten);
        this.loaiChucVu = Configs.NHAN_VIEN_LINH;
        this.soNgayLamThem = 0;
    }

    // Constructor có tham số
    public NhanVienFullTime(String ten, int soNgayLamThem) {
        super(ten);
        this.loaiChucVu = Configs.NHAN_VIEN_LINH; // Mặc định là nhân viên thường
        this.soNgayLamThem = soNgayLamThem;
    }

    // Setter cho loại chức vụ
    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    protected String loaiNhanVien() {
        return loaiChucVu == Configs.NHAN_VIEN_SEP ? "Nhân viên Full-Time (Sếp)" : "Nhân viên Full-Time (Lính)";
    }

    public void tinhLuong() {
        if (loaiChucVu == Configs.NHAN_VIEN_SEP) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + soNgayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        } else {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + soNgayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}