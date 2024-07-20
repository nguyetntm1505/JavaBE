package test_module_1;

import java.util.ArrayList;
import java.util.Scanner;

public class cau5 {
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

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu a[%d]: ", i);
            arrayList.add(scanner.nextInt());
        }
        System.out.println("Cac phan tu cua mang la: " + arrayList);

        int max = arrayList.get(0);
        int soLonNhi = arrayList.get(1);
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arrayList.get(i));
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arrayList.get(i) < max) {
                arrayList1.add(count);
                count++;
            }
        }
        //sap xep cac so nho hon max theo thu tu tang dan -> so o vi tri index = length - 1 -> la so lon nhi

        System.out.println("So lon nhi trong mang la: " + soLonNhi);
    }
}
