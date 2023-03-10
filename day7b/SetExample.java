package day7b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Tao 1 set chứa các chuỗi được nhập từ bàn phím
        Scanner in = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();
        while (true) {
            System.out.print("Enter your string: ");
            String tmp = in.nextLine();
            if (tmp.equalsIgnoreCase("exit")) break;
            stringSet.add(tmp);
            // Print set
            System.out.println(stringSet);
        }
        // Hashcode
        // Đóng phần nhập
        in.close();
    }
}
