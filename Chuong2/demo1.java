package Chuong2;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int n = 0, sodu, tong = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen:");
        n = scanner.nextInt();
        while (n > 0) {
            sodu = n % 10;
            tong += sodu;
            n /= 10;

        }
        System.out.println("Tong cac chu so la: " + tong);
        scanner.close();

    }

}
