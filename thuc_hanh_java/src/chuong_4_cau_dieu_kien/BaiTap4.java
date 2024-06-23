package chuong_4_cau_dieu_kien;

import java.util.Scanner;

//De bai: Nhập vào 2 số nguyên a, b. In ra màn hình kết quả số lớn nhất, nhỏ nhất.

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter b: ");
        int b = scanner.nextInt();

        /*if(a > b){
            System.out.println("The max value is: " + a);
            System.out.println("The max value is: " + b);
        }else{
            System.out.println("The max value is: " + b);
            System.out.println("The max value is: " + a);
        }*/
        int maxValue = (a > b) ? a : b;
        int minValue = (a > b) ? b : a;
        System.out.println("The max value is: " + maxValue);
        System.out.println("The max value is: " + minValue);
    }
}
