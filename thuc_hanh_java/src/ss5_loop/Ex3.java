package ss5_loop;

import java.util.Scanner;

//In dãy số 2, -4, 6, -8, 10 … n

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();
        int i;
        int count = 1;
        for (i = 2; i <= n; i = i + 2) {
//            if (i % 4 != 0) {
//                System.out.print(i + "\t");
//            } else {
//                System.out.print(-i + "\t");
//            }
            if (count % 2 != 0) {
                System.out.print(i + " ");
            } else {
                System.out.print(-i + " ");
            }
            count++;
        }
    }
}

