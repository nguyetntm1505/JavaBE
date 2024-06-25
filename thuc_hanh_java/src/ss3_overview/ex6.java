package ss3_overview;

import java.util.Scanner;
//Nhập vào số xe của bạn (Gồm tối đa 5 chữ số). Cho biết số xe của bạn được mấy nút?

public class ex6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so xe cua ban: ");
        int carNumber = scanner.nextInt();

        int sum = carNumber % 10; //12345 % 10 = 5
        carNumber = carNumber/10;

        sum += carNumber % 10;
        carNumber = carNumber/10;

        sum += carNumber % 10;
        carNumber = carNumber/10;

        sum += carNumber % 10;
        carNumber = carNumber/10;

        sum += carNumber % 10;
        carNumber = carNumber/10;

        int number = sum % 10;

        System.out.print("So nut bien so xe cua ban la: " + number);


    }
}
