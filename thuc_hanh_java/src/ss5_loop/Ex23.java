package ss5_loop;

import java.util.Scanner;
//Tìm và in lên màn hình tất cả các số nguyên trong phạm vi từ 10 đến 99
//sao cho tích của 2 chữ số bằng 2 lần tổng của 2 chữ số đó. Ví dụ: Số 44

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i <= 99; i++) {
            int x = i % 10;
            int y = i / 10;
            int s = x + y;
            int p = x * y;
            if (p == 2 * s) {
                System.out.print(i + " ");
            }
        }
    }
}