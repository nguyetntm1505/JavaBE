package ss9_array1;

import java.util.Scanner;

public class Ex1 {
    //    1. Các thao tác nhập xuất
    //    a. Nhập mảng
    //    b. Xuất mảng
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Hay nhap so phan tu n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Ban can nhap vao so nguyen duong ");
            }
        } while (n <= 0);

        int[] arr = new int[n];
        inputArray(arr);
        outputArray(arr);

        //2. Các thao tác kiểm tra
        //    a. Mảng có phải là mảng toàn chẵn?
        if (isAllEven(arr)) {
            System.out.println("Mang toan la so chan");
        } else {
            System.out.println("Mang khong phai toan la so chan");
        }

        //  b. Mảng có phải là mảng toàn số nguyên tố?
        if (isSoNguyeTo(arr)) {
            System.out.println("Mang toan la so nguyen to");
        } else {
            System.out.println("Mang khong phai toan la so nguyen to");
        }

        // c. Mảng có phải là mảng tăng dần?
        if (isTangDan(arr)) {
            System.out.println("Mang tang dan");
        } else {
            System.out.println("Mang khong phai tang dan");
        }

        //3. Các thao tác tính toán
        //a. Đếm số lượng phần tử lẻ có trong mảng a.
        System.out.println("So phan tu le trong mang la: " + soLuongPhanTuLe(arr));

        // b. Tính tổng số dương lẻ của mảng a
        System.out.println("Tong so duong le: " + tongSoDuongLe(arr));

        //c. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5.
        System.out.println("So phan tu chia he cho 4 vs khong chia het cho 5 la: " + chia4Not5(arr));

        //d. Tổng các số nguyên tố có trong mảng.
        System.out.println("Tong cac so nguyen to trong mang: " + tongNguyenTo(arr));

        //4. Các thao tác tìm kiếm
        //a. Vị trí cuối cùng của phần tử x trong mảng.
        System.out.print("Hay nhap phan tu x: ");
        int x = scanner.nextInt();
        if (indexEnd(arr, x) != -1) {
            System.out.printf("Vi tri cuoi cung cua phan tu %d trong mang la: %d", x, indexEnd(arr, x));
            System.out.println();
        } else {
            System.out.printf("Khong co phan tu %d trong mang", x);
            System.out.println();
        }
        //b. Vị trí số nguyên tố đầu tiên trong mảng nếu có.
        if (indexOne(arr) != -1) {
            System.out.println("Vi tri dau tien cua so nguyen to la: " + indexOne(arr));
        } else {
            System.out.println("Khong co so nguyen to trong mang");
        }

        //c. Tìm số dương nhỏ nhất trong mảng.
        System.out.println("So nguyen duong nho nhat trong mang: " + soDuongNhoNhat(arr));

        //d. Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng. (*)
        System.out.print("Nhap vao phan tu K:");
        int k = scanner.nextInt();
        indexOfK(arr, k);

        //e. Tìm giá trị lớn nhất và nhỏ nhất của mảng a
    }

    //nhap mang
    public static void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap phan tu arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }

    //xuat mang
    public static void outputArray(int[] arr) {
        System.out.print("Cac phan tu trong mang la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Mảng có phải là mảng toàn chẵn?
    public static boolean isAllEven(int[] arr) {
        for (int num : arr) {
            if (num % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    //Mảng có phải là mảng toàn số nguyên tố?
    public static boolean isSoNguyeTo(int[] arr) {
        for (int num : arr) {
//            if (num < 2) {
//                return false;
//            }
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    return false;
//                }
//            }
            if (isSoNguyenTo(num) == false) {
                return false;
            }
        }
        return true;
    }

    //Mảng có phải là mảng tăng dần?
    public static boolean isTangDan(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    //a. Đếm số lượng phần tử lẻ có trong mảng a
    public static int soLuongPhanTuLe(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // b. Tính tổng số dương lẻ của mảng a
    public static int tongSoDuongLe(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num <= 0) {
                //nothing
            } else {
                if (num % 2 == 1) {
                    sum += num;
                }
            }
        }
        return sum;
    }

    //c. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5.
    public static int chia4Not5(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 4 == 0 && num % 5 != 0) {
                count++;
            }
        }
        return count;
    }

    //d. Tổng các số nguyên tố có trong mảng.
    public static int tongNguyenTo(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (isSoNguyenTo(num)) {
                sum += num;
            }
        }
        return sum;
    }

    //a. Vị trí cuối cùng của phần tử x trong mảng.
    public static int indexEnd(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr.length - 1 - i] == x) {
                return (arr.length - 1 - i);
            }
        }
        return -1;
    }

    //so nguyen to
    public static boolean isSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //b. Vị trí số nguyên tố đầu tiên trong mảng nếu có.
    public static int indexOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isSoNguyenTo(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    //c. Tìm số dương nhỏ nhất trong mảng.
    public static int soDuongNhoNhat(int[] arr) {
        int soDuongMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= soDuongMin) {
                soDuongMin = arr[i];
            }
        }
        if (soDuongMin == Integer.MAX_VALUE) {
            return -1;
        } else {
            return soDuongMin;
        }
    }

    //d. Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng. (*)
    public static void indexOfK(int[] arr, int k) {
        int count = 0;
        System.out.print("So phan tu K trong mang la: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                count++;
                System.out.print(i + " ");
            }
        }
        if (count == 0) {
            System.out.print("Khong co phan tu K trong mang");
        }
        System.out.println();
    }

    //e. Tìm giá trị lớn nhất và nhỏ nhất của mảng a

}


