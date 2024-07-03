package ss7_debug_string;

import java.util.Scanner;
//Cho chuỗi "Hello World"

public class Ex1 {
    public static void main(String[] args) {
        String str = "Hello World";
        //    a. Lấy ra chữ World
        System.out.println(getWorld(str));
        //    b. Thay o thành f
        System.out.println(replaceOToF(str));
        //    c. Đếm xem có bao nhiêu chữ l
        System.out.println(countL(str));
        //    d. Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
        positionL(str);
        //    e. Xóa hết space giữa chừng, đầu tiên và cuối cùng
        System.out.println(trimSpace(str));
        //    f. Xóa hết space đầu tiên và cuối cùng (không được xóa space giữa chừng)
        System.out.println(trimSpaceStartAndEnd(str));
        //    g. Đảo chuỗi thành dlroW olleH
        System.out.println(daoChuoi(str));
        //    h. Cho chuỗi "SQC". Hãy tạo thành chuỗi “SQC Hello World”
        System.out.println(addSQC(str));
        //    i. Đổi toàn bộ kí tự của S sang chữ Hoa
        System.out.println(str.toUpperCase());
        //    k. Đổi toàn bộ kí tự của S sang chữ thường
        System.out.println(str.toLowerCase());
        //    l. Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();
        System.out.print("Hay nhap m: ");
        int m = scanner.nextInt();
        System.out.println(nToM(str, n, m));
    }

    static String getWorld(String s) {
        return s.substring(6);
    }

    static String replaceOToF(String s) {
        return s.replace('o', 'f');
    }

    static int countL(String s) {
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'L' || s.charAt(i) == 'l') {
                count++;
            }
        }
        return count;
    }

    static void positionL(String s) {
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'L' || s.charAt(i) == 'l') {
                System.out.println(i);
                break;
            }
        }
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(s.length() - 1 - i) == 'L' || s.charAt(s.length() - 1 - i) == 'l') {
                System.out.println(s.length() - 1 - i);
                break;
            }
        }
    }

    static String trimSpace(String s) {
        return s.replaceAll(" ", "");
    }

    static String trimSpaceStartAndEnd(String s) {
        return s.trim();
    }

    static String daoChuoi(String s) {
        String chuoiS = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            chuoiS += s.charAt(s.length() - 1 - i);
        }
        return chuoiS;
    }

    static String addSQC(String s) {
        String add = "SQC ";
        return add.concat(s);
    }

    static String nToM(String s, int n, int m) {
        return s.substring(n, m);
    }

}
