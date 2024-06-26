package ss5_loop;

import java.util.Scanner;
//In dãy số 2, 4, -6, 8, 10, -12 … n (bằng ít nhất 2 cách khác nhau) (n là số nhập vào từ bàn phím)

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();
        int i;

        for (i = 2; i <= n; i = i + 2) {
            if (i % 3 != 0) {
                System.out.print(i + "\t");
            } else {
                System.out.print(-i + "\t");
            }
        }
    }
}
