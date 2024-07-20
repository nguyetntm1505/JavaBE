package test_module_1;

import java.util.Scanner;

public class cau2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Hay nhap vao so phan tu n cua mang: ");
            n = scanner.nextInt();
            if (n <= 0 || n > 20) {
                System.out.println("Hay nhap vao so luong phan tu n<=20!!");
            }
        } while (n <= 0 || n > 20);

        int[] arr = new int[n];
        nhapMang(arr);
        int hieuSoChanVaLe = tongSoChanCuaMang(arr) - tongSoLeCuaMang(arr);
        System.out.println("Hieu so chan va so le cua mang la: " + hieuSoChanVaLe);
    }

    public static void nhapMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap phan tu a[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }

    public static int tongSoChanCuaMang(int[] arr) {
        int sumChan = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumChan += arr[i];
            }
        }
        return sumChan;
    }

    public static int tongSoLeCuaMang(int[] arr) {
        int sumLe = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sumLe += arr[i];
            }
        }
        return sumLe;
    }
}
