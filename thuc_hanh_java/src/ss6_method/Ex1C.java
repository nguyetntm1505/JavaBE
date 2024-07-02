package ss6_method;
import java.util.Scanner;
//b.    Viết phương thức giải phương trình bậc hai.

public class Ex1C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap he so a: ");
        double a = scanner.nextInt();
        System.out.print("Hay nhap he so b: ");
        double b = scanner.nextInt();
        System.out.print("Hay nhap he so c: ");
        double c = scanner.nextInt();
        levelOne(a, b, c);

    }

    static void levelOne(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.println("Phuong trinh co 1 nghiem: " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - (4 *a * c);
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co 1 nghiem: " + x);
            } else {
                double x1 = ((-b - Math.sqrt(delta)) / (2 * a));
                double x2 = ((-b + Math.sqrt(delta)) / (2 * a));
                System.out.println("Phuong trinh co 2 nghiem: " + "x1= " + x1 + " , x2= " + x2);
            }
        }
    }
}
