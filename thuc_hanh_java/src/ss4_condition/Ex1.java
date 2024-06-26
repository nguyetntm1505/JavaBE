package ss4_condition;

//Tính giá trị của biến c và biến d

public class Ex1 {
    public static void main(String[] args) {
        boolean a = true && false;// -> a = false
        boolean b = (3 > 100) || (25 % 5 == 0); //b = true
        boolean c = a && b; // c = false
        boolean d = !a || b; // d = true
        System.out.println("Value of c is: " + c);
        System.out.println("Value of d is: " + d);
    }
}
