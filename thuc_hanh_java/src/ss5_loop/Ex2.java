package ss5_loop;

import java.util.Scanner;
//In dãy số 1, 3, 5, 7, 9 … n (n là số nhập vào từ bàn phím)

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int i;

        if (n <= 0) {
            System.out.println("Hay nhap n la mot so nguyen duong!! ");
        } else {
            for (i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + "\t");
                }
            }
        }
    }
}


