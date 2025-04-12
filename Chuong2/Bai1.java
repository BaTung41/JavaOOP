package Chuong2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double sothunhat;
        double sothuhai;
        Scanner scanner = new Scanner(System.in);
        System.err.println("Nhap so thu nhat: ");
        sothunhat = scanner.nextDouble();
        System.out.print("Nhap so thu hai: ");
        sothuhai = scanner.nextDouble();

        double tong = sothunhat + sothuhai;
        double hieu = sothunhat - sothuhai;
        double tich = sothunhat * sothuhai;
        double thuong = sothunhat / sothuhai;
        double chiadu = sothunhat % sothuhai;
        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        System.out.println("Thuong: " + thuong);
        System.out.println("Chiadu: " + chiadu);

        System.out.println("sothunhat bang sothuhai la: " + (sothunhat == sothuhai));
        System.out.println("sothunhat khac sothuhai la: " + (sothunhat != sothuhai));
        System.out.println("sothunhat lon hon sothuhai la: " + (sothunhat > sothuhai));
        System.out.println("sothunhat be hơn sothuhai la: " + (sothunhat < sothuhai));

        scanner.close();

    }

}
