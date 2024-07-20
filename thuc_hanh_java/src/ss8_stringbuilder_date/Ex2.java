package ss8_stringbuilder_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Ex2 {
    public static void main(String[] args) throws ParseException {
        //a. Chuyển chuỗi "02/28/2023" sang kiểu java.util.Date.
        String string = "02/28/2023";
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = dateFormat.parse(string);
        System.out.println("java.util.Date: " + date);

        //b. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu java.util.Date sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.
        Date currentDay = new Date();
        SimpleDateFormat dateFormatB = new SimpleDateFormat("dd/MM/yyyy");
        String stringB = dateFormatB.format(currentDay);
        //String stringB = currentDay.format(dateFormatB); -> JAVA ko có phương thức này
        System.out.println("Ngay hien tai theo chuoi la: " + stringB);

        //c. Chuyển chuỗi "02/28/2023" sang kiểu LocalDate.
        string = "02/28/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(string, formatter);
        System.out.println("Sau khi chuyen string thanh LocalDate: " + localDate);

        //d. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu LocalDate sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.
        LocalDate currentLocalDate = LocalDate.now();
        DateTimeFormatter formatterD = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String stringD = currentLocalDate.format(formatterD);
        //String stringD = formatterD.format(currentLocalDate);
        System.out.println("Sau khi chuyen ngay hien tai thanh String: " + stringD);

        //e. Lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống.
        LocalDateTime currentDateTime = LocalDateTime.now();
        int day = LocalDateTime.now().getDayOfMonth();
        int month = LocalDateTime.now().getMonthValue();
        int year = LocalDateTime.now().getYear();
        int hour = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();
        int second = LocalDateTime.now().getSecond();
        System.out.println("Lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống: " + day + " " + month + " " + year + " " + hour + " " + minute + " " + second);

        // f. Hãy cho biết 1 tháng sau (tính từ ngày hiện tại) sẽ rơi vào thứ mấy trong tuần, và cách ngày hiện tại bao nhiêu ngày?
        // Gợi ý: nếu ngày hiện tại là ngày 26/6 thì 1 tháng sau được hiểu là ngày 26/7 (giữ nguyên ngày, tăng 1 tháng).
        LocalDate currentDate = LocalDate.now();
        LocalDate oneMonthLater= currentDate.plusMonths(1);
        System.out.println("Mot thang sau se roi vao thu may trong tuan: " + oneMonthLater.getDayOfWeek());
        long dayUtilOneMonthLater = currentDate.until(oneMonthLater, ChronoUnit.DAYS);
        System.out.println("Ngay cua 1 thang sau cachs ngay hien tai: " + dayUtilOneMonthLater);

        //g. Hãy cho biết cách đây 1000 ngày (tính từ ngày hiện tại) là ngày tháng năm nào?
        //h. Hãy nhập vào 2 String có định dạng là dd/MM/yyyy. Hãy chuyển thành 2 biến kiểu LocalDate. Sau đó hãy tính số ngày chênh lệch giữa 2 ngày đã nhập vào.
        //i. Hãy nhập vào 1 String có định dạng là dd/MM/yyyy. Sau đó, nhập vào số tự nhiên n. Hãy in ra ngày đứng sau ngày đã nhập n ngày.
    }
}
