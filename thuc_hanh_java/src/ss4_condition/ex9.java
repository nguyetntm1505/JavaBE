package ss4_condition;

import java.util.Scanner;
// Nhập vào 1 ký tự là chữ cái. Nếu nhập sai thì báo thông báo đã nhập sai. Nếu đúng thì đi kiểm tra nếu đó đang là chữ cái thường thì biến nó thành chữ cái hoa, nếu nó là chữ cái hoa thì biến nó thành chữ cái thường.

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap ky tu: ");
        char character = scanner.next().charAt(0);

        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            if (character >= 'a' && character <= 'z') {
                character = (char) (character - 32);
            } else {
                character = (char) (character + 32);
            }
            System.out.println(character);
        } else {
            System.out.println("Hay nhap ky tu hop le");
        }
    }
}
