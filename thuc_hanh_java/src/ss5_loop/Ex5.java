package ss5_loop;

import java.util.Scanner;

//In dãy số 2, 4, 6, 8, 10 … 2n

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();
        int i;

        /*Cach 1:
        for(i=2; i<=2*n; i=i+2){
            System.out.print(i + "\t");
        }*/

        for (i = 1; i <= n; i++) {
            System.out.print(i * 2 + "\t");
        }
    }
}
