package ss3_overview;

import java.util.Scanner;

//De bai: Viết một chương trình Java để nhập vào hai số nguyên a và b từ người dùng. Sau đó, tính và hiển thị tổng, hiệu, tích và thương của hai số đó.

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a: ");
        int a = scanner.nextInt();

        System.out.print("Please input b: ");
        int b = scanner.nextInt();

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%f / %f = %f%n", (double) a, (double) b, (double) a / b);//ep kieu du lieu int -> double
        System.out.print(a + " % " + b + " = " + a % b);
        //System.out.printf("%d %% %d = %d",a,b,a%b);

    }
}

