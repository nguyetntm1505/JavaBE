package chuong_4_cau_dieu_kien;

import java.util.Scanner;

public class BaiTap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Viết chương trình tính lương của nhân viên dựa theo thâm niên công tác ");
        System.out.print("Hay nhap ten cua nhan vien: ");
        String name = scanner.nextLine();
        System.out.print("Hay nhap he so luong cua nhan vien: ");
        double coefficientsSalary = scanner.nextDouble();

        int basicSalary = 650000;
        double totalSalary = coefficientsSalary * basicSalary;

        if(coefficientsSalary <= 0){
            System.out.print("He so luong khong hop le!!");
        }else {
            System.out.print("Luong cua nhan vien la : " + totalSalary + "$");
        }
    }
}
