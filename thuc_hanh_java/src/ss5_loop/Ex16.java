package ss5_loop;

import java.util.Scanner;

/**
 * Hình a
 * <p>
 * *
 * **
 * ***
 */
public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Hay nhap cot: ");
        //int column = scanner.nextInt();
        System.out.print("Hay nhap hang: ");
        int row = scanner.nextInt();
        int i;
        int j;
        System.out.println("Hinh A: ");
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Hình b
        //*****
        //****
        //***
        //**
        //*
        System.out.println("Hinh B: ");
        for (i = row; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Hình c
        //    *
        //   **
        //  ***
        // ****
        //*****
        System.out.println("Hinh C: ");
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row; j++) {
                if (j <= (row - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //Hình d
        //*****
        // ****
        //  ***
        //   **
        //    *
        System.out.println("Hinh D: ");
        for (i = 1; i <= row; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= row - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Hình e
        //*****
        //*  *
        //* *
        //**
        //*
        System.out.println("Hinh E: ");
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row; j++) {
                if (i == 1 || j == 1 || j == row - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //Hình f
        //   *
        //  ***
        // *****
        //*******
        System.out.println("Hinh F: ");
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

