package ss6_method;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();
        //a.    S = 1 + 2 + … + n
        System.out.println("Tong cua n so la: " + sumA(n));
        //b.    S = 1^2 + 2^2 + … + n^2
        System.out.println("Tong cua n^2 so la: " + sumB(n));
        //c.    S = 1 + 1/2 + … + 1/n
        System.out.println("Tong cua 1/n so la: " + sumC(n));
        //d.    S = 1 * 2 * … * n
        System.out.println("Tich cua n so la: " + sumD(n));
        //e.    S = 1! + 2! + … + n!
        System.out.println("Tong cua n! so la: " + sumE(n));
    }

    // a.    S = 1 + 2 + … + n
    static int sumA(int number) {
        int total = 0;
        for (int i = 1; i <= number; i++) {
            total += i;
        }
        return total;
    }

    //b.    S = 1^2 + 2^2 + … + n^2
    static int sumB(int number) {
        int total = 0;
        for (int i = 1; i <= number; i++) {
            total += (i * i);
        }
        return total;
    }

    //c.    S = 1 + 1/2 + … + 1/n
    static double sumC(int number) {
        double total = 0;
        for (double i = 1; i <= number; i++) {
            total += (1 / i);
        }
        return total;
    }

    //d.    S = 1 * 2 * … * n
    static int sumD(int number) {
        int tich = 1;
        for (int i = 1; i <= number; i++) {
            tich *= i;
        }
        return tich;
    }

    //e.    S = 1! + 2! + … + n!
    static int sumE(int number) {
        int total = 0;
        for (int i = 1; i <= number; i++) {
//            int giaiThua=1;
//            for(int j=1; j<=i; j++) {
//                giaiThua *=j;
//            }
            total += sumD(i);
        }
        return total;
    }
}
