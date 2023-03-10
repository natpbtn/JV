package day7b;

import java.util.*;

public class SetExample2 {
    public static void main(String[] args) {
        Set<Car> carSet = new HashSet<>();

        Car car1 = new Car(1, "Honda");
        Car car2 = new Car(1, "Honda");

        carSet.add(car1);
        carSet.add(car2);
        // Cac doi tuong giong nhau -> khi hashcode giong nhau
        Car car3 = car1;
        System.out.println(car3.hashCode());
        System.out.println(car1.hashCode());

        carSet.add(car3);
        System.out.println(carSet);

        // Gia su co 1 set cac phan tu -> nhu cầu duyệt theo chỉ số
        // Thì làm thế nào???

        // Chuyển sang List
        List<Car> listCar = new ArrayList<>();
        listCar.addAll(carSet);
        System.out.println(listCar);

        System.out.println(listCar.get(0));

        // Có 1 list các phân từ, bao gồm các giá trị trùng lăp
        // Tạo 1 list mới -> chỉ chưa các giá trị lặp lại 1 lần ??

        List<String> dulicateStringList = Arrays.asList("hello", "hi", "hello", "abc","hi");
        System.out.println(dulicateStringList);

        Set<String> tmpSet = new HashSet<>();
        tmpSet.addAll(dulicateStringList);

        List<String> newList = new ArrayList<>(tmpSet);
        System.out.println(newList);
        System.out.println(newList.get(0));

//        System.out.println(tmpSet);

    }
}