package day5.bt1;

public class Main {
    public static void main(String[] args) {
        // Mang hinh hoc
        HinhHoc[] arr = new HinhHoc[3];
        arr[0] = new HinhTron(3);
        arr[1] = new HinhVuong(40);
        arr[2] = new HinhTron(10);

        // Dien tich lon nhat
        HinhHoc hinhHocMax = null;
        double dtMax = 0;

        for (HinhHoc h: arr) {
            if(h.tinhDienTich() > dtMax){
                dtMax = h.tinhDienTich();
                hinhHocMax = h;
            }
        }
        System.out.println("Hinh co dien tich lon nhat la: ");
        System.out.println(hinhHocMax);

    }
}
