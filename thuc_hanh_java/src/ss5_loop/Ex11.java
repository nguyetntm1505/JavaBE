package ss5_loop;

import java.util.Scanner;
// S = 1+1/3!+1/5!+…..+1/(2n-1)!

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();
        double i;
        int j;
        double sum = 0;
        double denominator = 1;
/* n = 2
        i = 1 -> true -> j = 1 -> true -> mauso = 1*1  -> sum = 1
        i = 2 -> true -> j = 1 -> true -> mauso = 1
                        j = 2 -> true -> mauso = 1*2
                        j = 3 -> true -> mau so = 1*2*3
                        j = 4 -> false -> sum = 1 + 1/1*2*3
*/
        for (i = 1; i <= n; i++) {
            denominator = 1;
            for (j = 1; j <= 2 * i - 1; j++) {
                denominator = denominator * j;
            }
            sum = sum + (1 / denominator);
        }

        System.out.print(sum + "\t");
    }
}
