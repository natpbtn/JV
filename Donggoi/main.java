package Donggoi;

import Day4a.HinhTron;

public class main {
    public static void main(String[] args) {
        HinhTron h = new HinhTron();
//        h.banKinh = -4;
        h.setBanKinh(-5);
        System.out.println(h.chuVi());
        System.out.println(h.dienTich());
    }
}
