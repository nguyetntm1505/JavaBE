package ss5_loop;

import java.util.Scanner;
//In dãy số 1, 2, 3, 5, 8, 13, …n

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();

        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        while (fn <= n) {
            System.out.print(fn + " ");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }
}
