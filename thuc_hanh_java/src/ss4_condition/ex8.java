package ss4_condition;

import java.util.Scanner;

/*Nhập vào tháng & năm. Hãy cho biết tháng đó trong năm đó có bao nhiêu ngày
Nếu tháng là 4, 6, 9, hoặc 11, số ngày là 30.
Nếu tháng là 2, kiểm tra xem năm có phải là năm nhuận không. Nếu là năm nhuận, số ngày là 29, nếu không, số ngày là 28.
Cho tất cả các tháng khác, số ngày là 31.*/

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap thang: ");
        int month = scanner.nextInt();
        System.out.print("Hay nhap nam: ");
        int year = scanner.nextInt();
        int days;

        switch (month) {
            case 1:
                days = 31;
                System.out.print("days: " + days);
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                System.out.print("days: " + days);
                break;
            case 3:
                days = 31;
                System.out.print("days: " + days);
                break;
            case 4:
                days = 30;
                System.out.print("days: " + days);
                break;
            case 5:
                days = 31;
                System.out.print("days: " + days);
                break;
            case 6:
                days = 30;
                System.out.print("days: " + days);
                break;
            case 7:
                days = 31;
                System.out.print("days: " + days);
                break;
            case 8:
                days = 31;
                System.out.print("days: " + days);
                break;
            case 9:
                days = 30;
                System.out.print("days: " + days);
                break;
            case 10:
                days = 31;
                System.out.print("days: " + days);
                break;
            case 11:
                days = 30;
                System.out.print("days: " + days);
                break;
            case 12:
                days = 31;
                System.out.print("days: " + days);
                break;
            default:
                System.out.print("Thoi gian khong hop le");
        }

    }
}


