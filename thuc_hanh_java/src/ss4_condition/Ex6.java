package ss4_condition;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 2 có dạng: ax^2 + bx + c = 0.");
        System.out.print("Please enter a: ");
        double a = scanner.nextInt();
        System.out.print("Please enter b: ");
        double b = scanner.nextInt();
        System.out.print("Please enter c: ");
        double c = scanner.nextInt();
        double x;
        double x1;
        double x2;
        double delta;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.print("The equation has infinitely many solutions");
                } else {
                    System.out.print("The equation has no solution");
                }
            } else {
                x = -b / c;
                System.out.print("The equation has 1 solution: " + x);
            }
        } else {
            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.print("The equation has no solution");
            } else if (delta == 0) {
                x = -b / (2 * a);
                System.out.print("The equation has 1 solution: " + x);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has 2 solution: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
