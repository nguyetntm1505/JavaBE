package test_module_1;

import java.util.Scanner;

public class cau4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap vao so phan tu cua mang: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Hay nhap so nguyen duong!!");
            }
        } while (n <= 0);

        int[] arr = new int[n];
        nhapMang(arr);
        System.out.println("Cac phan tu cua mang la: ");
        xuatMang(arr);
        System.out.println("Cac so nguyen to trong mang la: ");
        int[] brr = timSoNguyenToCuaMang(arr);
        xuatMang(brr);
    }

    public static void nhapMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Hay nhap vao phan tu a[%d]: ", i);
            a[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSoNguyenTo(int x) {
        boolean soNguyenTo = true;
        if (x < 2) {
            soNguyenTo = false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    soNguyenTo = false;
                }
            }
        }
        return soNguyenTo;
    }

    public static int[] timSoNguyenToCuaMang(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (isSoNguyenTo(a[i])) {
                count++;
            }
        }
        int[] b = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (isSoNguyenTo(a[i])) {
                b[index] = a[i];
                index++;
            }
        }
        if (count <= 0) {
            System.out.println("Mang khong co so nguyen to!!");
        }
        return b;
    }
}
