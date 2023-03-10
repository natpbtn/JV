package Donggoi;

import Day4a.HinhTron;

public class mainHCN {
    //Tao 1 class HinhChuNhat co 2 thuoc tinh chieu dai va chieu rong. (private)
    //Gia tri mac dinh = 1.0 ( >= 0)
    //co 2 phuong thuc khoi tao, mac dinh va day du tham so
    //Setter, getter cho tung thuoc tinh
    //chuVi()
    //dienTich()
    //Viet chuong trinh thu nghiem, tao 2 doi tuong va tinh toan
    // TestCase1: chieuDai = 0, chieuRong =4 -> tinh cv, dt
    // TestCase2: chieuDai = 1.5, chieuRong = 3 -> tinh cv, dt

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(0,4);
        System.out.println("Chu Vi: " + hcn.tinhChuVi());
        System.out.println("Dien Tich: " + hcn.tinhDienTich());

        HinhChuNhat hcn1 = new HinhChuNhat(1.5,3);
        System.out.println("Chu Vi: " + hcn1.tinhChuVi());
        System.out.println("Dien Tich: " + hcn1.tinhDienTich());
    }
}

