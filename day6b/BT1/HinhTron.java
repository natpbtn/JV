package day6b.BT1;

public class HinhTron implements IHinhHoc{
    private double banKinh = 1.0;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        if(banKinh <= 0){
            throw new RuntimeException("Error");
        }
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if(banKinh <= 0){
            throw new RuntimeException("Error");
        }
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return Math.PI * 2 * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }
}
