package ss3_overview;

import java.util.Scanner;

/*De bai: Nhập bán kính của đường tròn. Tính chu vi và diện tích của hình tròn đó.
Công thức
Chu vi: C = 2 * π * r
Diện tích: A = π * r²*/

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter radius: ");
        double radius = scanner.nextDouble();

        Double diameterOfCircle = 2 * 3.14 * radius;
        System.out.println("Diameter of cỉcle: " + diameterOfCircle);

        Double areaOfCircle = 3.14 * radius * radius;
        System.out.println("Area of circle: " + areaOfCircle);
    }
}
