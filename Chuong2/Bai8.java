package Chuong2;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n so nguyen nhap vao la: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("So so nguyen >0");
        } else {
            int[] numbers = new int[n];
            int tong = 0;
            System.out.println("Nhap " + n + " so nguyen:");
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap so thu " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
                tong += numbers[i];
            }
            double trungbinhcong = (double) tong / n;
            System.out.println("Trung binh cong cua " + n + " so nguyen la: " + trungbinhcong);
        }

        scanner.close();
    }
}