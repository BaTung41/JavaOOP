package Chuong2;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        chuoi = scanner.nextLine();
        System.out.println("Cac ky tu trong chuoi la: ");
        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }
        scanner.close();
    }

}
