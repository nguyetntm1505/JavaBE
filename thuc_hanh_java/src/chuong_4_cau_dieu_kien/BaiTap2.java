package chuong_4_cau_dieu_kien;

import java.util.Scanner;

/*Nhập vào 1 số tự nhiên từ 1 đến 10, sau đó in ra tiếng Anh của từ đó theo 2 cách:
Cách 1: Dùng if else-if.
Cách 2: Dùng switch case.*/

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số tự nhiên từ 1 đến 10, sau đó in ra tiếng Anh của từ đó");
        System.out.print("Please enter the value from 1 to 10: ");
        int x = scanner.nextInt();

       /* if (x == 1) {
            System.out.println("one");
        } else if (x == 2) {
            System.out.println("two");
        } else if (x == 3) {
            System.out.println("three");
        } else if (x == 4) {
            System.out.println("four");
        } else if (x == 5) {
            System.out.println("five");
        } else if (x == 6) {
            System.out.println("six");
        } else if (x == 7) {
            System.out.println("seven");
        } else if (x == 8) {
            System.out.println("eight");
        } else if (x == 9) {
            System.out.println("nine");
        } else if (x == 10) {
            System.out.println("teen");
        } else {
            System.out.println("Invalid value!!");
        }*/
        switch (x){
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
            case 10:
                System.out.print("teen");
                break;
            default:
                System.out.print("Invalid value!!");
        }
    }
}

