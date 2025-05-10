package Shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;

    public HinhTru() {
        ten = "Hình trụ";
    }

    public void nhapChieuCao() {
        nhapBanKinh();
        System.out.print("Chiều cao = ");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextFloat();
    }

    public void tinhTheTich() {
        theTich = PI * banKinh * banKinh * chieuCao;
    }

}
