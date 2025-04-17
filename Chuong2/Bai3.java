package Chuong2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int tuoi, nam;
        String ten;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten: ");
        ten = scanner.nextLine();
        System.out.println("Nam sinh: ");
        nam = scanner.nextInt();

        tuoi = 2024 - nam;
        if (tuoi < 16) {
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien");
        } else if (tuoi >= 16 || tuoi < 18) {
            System.out.println("Ban " + ten + " o do tuoi truong thanh");
        } else {
            System.out.println("Ban " + ten + " da gia");
        }

        scanner.close();

    }

}
