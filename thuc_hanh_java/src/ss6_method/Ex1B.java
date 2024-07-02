package ss6_method;
import java.util.Scanner;
//b.    Viết phương thức giải phương trình bậc nhất.

public class Ex1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap he so a: ");
        double a = scanner.nextInt();
        System.out.print("Hay nhap he so b: ");
        double b = scanner.nextInt();
        levelOne(a, b);

    }

    static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh co 1 nghiem: " + x);
        }
    }
}
