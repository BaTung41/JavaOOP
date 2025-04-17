package Chuong2;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        while (tong <= 100) {
            System.out.print("Nhap so: ");
            int so = scanner.nextInt();
            tong += so;
            System.out.println("Tong: " + tong);
        }
        System.out.println("Tong cua cac so: " + tong);
        System.out.println("Tong >100");

        scanner.close();
    }
}