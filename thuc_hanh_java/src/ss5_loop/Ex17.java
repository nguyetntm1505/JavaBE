package ss5_loop;

import java.util.Scanner;

//Hình a
//******
// *
//   *
//     *
//       *
//******
public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap hang: ");
        int row = scanner.nextInt();
        int i;
        int j;
        System.out.println("Hinh A: ");
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row; j++) {
                if (i == 1 || i == row) {
                    System.out.print("*");
                } else {
                    if (j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        //Hình b
        //******
        //       *
        //     *
        //   *
        // *
        //******
        System.out.println("Hinh B: ");
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row; j++) {
                if (i == 1 || i == row) {
                    System.out.print("*");
                } else {
                    if (j == row - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}