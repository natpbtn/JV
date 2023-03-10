package Day6a;

// Tham số hoá kiểu dữ liệu

public class Box <T> {
    private T t;

    public void put(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
}
