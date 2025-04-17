package Chuong2;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so ngay (2-8): ");
        int soNgay = scanner.nextInt();
        switch (soNgay) {
            case 2:
                System.out.println("Day la Thu Hai.");
                break;
            case 3:
                System.out.println("Day la Thu Ba.");
                break;
            case 4:
                System.out.println("Day la Thu Tu.");
                break;
            case 5:
                System.out.println("Day la Thu Nam.");
                break;
            case 6:
                System.out.println("Day la Thu Sau.");
                break;
            case 7:
                System.out.println("Day la Thu Bay.");
                break;
            case 8:
                System.out.println("Day la Chu Nhat.");
                break;
            default:
                System.out.println("So ngay khong hop le! Vui long nhap so tu 2 den 8.");
        }

        scanner.close();
    }
}