package Shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    public HinhChuNhat() {
        ten = "Hình chữ nhật";
    }

    public void nhapChieuDai() {
        System.out.print("Chiều dài = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }

    public void nhapChieuRong() {
        System.out.print("Chiều rộng = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = (dai + rong) * 2;
    }

    public void tinhDienTich() {
        dienTich = dai * rong;
    }
}
