package day7a;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Collection
        Collection<String> stringCollection = new ArrayList<>();
        // Thêm một string
        stringCollection.add("Hello");
        stringCollection.add("Hi");
        // In ra collection
        System.out.println(stringCollection);
        // Thay đổi giá trị 1 phần tử theo index
        // Collection -> ko co, lat dung List

        stringCollection.remove("Hello");
        System.out.println(stringCollection);

        // Lay ra kich thuoc cua collection
        System.out.println(stringCollection.size());

    }
}
