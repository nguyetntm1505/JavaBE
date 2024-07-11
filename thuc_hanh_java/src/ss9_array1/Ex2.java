package ss9_array1;

import java.util.Scanner;

public class Ex2 {
    static String[] hoTen;
    static int[] tuoi;
    static String[] gioiTinh;
    static double[] mucLuong;
    static double[] diemTrungBinh;
    static int soLuongNhanVien = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Hay nhap vao so phan tu trong mang: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Hay nhap vao so nguyen duong");
            }
        } while (n <= 0);

        hoTen = new String[n];
        tuoi = new int[n];
        gioiTinh = new String[n];
        mucLuong = new double[n];
        diemTrungBinh = new double[n];

        String chose;
        do {
            scanner.nextLine();
            nhapThongTinNhanVien(soLuongNhanVien);
            soLuongNhanVien++;
            System.out.print("Nhap yes de tiep tuc, no de dung lai: ");
            chose = scanner.nextLine(); //yes, Yes, YES
        } while (chose.equalsIgnoreCase("yes") && soLuongNhanVien < n);

        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("Thong tin cua nhan vien thu " + (i + 1));
            xuatThongTin(i);
        }
    }

    public static void nhapThongTinNhanVien(int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen[index] = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi[index] = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap gioi tinh: ");
        gioiTinh[index] = scanner.nextLine();
        System.out.print("Nhap muc luong: ");
        mucLuong[index] = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap diem trung binh: ");
        diemTrungBinh[index] = Double.parseDouble(scanner.nextLine());
    }

    public static void xuatThongTin(int index) {
        System.out.println("Ten: " + hoTen[index]);
        System.out.println("Tuoi: " + tuoi[index]);
        System.out.println("Gioi tinh: " + gioiTinh[index]);
        System.out.println("Muc luong: " + mucLuong[index]);
        System.out.println("Diem trung binh: " + diemTrungBinh[index]);
    }
}
