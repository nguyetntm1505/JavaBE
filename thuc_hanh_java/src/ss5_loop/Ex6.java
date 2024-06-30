package ss5_loop;

import java.util.Scanner;
//In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();
        int khoangCach = 1;
        int buocNhay = 0;

        for (int i = 2; i <= n; i = i + 2) {
            if (buocNhay == khoangCach) {
                System.out.print(-i + " ");
                khoangCach++;
                buocNhay = 0;
            } else {
                System.out.print(i + " ");
                buocNhay++;
            }
        }
    }
}
