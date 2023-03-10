package day5.bt1;

public abstract class HinhHoc {
    /*BT1.
            Tạo 1 class trừu tượng HinhHoc có các thuộc tính
- mauSac: String
    Có 2 phương thức trừu tượng:
            + tinhChuVi(): double
+ tinhDienTich(): double

    Tạo class HinhTron kế thừa từ HinhHoc, có thêm thuộc tính:
            - banKinh: double = 1.0
    Làm rõ các phương thức trừu tượng
    Ghi đè lại toString()

    Tạo class HinhVuong kế thừa từ HinhHoc, có thêm thuộc tính:
            - canh: double = 1.0
    Làm rõ các phương thức trừu tượng
    Ghi đè lại toString()

    a. Nhập vào 1 mảng các đối tượng hình học, lưu ý: có thể gồm hinhTron, hinhVuong...
    b. In ra hình có diện tích lớn nhất.
    c. In ra hình có diện tích bé nhất
     */
    private String mauSac = "trắng";

    public HinhHoc() {
    }

    public HinhHoc(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();

    @Override
    public String toString() {
        return "HinhHoc[" +
                "mauSac='" + mauSac + '\'' +
                ']';
    }
}

