package ss4_condition;

import java.util.Scanner;
// Kiểm tra 1 số nguyên dương x có phải là số chính phương hay không? Định nghĩa số chính phương: Là số mà kết quả khai căn bậc 2 của nó là 1 số nguyên

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap so nguyen duong: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.print("Hay nhap so nguyen duong! ");
        } else {
            double x = Math.sqrt(number) % 1;
            if (x == 0) {
                System.out.print("Day la so chinh phuong");
            } else {
                System.out.print("Day KHONG PHAI la so chinh phuong");
            }
        }
    }
}