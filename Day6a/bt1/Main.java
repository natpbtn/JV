package Day6a.bt1;

public class Main {
    public static void main(String[] args) {
        MayTinh<Double> mayTinh = new MayTinhDouble();
        // Tinh tong
        System.out.println(mayTinh.tong(3.0, 4.0, 5.0, 6.0));

        // Tinh tich
        System.out.println(mayTinh.tich(1.0, 2.0, 3.0));


        MayTinh<PhanSo> mayTinh1 = new MayTinhPhanSo();
        PhanSo ps1 = new PhanSo(1, 2);
        PhanSo ps2 = new PhanSo(3, 4);
        PhanSo ps3 = new PhanSo(5, 6);

        PhanSo t1 = mayTinh1.tong(ps1, ps3, ps2).rutGonPhanSo();
        PhanSo t2 = mayTinh1.tong(ps2, ps1, ps3).rutGonPhanSo();
        System.out.println(t1);
        System.out.println(t2);

    }
}
