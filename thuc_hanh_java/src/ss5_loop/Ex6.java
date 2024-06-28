package ss5_loop;
import java.util.Scanner;
//In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        int n = scanner.nextInt();
        int i;
        int j;
        /* n = 18
        i = 2 -> true -> j=2 -> true -> 2
                        j=3 -> false -> ket thuc lap
        i = 4 -> true -> j=2 -> true ->
        */
        for(i=2; i<=n; i= i+2){
            for(j=2; j<=i; j++){

                    System.out.print(i + " ");
                }
            }

        }


    }
}
