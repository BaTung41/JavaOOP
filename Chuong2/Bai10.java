package Chuong2;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoikytu;
        char kytu;
        int dem = 0;
        System.out.print("Nhap vao mot chuoi khong qua 80 ki tu : ");
        chuoikytu = scanner.nextLine();
        if (chuoikytu.length() > 80) {
            System.out.print("Chuoi qua dai. Xin nhap lai : ");
            return;
        }

        System.out.print("Nhap ky tu bat ky : ");
        kytu = scanner.next().charAt(0);
        for (int i = 0; i < chuoikytu.length(); i++) {
            if (chuoikytu.charAt(i) == kytu) {
                dem++;
            }
        }
        System.out.println("So lan xuat hien chu cai " + kytu + " la : " + dem);

        scanner.close();
    }
}
