package Donggoi;

public class HinhTron {
    private double banKinh = 1.0;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if(banKinh > 0) {
            this.banKinh = banKinh;
        }
        else{
            System.out.println("Bán kính không hợp lệ");
        }
    }

    public double chuVi(){
        return Math.PI * banKinh * 2;
    }

    public double dienTich(){
        return Math.PI * banKinh * banKinh;
    }
}
