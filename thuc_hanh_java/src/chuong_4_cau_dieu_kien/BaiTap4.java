package chuong_4_cau_dieu_kien;

import java.util.Scanner;

//De bai: Nhập vào 2 số nguyên a, b. In ra màn hình kết quả số lớn nhất, nhỏ nhất.

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 2 số nguyên a, b. In ra màn hình kết quả số lớn nhất, nhỏ nhất.");
        System.out.print("Please enter a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter b: ");
        int b = scanner.nextInt();

        /*if(a > b){
            System.out.println("The max value is: " + a);
            System.out.println("The max value is: " + b);
        }elseif (a <b){
            System.out.println("The max value is: " + b);
            System.out.println("The max value is: " + a);
        }else{
            System.out.print(a+" = " + b);
        }*/
        if (a == b) {
            System.out.println("Max = Min = " + a);
        } else {
            int maxValue = (a > b) ? a : b;
            int minValue = (a > b) ? b : a;
            // Neu a = b -> thi lam sao su dung toan tu 3 ngoi in ra  cau lenh nay System.out.print(a+" = " + b);???
            System.out.println("The max value is: " + maxValue);
            System.out.println("The min value is: " + minValue);
        }
    }
}
