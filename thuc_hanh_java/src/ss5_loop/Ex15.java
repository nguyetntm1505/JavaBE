package ss5_loop;

import java.util.Scanner;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định)
 * <p>
 * Hình a
 * * * * * *
 * <p>
 * <p>
 * <p>
 * <p>
 * * * * * *
 **/
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap cot: ");
        int column = scanner.nextInt();
        System.out.print("Hay nhap hang: ");
        int row = scanner.nextInt();
        int i;
        int j;
        System.out.println("Hinh A: ");
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= column; j++) {
                if (j == 1 || i == 1 || i == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /**
         * Hình b
         * * * * * * *
         *
         *
         *
         *
         * * * * * * *
         */
        System.out.println("Hinh B: ");
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= column; j++) {
                if (j == column || i == 1 || i == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
