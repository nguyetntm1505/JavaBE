package ss5_loop;

import java.util.Scanner;
// S=1+1/2+1/3+....+1/n

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();
        double i;
        double sum = 0;

        for (i = 1; i <= n; i++) {
            sum = sum + (1 / i);
        }
        System.out.print(sum + "\t");
    }
}
