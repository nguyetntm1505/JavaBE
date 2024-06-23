package chuong_3_tong_quan_java;

import java.util.Scanner;

//De bai: Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa của một học sinh. Tính điểm trung bình của học sinh đó.

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The name of Student: ");
        String studentOfName = scanner.nextLine();

        System.out.print("Enter your Math score: ");
        double mathScore = scanner.nextDouble();

        System.out.print("Enter your Physics score: ");
        double physicsScore = scanner.nextDouble();

        System.out.print("Enter your Chemistry score: ");
        double chemistryScore = scanner.nextDouble();

        System.out.println("The score coefficients for Math, Physics, and Chemistry are: ");
        int mathCoefficient = scanner.nextInt();
        int physicsCoefficient = scanner.nextInt();
        int chemistryCoefficient = scanner.nextInt();

        double averageScore = (mathScore * mathCoefficient + physicsScore * physicsCoefficient + chemistryScore * chemistryCoefficient) / (mathCoefficient + physicsCoefficient + chemistryCoefficient);
        System.out.println("Average score: " + averageScore);

        if (averageScore >= 8) {
            System.out.print("Excellent!");
        } else {
            System.out.print("Good!");
        }
    }
}
