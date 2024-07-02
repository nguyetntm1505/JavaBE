package ss5_loop;

import java.util.Scanner;

//Viết chương nhập vào một số nguyên dương n. Sau đó quy đổi n ra hệ nhị phân.
public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        String binary = " ";

        while (n > 0) {
            int x = n % 2;//bang 1 hoac 0
            binary = x + binary;
            n = n / 2;
        }
        System.out.print(" Day so nhi phan la : " + binary);
    }
}