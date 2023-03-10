package day6b.BT1;

public class Drawable {
    public <T extends IHinhHoc> void draw(T t) {
        String tmp = String.format("Vẽ hình %s, có diện tích là %.2f,  chu vi là %.2f", t.getClass().getSimpleName(), t.tinhDienTich(), t.tinhChuVi());
        System.out.println(tmp);
    }
}