package chuong_3_tong_quan_java;

import java.util.Scanner;

/*De bai: Nhập tên sản phẩm, số lượng và đơn giá. Tính tiền và thuế giá trị gia tăng phải trả, biết:
a. tiền = số lượng * đơn giá
b. thuế giá trị gia tăng = 10%
c. tong hoa don da bao gom thue*/

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input the name of product: ");
        String nameOfProduct = scanner.nextLine();

        System.out.print("Please input the number of product: ");
        int numberOfProduct = scanner.nextInt();

        System.out.print("Please input the price of product: ");
        double priceOfProduct = scanner.nextDouble();

        //a. tiền = số lượng * đơn giá
        double sumOfPrice = numberOfProduct * priceOfProduct;
        System.out.println(numberOfProduct + " " + nameOfProduct + " have a price: " + sumOfPrice);

        //b. thuế giá trị gia tăng = 10%*/
        double vatTax = sumOfPrice * 0.1;
        //Tai sao cho nay dung double vatTax = sumOfPrice * 10%; lai bao loi ko chay duoc?
        System.out.println("VAT Tax: " + vatTax);

        //c. tong hoa don da bao gom thue
        System.out.print("Total " + (sumOfPrice + vatTax));
    }
}
