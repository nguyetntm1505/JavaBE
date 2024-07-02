package ss5_loop;

import java.util.Scanner;

//******
//*
//      *
//      *
//      *
//******
public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap hang: ");
        int row = scanner.nextInt();
        int i;
        int j;

        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row; j++) {
                if (i == 1 || i == row || j==1 || j == row) {
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
    }
}