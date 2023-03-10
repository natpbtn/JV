package day6b.bt3;

public class SortArray {
    // Cho phep sap xep tat ca cac doi tuong implement comparator

    public <T extends MyComparator<T>> void printArray(T[] arr){
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    public <T extends MyComparator<T>> void sorted(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i].compare(arr[j]) > 0 ){
                    T tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
