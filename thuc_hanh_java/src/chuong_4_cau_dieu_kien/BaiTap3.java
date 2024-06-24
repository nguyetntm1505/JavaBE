package chuong_4_cau_dieu_kien;

import java.util.Scanner;

//Nhập vào 2 số nguyên, lưu vào 2 biến a và b. Sau đó, đảo giá trị của 2 biến này rồi xuất giá trị của chúng ra màn hình console.

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 2 số nguyên, lưu vào 2 biến a và b. Sau đó, đảo giá trị của 2 biến này rồi xuất giá trị của chúng ra màn hình console. ");
        System.out.print("Please enter a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter b: ");
        int b = scanner.nextInt();

        int x = a;
        a = b;
        b = x;

        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
    }
}
