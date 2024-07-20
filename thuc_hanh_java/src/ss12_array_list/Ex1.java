package ss12_array_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ex1 {
    //a. Nhập một Arraylist tên gọi là a gồm n phần tử kiểu nguyên int.
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap phan tu cua mang: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("So phan tu cua mang phai la so nguyen duong");
            }
        } while (n <= 0);

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu arr[%d]: ", i);
            arr.add(scanner.nextInt());
        }
        //b. In giá trị của các phần tử a.
        System.out.println("Cac phan tu cua mang la: " + arr);

        // c. Đếm số lượng phần tử lẻ trong arraylist a.
        System.out.println("So luong phan tu le co trong mang la: " + soLuongPhanTuLeTrongMang(arr));

        //d. Tính tổng số dương lẻ của a.
        System.out.println("Tong so duong le co trong mang la: " + tongSoDuongLeTrongMang(arr));

        //e. Nhập vào phần tử k, tìm xem k có xuất hiện trong a không. Nếu có chỉ ra các vị trí của k trong arraylist.
        System.out.print("Nhap vao phan tu k: ");
        int k = scanner.nextInt();
        ArrayList<Integer> cacViTriIndex = cacViTriXuatHienK(arr,k);

        if(cacViTriIndex.size() == 0){
            System.out.println("Khong co phan tu k trong mang!!");
        }else{
            System.out.println("Vi tri cua k trong mang la: " + cacViTriIndex);
        }
        

        //f. Sắp sếp a theo thứ tự tăng dần. => Gợi ý: Sử dụng Collection sort để xử lý.
        Collections.sort(arr);
        System.out.println("Sap xep mang theo thu tu tang dan: " + arr);

        //g. Đảo ngược thứ tự các phần tử của a. => Gợi ý: Sử dụng Collections reverse để xử lý.
        Collections.reverse(arr);
        System.out.println("Dao nguoc thu tu cac phan tu cua a: : " + arr);



    }

    // c. Đếm số lượng phần tử lẻ trong arraylist a.
    public static int soLuongPhanTuLeTrongMang(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    //d. Tính tổng số dương lẻ của a.
    public static int tongSoDuongLeTrongMang(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 1) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    //e. Nhập vào phần tử k, tìm xem k có xuất hiện trong a không. Nếu có chỉ ra các vị trí của k trong arraylist.
    public static ArrayList<Integer> cacViTriXuatHienK(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> cacViTriIndex = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                cacViTriIndex.add(i);
            }
        }
        return cacViTriIndex;
    }



}
