package ss10_array2;

import java.util.Scanner;

public class Ex1 {
    //a. Tách các số nguyên tố có trong mảng a đưa vào mảng b.
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("So phan tu cua mang phai lon hon 0");
            }
        } while (n <= 0);

        int[] a = new int[n];
        nhapMang(a);
        System.out.print("\nCac phan tu cua mang a la: ");
        xuatMang(a);
        int[] b = tachSoNguyenToCuaA(a);
        System.out.print("\nCac phan tu cua mang sau khi tach so nguyen to la: ");
        xuatMang(b);

        //b. Tách mảng a thành 2 mảng b (chứa các số nguyên dương) và c (chứa các số còn lại)
        int[] c = tachSoNguyenDuongCuaA(a);
        int[] d = cacSoConLaiSauKhiTachSoNguyenDuong(a);
        System.out.print("\nCac phan tu cua mang sau khi tach so nguyen duong la: ");
        xuatMang(c);
        System.out.print("\nCac phan tu con lai cua mang sau khi tach so nguyen duong la: ");
        xuatMang(d);

        //c. Sắp xếp mảng giảm dần
        int[] e = mangGiamDan(a);
        System.out.print("\nCac phan tu cua mang sau khi sap xep giam dan: ");
        xuatMang(e);

        //d. Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần, kế đến là các số âm tăng dần, cuối cùng là các số 0.
        int[] f = saoChepD(a);
        System.out.print("\nCac phan tu cua mang sau khi số dương đứng đầu mảng giảm dần, kế đến là các số âm tăng dần, cuối cùng là các số 0: ");
        xuatMang(f);
    }

    public static void nhapMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Nhap phan tu a[%d] : ", i);
            a[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static boolean soNguyenTo(int x) {
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

    public static int[] tachSoNguyenToCuaA(int[] a) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (soNguyenTo(a[i])) {
                k++;
            }
        }
        int[] b = new int[k];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (soNguyenTo(a[i])) {
                b[index] = a[i];
                index++;
            }
        }
        return b;
    }

    //b. Tách mảng a thành 2 mảng b (chứa các số nguyên dương) và c (chứa các số còn lại)
    static int[] tachSoNguyenDuongCuaA(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                count++;
            }
        }
        int[] b = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                b[index] = a[i];
                index++;
            }
        }
        return b;
    }

    static int[] cacSoConLaiSauKhiTachSoNguyenDuong(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                count++;
            }
        }
        int[] c = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                c[index] = a[i];
                index++;
            }
        }
        return c;
    }

    //c. Sắp xếp mảng giảm dần
    static int[] mangGiamDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    //d. Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần, kế đến là các số âm tăng dần, cuối cùng là các số 0.
    static int[] soDuongGiamDan(int[] a) {
        int[] b = tachSoNguyenDuongCuaA(a);
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return b;
    }

    static int[] tachSoNguyenAmCuaA(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                count++;
            }
        }
        int[] c = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                c[index] = a[i];
                index++;
            }
        }
        return c;
    }
    static int[] soAmTangDan(int[] a) {
        int[] d = tachSoNguyenAmCuaA(a);
        for (int i = 0; i < d.length - 1; i++) {
            for (int j = i + 1; j < d.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return d;
    }

    static int[] saoChepD(int[] a){
        int[] b = new int[a.length];
        int [] c = soDuongGiamDan(a);
        int[] d = soAmTangDan(a);
        System.arraycopy(c, 0, b, 0, c.length);
        System.arraycopy(d, 0, b, c.length, d.length);
        return b;
    }

    //e. Đảo thứ tự các phần tử của mảng a.

}


