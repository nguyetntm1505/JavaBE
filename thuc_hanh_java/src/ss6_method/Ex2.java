package ss6_method;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();
        //a.    Trả về số đảo của số đó.
        System.out.println("So dao cua n la: " + reversedNumber(n));

        //b.    Có phải là số đối xứng (Trả về True/False)
        if (isSymmetricalNumber(n)) {
            System.out.printf("%d la so doi xung\n", n);
        } else {
            System.out.printf("%d khong phai la so doi xung\n", n);
        }

        //c.    Có phải là số chính phương.
        if (isSquareNumber(n)) {
            System.out.printf("%d la so chinh phuong\n", n);
        } else {
            System.out.printf("%d khong phai la so chinh phuong\n", n);
        }

        // d.    Có phải là số nguyên tố.
        if (isPrimeNumber(n)) {
            System.out.printf("%d la so nguyen to\n", n);
        } else {
            System.out.printf("%d khong phai la so nguyen to\n", n);
        }

        // e.    Tổng các chữ số lẻ.
        System.out.println("Tong cac chu so le la: " + sum(n));

        //f.    Tổng các chữ số nguyên tố.
        System.out.println("Tong cac so nguyen to la:" + sumPrimeNumber(n));

        //g.    Tổng các chữ số chính phương.
        System.out.println("Tong cac so chinh phuong la:" + sumSquareNumber(n));
    }

    //a.    Trả về số đảo của số đó.
    static int reversedNumber(int number) {
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10; // number =123 -> lay hang don vi la 321
            reverse = reverse * 10 + digit;//32
            number = number / 10;
        }
        return reverse;
    }

    //b.    Có phải là số đối xứng (Trả về True/False)
    static boolean isSymmetricalNumber(int number) {
        return number == reversedNumber(number);
    }

    //c.    Có phải là số chính phương. (can bac hai cua no la 1 so nguyen duong)
    static boolean isSquareNumber(int number) {
        return Math.sqrt(number) % 1 == 0;
    }

    // d.    Có phải là số nguyên tố.
    static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false; // Các số nhỏ hơn hoặc bằng 1 không phải là số nguyên tố
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // e.    Tổng các chữ số lẻ.
    static int sum(int number) {
        int total = 0;
        String s = String.valueOf(number);
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) % 2 != 0) {
                total += s.charAt(i) - '0';
            }
        }
        return total;
    }

    //f.    Tổng các chữ số nguyên tố.
    static int sumPrimeNumber(int number) {
        int total = 0;
        while (number > 0) {
            int digit = number % 10; // lay hang don vi
            number = number / 10; // bo di hang don vi
            if (isPrimeNumber(digit)) {
                total += digit;
            }
        }
        return total;
    }

    //g.    Tổng các chữ số chính phương.
    static int sumSquareNumber(int number) {
        int total = 0;
        while (number > 0) {
            int digit = number % 10; // lay hang don vi
            number = number / 10; // bo di hang don vi
            if (isSquareNumber(digit)) {
                total += digit;
            }
        }
        return total;
    }
}

