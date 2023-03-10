package day7b.bt2;

public class HinhTru implements HinhHoc3D {

    public double chieuCao = 1.0;
    private double banKinh = 1.0;

    public HinhTru() {
    }

    public HinhTru(double chieuCao, double banKinh) {
        if (chieuCao <= 0 || banKinh <= 0) {
            throw new IllegalArgumentException("Kich thuoc phai duong");
        }
        this.chieuCao = chieuCao;
        this.banKinh = banKinh;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        if (chieuCao <= 0) {
            throw new IllegalArgumentException("Kich thuoc phai duong");
        }
        this.chieuCao = chieuCao;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh <= 0) {
            throw new IllegalArgumentException("Kich thuoc phai duong");
        }
        this.banKinh = banKinh;
    }

    @Override
    public double tinhTheTich() {
        return Math.PI * banKinh * banKinh * chieuCao;
    }

    @Override
    public String toString() {
        return "HinhTru{" +
                "chieuCao=" + chieuCao +
                ", banKinh=" + banKinh +
                '}';
    }
}
