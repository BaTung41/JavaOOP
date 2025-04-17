package Chuong2;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n;
        long giaithua = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        n = scanner.nextInt();
        if (n < 0) {
            System.out.println("n la so nguyen duong");
        } else {
            int i = 1;
            do {
                giaithua *= i;
                i++;
            } while (i <= n);
            System.out.println("Giai thua cua " + n + " la: " + giaithua);
        }
        scanner.close();

    }
}
