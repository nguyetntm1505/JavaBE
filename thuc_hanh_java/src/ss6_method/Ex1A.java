package ss6_method;
import java.util.Scanner;

//a.    Viết phương thức đổi một ký tự hoa sang ký tự thường. va nguoc lai
public class Ex1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap ky tu: ");
        char character = scanner.next().charAt(0);
        System.out.println("Ky tu sau khi chuyen doi la: " + toLowerCase(character));
    }

    static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += 32;
        }
        if (c >= 'a' && c <= 'z') {
            c -= 32;
        }
        return c;
    }
}
