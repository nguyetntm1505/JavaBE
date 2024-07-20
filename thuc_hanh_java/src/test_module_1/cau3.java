package test_module_1;

import java.util.Scanner;

public class cau3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap vao chuoi ky tu: ");
        String string = scanner.nextLine();
        demSoKyTuHoa(string);
    }

    public static void demSoKyTuHoa(String str) {
        boolean isCoChuaKyTuInHoa = false;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
                isCoChuaKyTuInHoa = true;
            }
        }
        if (isCoChuaKyTuInHoa) {
            System.out.println("So ky tu in hoa trong chuoi la: " + count);
        } else {
            System.out.println("Chuoi khong chua ky tu in hoa!!");
        }
    }
}
