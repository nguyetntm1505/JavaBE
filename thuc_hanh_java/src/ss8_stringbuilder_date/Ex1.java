package ss8_stringbuilder_date;

public class Ex1 {
    public static void main(String[] args) {
        //a. Cho chuỗi "Hello World"
        // Lấy ra chữ World bằng cách dùng StringBuffer và StringBuilder.
        String str = "Hello World";
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.substring(6));

        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.substring(6));

        //b. Cho chuỗi "Hello World"
        // Thay o thành f bằng cách dùng StringBuffer và StringBuilder.
        stringBuilder.replace(4, 5, "f");
        stringBuilder.replace(7, 8, "f");
        System.out.println(stringBuilder);

        str = "Hello World";
        stringBuffer.replace(4, 5, "f");
        stringBuffer.replace(7, 8, "f");
        System.out.println(stringBuffer);

        //c. Cho chuỗi "Hello" và chuỗi “World”
        //Nối 2 chuỗi này bằng cách dùng String, StringBuffer và StringBuilder.
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1 + " " + str2);
        System.out.println(str1.concat(" " + str2));

        StringBuffer stringBuffer1 = new StringBuffer(str1);
        StringBuffer stringBuffer2 = new StringBuffer(str2);
        System.out.println(stringBuffer1.append(" " + stringBuffer2));

        StringBuffer stringBuilder1 = new StringBuffer(str1);
        StringBuffer stringBuilder2 = new StringBuffer(str2);
        System.out.println(stringBuilder1.append(" " + stringBuilder2));

        //d. Đoạn code sau tạo ra bao nhiêu đối tượng và kết quả hiển thị là gì:
        String a = "A"; // tạo ra A ở string pool
        String b = new String("A"); // tạo ra A ở heap
        String c = "A"; // tham chiếu đến A ở string pool
        b.concat("B"); // AB ở stack
        String d = c.concat("C"); // tao ra AC ở string pool
        StringBuffer e = new StringBuffer("E"); // tạo E ở heap
        e.append("F"); // EF ở heap
        StringBuilder g = new StringBuilder("G");// tao G ở heap
        g.append("H"); // Tạo GH ở heap
        System.out.println(a + b + c + d + e + g); // AAAACEFGH

        //e. Viết chương trình phân biệt sự khác nhau giữa so sánh bằng method equals và so sánh bằng toán tử == khi sử dụng String, StringBuffer và StringBuilder.

        
    }
}
