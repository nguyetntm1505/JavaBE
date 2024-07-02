package ss6_method;
import java.util.Scanner;
//d.    Viết phương thức trả về giá trị nhỏ nhất của 4 số nguyên.

public class Ex1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap so nguyen a: ");
        int a = scanner.nextInt();
        System.out.print("Hay nhap so nguyen b: ");
        int b = scanner.nextInt();
        System.out.print("Hay nhap so nguyen c: ");
        int c = scanner.nextInt();
        System.out.print("Hay nhap so nguyen d: ");
        int d = scanner.nextInt();
        min(a, b, c, d);
        System.out.println("Gia tri nho nhat la: " + min(a, b, c, d));
    }

    static int min(int a, int b, int c, int d) {
        int min;
        min = Math.min(a, b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        return min;
    }
}
