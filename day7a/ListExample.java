package day7a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Tao 1 ArrayList luu tru thong tin cua cac ban sinh vien?
        // Chua biet so luong cu the, co the them nhieu ?
        List<Student> arrayList = new ArrayList<>();

        // Them 1 ban sinh vien
        Student s1 = new Student(10, "Student 1");
        arrayList.add(s1);

        // Them student 2
        Student s2 = new Student(2, "Student 2");
        arrayList.add(s2);

        // In ra danh sach sinh vien
        System.out.printf("Có %d bạn sinh viên trong danh sách\n", arrayList.size());
        System.out.println(arrayList);

        // Thay đổi tên của bạn Student 2 -> Sinh viên 2 ???
        Student s = arrayList.get(1);
        s.setName("Sinh vien 2");

        System.out.println(arrayList);

        // Thay thế phần tử tại vị trí index = 1
        Student s3 = new Student(3, "Student 3");
        arrayList.set(1, s3);

        System.out.println(arrayList);

        // Xoá phần tử trong ArrayList theo chi so
//        arrayList.remove(0);
//
//        System.out.println(arrayList);

        // Xoa phan tu theo Object cu the?
//        arrayList.remove(s3);
//        System.out.println(arrayList);

        // Sap xep cac phan tu
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}