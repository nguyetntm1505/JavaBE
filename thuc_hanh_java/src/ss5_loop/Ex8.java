package ss5_loop;

import java.util.Scanner;
//In dãy số 1, 3, 7, 15, 31, …n

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i = 2 * i + 1) {
            System.out.print(i + "\t");
        }
    }
}