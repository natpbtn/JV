package Day6a;

import java.util.Arrays;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        /*Tạo 1 class lưu trữ theo dạng Key-Value

        Class này có thể dùng để lưu các giá trị
        họ tên - số diện thoại
        hoặc
        STT - họ tên

        hoặc theo từ điển Anh - Việt
        hello - { xin chào, chào, ...}*/

        // Tao tu dien Anh Viet
        MyDictionary<String, String> myDictionary = new MyDictionary<>();
        myDictionary.setK("Hello");
        myDictionary.setV("Xin chào");

        System.out.println(myDictionary);

        // 1 từ tiếng Anh, ứng với nhiều từ tiếng Việt ??
        MyDictionary<String, List<String> > myDictionary1 = new MyDictionary<>();
        myDictionary1.setK("hi");
        myDictionary1.setV(Arrays.asList("Xin chào", "Chào", "Lời chào"));
        System.out.println(myDictionary1);
    }
}
