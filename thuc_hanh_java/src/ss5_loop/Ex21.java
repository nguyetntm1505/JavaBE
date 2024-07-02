package ss5_loop;

import java.util.Scanner;
//Nhập một số nguyên dương n (n > 0).  Hãy cho biết:
//a. Có phải là số đối xứng? Ví dụ: 121, 12021, …
//b. Có phải là số nguyên tố? Ví dụ: 2, 3, 5, 7, 11, 13, …
//c. Các chữ số có tăng dần không? Ví dụ: 2345, 367, 59, 123, …

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();
        String s = String.valueOf(n);

        boolean isDoiXung = true;
        //12021
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                System.out.println(" n khong phai la so doi xung");
                isDoiXung = false;
                break;
            }
        }
        if (isDoiXung) {
            System.out.println(" n la so doi xung");
        }
    }
}
