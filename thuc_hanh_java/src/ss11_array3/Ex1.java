package ss11_array3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    static Scanner scanner = new Scanner(System.in);

    // a. Nhập/Xuất ma trận A (n dòng, n cột) gồm các phần tử kiểu int.
    public static void main(String[] args) {
        int n;
        int m;
        do {
            System.out.print("Hay nhap so hang cua mang: ");
            n = scanner.nextInt();
            System.out.print("Hay nhap so cot cua mang: ");
            m = scanner.nextInt();
            if (n <= 0 || m <= 0) {
                System.out.println("So hang va cot phai la so nguyen duong");
            }
        } while (n <= 0 || m <= 0);

        int[][] arr = new int[n][m];
        nhapMang(arr);
        System.out.println("Cac phan tu cua mang la: ");
        xuatMang(arr);
        System.out.println("Tich các số là bội số của 3 nằm trên dòng đầu tiên của ma trận: " + tichBoiSoCua3(arr));
        int[] brr = giaTriLonNhatTungHang(arr);
        System.out.print("Tạo ra mảng một chiều X với X[i] là các giá trị lớn nhất trên từng dòng i của ma trận A: ");
        xuatMangMotChieu(brr);
        System.out.println("Tính tổng các số là bội số của 5 nằm trên hàng cuối cùng của ma trận: " + tongBoiSoCua5(arr));
        System.out.println("Tìm số lớn nhất trên đường chéo chính của ma trận: " + soLonNhatTrenDuongCheoChinh(arr));
        System.out.println("Tìm số nhỏ nhất trên đường chéo phụ của ma trận: " + soNhoNhatTrenDuongCheoPhu(arr));
        System.out.println("Đếm số lượng số nguyên tố trong ma trận.: " + soNguyenTo(arr));
        System.out.print("Hay nhap vao dong 1: ");
        int d1 = scanner.nextInt();
        System.out.print("Hay nhap vao dong 2: ");
        int d2 = scanner.nextInt();
        hoanDoiHaiDong(arr, d1, d2);
        System.out.println("Ma tran sau khi hoan doi dong 1 vs dong 2: ");
        xuatMang(arr);

        System.out.print("Hay nhap vao cot 1: ");
        int c1 = scanner.nextInt();
        System.out.print("Hay nhap vao cot 2: ");
        int c2 = scanner.nextInt();
        hoanDoiHaiCot(arr, c1, c2);
        System.out.println("Ma tran sau khi hoan doi cot 1 vs cot 2: ");
        xuatMang(arr);
    }

    public static void nhapMang(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("Hay nhap phan tu a[%d][%d]: ", i, j);
                a[i][j] = scanner.nextInt();
            }
        }
    }

    public static void xuatMang(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void xuatMangMotChieu(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //b. Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận.
    public static int tichBoiSoCua3(int[][] a) {
        boolean isBoiSoCua3 = false;
        int tich = 1;
        for (int j = 0; j < a[0].length; j++) {
            if (a[0][j] % 3 == 0) {
                isBoiSoCua3 = true;
                tich *= a[0][j];
            }
        }
//        if(isBoiSoCua3) {
//            return tich;
//        }else{
//            return 0;
//        }
        //result = condition ? value_if_true : value_if_false;
        return isBoiSoCua3 ? tich : 0;
    }

    //c. Tạo ra mảng một chiều X với X[i] là các giá trị lớn nhất trên từng dòng i của ma trận A. In X ra.
    public static int[] giaTriLonNhatTungHang(int[][] a) {
        int[] x = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int max = a[i][0];
            for (int j = 0; j < a[i].length; j++) {
                max = Math.max(max, a[i][j]);
            }
            x[i] = max;
        }
        return x;
    }

    //d. Tính tổng các số là bội số của 5 nằm trên hàng cuối cùng của ma trận.
    public static int tongBoiSoCua5(int[][] a) {
        int tong = 0;
        for (int j = 0; j < a[0].length; j++) {
            if (a[a.length - 1][j] % 5 == 0) {
                tong += a[a.length - 1][j];
            }
        }
        return tong;
    }

    //e. Tìm số lớn nhất trên đường chéo chính của ma trận.
    public static int soLonNhatTrenDuongCheoChinh(int[][] a) {
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i][i]);
        }
        return max;
    }

    //f. Tìm số nhỏ nhất trên đường chéo phụ của ma trận.
    static int soNhoNhatTrenDuongCheoPhu(int[][] a) {
        int min = a[0][a.length - 1];
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i][a.length - i - 1]);
        }
        return min;
    }

    //g. Đếm số lượng số nguyên tố trong ma trận
    static boolean isSoNguyenTo(int x) {
        if (x < 2) {
            return false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static int soNguyenTo(int[][] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (isSoNguyenTo(a[i][j])) {
                    count++;
                }
            }
        }
        return count;
    }

    //h. Hoán đổi 2 dòng của ma trận
    static void hoanDoiHaiDong(int[][] a, int d1, int d2) {
        for (int i = 0; i < a.length; i++) {
            int[] temp = a[d1];
            a[d1] = a[d2];
            a[d2] = temp;
        }
    }

    //i. Hoán đổi 2 cột của ma trận
    static void hoanDoiHaiCot(int[][] a, int c1, int c2) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i][c1];
            a[i][c1] = a[i][c2];
            a[i][c2] = temp;
        }
    }

}

