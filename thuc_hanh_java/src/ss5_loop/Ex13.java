package ss5_loop;

import java.util.Scanner;

/**
 * Nhập 2 số nguyên dương a và b.
 * Sau đó in ra ước số chung lớn nhất và bội số chung nhỏ nhất của 2 số nguyên dương a và b đó.
 **/
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Hay nhap b: ");
        int b = scanner.nextInt();
        int i = 1;

        int uocChung = 1;
        int boiChung = 1;

        for (i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                boiChung = i;
                System.out.println("Boi chung nho nhat la: " + boiChung);
                break;
            }
        }
        for (i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                uocChung = i;
                System.out.println("Uoc chung lon nhat la: " + uocChung);
                break;
            }
        }
    }
}
