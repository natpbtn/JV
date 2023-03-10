package Day6a.bt1;

public class Main1 {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(3, 4);
        PhanSo ps2 = new PhanSo(1, 2);

        System.out.println(ps1.cong(ps2).rutGonPhanSo());
        System.out.println(ps1.tru(ps2).rutGonPhanSo());
        System.out.println(ps1.nhan(ps2).rutGonPhanSo());
        System.out.println(ps1.chia(ps2).rutGonPhanSo());
    }
}