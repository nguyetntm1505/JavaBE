package chuong_3_tong_quan_java;

import java.util.Scanner;
//nhap lop scanner trong java

//De bai: Nhập năm sinh của một người. Tính tuổi người đó.

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input year of birth of you: ");

        int yearOfBirth = scanner.nextInt();
        int currentYear = java.time.Year.now().getValue();
        //java.time.Year.now().getValue() -> lay gia tri cua nam hien tai
        int age = currentYear - yearOfBirth;

        if (age >= 0) {
            System.out.print("The age of you is " + age);
        } else {
            System.out.print("The year of birth is not a valid value.");
        }
    }
}
