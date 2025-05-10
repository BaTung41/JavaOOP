package Shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        ten = "Hình vuông";
    }

    public void nhapCanh() {
        System.out.print("Cạnh = ");
        Scanner sc = new Scanner(System.in);
        dai = rong = sc.nextFloat(); // Cạnh vuông thì chiều dài và chiều rộng bằng nhau
    }

}