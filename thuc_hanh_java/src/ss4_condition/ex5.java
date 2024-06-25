package ss4_condition;

import java.util.Scanner;

//de bai: Giải phương trình bậc 1 có dạng: ax + b = 0.

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 1 có dạng: ax + b = 0.");
        System.out.print("Please enter a: ");
        double a = scanner.nextInt();
        System.out.print("Please enter b: ");
        double b = scanner.nextInt();
        double x;

        if (a == 0) {
            if (b == 0) {
                System.out.print("The equation has infinitely many solutions");
            } else {
                System.out.print("The equation has no solution");
            }
        } else {
            x = -b / a;
            System.out.print("The equation has 1 solution: " + x);
        }
    }
}
