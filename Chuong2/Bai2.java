package Chuong2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int songuyen;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen:");
        songuyen = scanner.nextInt();
        if (songuyen % 2 != 0) {
            System.out.println("Day la so le");
        } else {
            if (songuyen == 0) {
                System.out.println("Day la so 0");
            } else {
                System.out.println("Day la so chan");
            }
        }
        scanner.close();
    }
}
