package day7a.bt1;

public class Diem {
    private String maSinhVien;
    private String maMonHoc;

    private int diemSo;

    public Diem() {
    }

    public Diem(String maSinhVien, String maMonHoc, int diemSo) {
        this.maSinhVien = maSinhVien;
        this.maMonHoc = maMonHoc;
        this.diemSo = diemSo;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public void setDiemSo(int diemSo) {
        this.diemSo = diemSo;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public int getDiemSo() {
        return diemSo;
    }

    @Override
    public String toString() {
        return "Diem[" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", maMonHoc='" + maMonHoc + '\'' +
                ", diemSo=" + diemSo +
                ']';
    }
}