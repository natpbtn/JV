package day6b.bt3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Tao mang student
        Student[] students = new Student[3];
        students[0] = new Student(1, "S1", 7);
        students[1] = new Student(2, "S2", 5);
        students[2] = new Student(3, "S3", 8);


        // Mac dinh sap xep Danh sach student theo tang dan cua diem?
        SortArray sortArray = new SortArray();
        // In ra danh sach truoc khi sap xep
        sortArray.printArray(students);
        // In ra danh sach sau khi sap xep
        sortArray.sorted(students);
        sortArray.printArray(students);

        // Tao mang hinh tron
        HinhTron[] hinhTrons = new HinhTron[10];
        Random random = new Random();
        for (int i = 0; i < hinhTrons.length ; i++) {
            hinhTrons[i]= new HinhTron(random.nextInt(100)+1);
        }
        // In ra 10 hinh do
        sortArray.printArray(hinhTrons);
        // In ra 10 hinh sap xep
        sortArray.sorted(hinhTrons);
        sortArray.printArray(hinhTrons);
    }
}
