package Chuong2;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = scanner.nextDouble();
        System.out.println("Nhap so b:");
        b = scanner.nextDouble();
        if (a < b) {
            System.out.println("a la so nho nhat");
        } else if (a > b) {
            System.out.println("b la so nho nhat");
        } else {
            System.out.println("Hai so bang nhau");
        }
    }
}
