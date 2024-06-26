package ss4_condition;

import java.util.Scanner;
//Nhập vào thông tin 1 ngày (ngày - tháng - năm). Kiểm tra ngày có hợp lệ hay không ? Nếu hợp lệ hãy tìm ra ngày kế tiếp (ngày - tháng - năm) & ngày trước đó (ngày - tháng - năm).

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap ngay: ");
        int day = scanner.nextInt();
        System.out.print("Hay nhap thang: ");
        int month = scanner.nextInt();
        System.out.print("Hay nhap nam: ");
        int year = scanner.nextInt();
        int nextDay = 0;
        int nextMonth = 0;
        int nextYear = 0;

        if (day == 31) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (month == 12) {
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear = year + 1;
                } else {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                }
            }
            System.out.println("Ngay tiep theo la: " + nextDay + "-" + nextMonth + "-" + nextYear);
        } else if (day == 30) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                nextDay = day + 1;
                nextMonth = month;
                nextYear = year;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                nextDay = 1;
                nextMonth = month + 1;
                nextYear = year;
            }
            System.out.println("Ngay tiep theo la: " + nextDay + "-" + nextMonth + "-" + nextYear);
        } else if (day == 29) {
            if (month >= 1 && month <= 12 && month != 2) {
                nextDay = day + 1;
                nextMonth = month;
                nextYear = year;
            } else if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else {
                    System.out.println("Ngay khong hop le. Hay nhap ngay hop le !!");
                }
            }
            System.out.println("Ngay tiep theo la: " + nextDay + "-" + nextMonth + "-" + nextYear);
        } else if (day == 28) {
            if (month >= 1 && month <= 12 && month != 2) {
                nextDay = day + 1;
                nextMonth = month;
                nextYear = year;
            } else if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    nextDay = day + 1;
                    nextMonth = month;
                    nextYear = year;
                } else {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                }
            }
            System.out.println("Ngay tiep theo la: " + nextDay + "-" + nextMonth + "-" + nextYear);
        } else if (day >= 0 && day <= 27) {
            nextDay = day + 1;
            nextMonth = month;
            nextYear = year;
            System.out.println("Ngay tiep theo la: " + nextDay + "-" + nextMonth + "-" + nextYear);
        } else {
            System.out.println("Ngay khong hop le. Hay nhap ngay hop le !!");
        }

    }
}