package ss6_method;

import java.util.Scanner;

//Phương thức trả về ước số chung lớn nhất (USCLN) của hai số nguyên.
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Hay nhap b: ");
        int b = scanner.nextInt();
        System.out.println("UCLN cua a,b la: " + uocChung(a, b));
    }

    static int uocChung(int a, int b) {
        int uocChungLonNhat = 0;
        int i = a;
        while (i >= 1) {
            if (a % i == 0 && b % i == 0) {
                uocChungLonNhat = i;
                break;
            }
            i--;
        }
        return uocChungLonNhat;
    }
}