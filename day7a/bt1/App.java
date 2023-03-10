package day7a.bt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {

    private static void mainMenu() {
        System.out.println("--------QUAN LY DIEM--------");
        System.out.println("1. Danh sách sinh viên");
        System.out.println("2. Nhập thông tin sinh viên");
        System.out.println("3. Tìm kiếm sinh viên theo mã");
        System.out.println("4. Danh sách môn học");
        System.out.println("5. Nhập thông tin môn mới");
        System.out.println("6. Nhập điểm môn học");
        System.out.println("7. Cập nhật điểm");
        System.out.println("8. Xem điểm sinh viên theo mã");
        System.out.println("9. In ra danh sách sinh viên theo các môn học");
        System.out.println("10. In ra sinh viên có điểm trung bình tất cả các môn cao nhất");
        System.out.println("0. Thoát khỏi chương trình");
    }

    public static void main(String[] args) {
        // Tao cac danh sach gồm 1 bạn
        List<SinhVien> sinhVienList = new ArrayList<>();
        sinhVienList.add(new SinhVien("BKC1","Nguyen Van A", "2000-01-01","HN"));
        List<MonHoc> monHocList = new ArrayList<>();
        monHocList.add(new MonHoc("Java1","Lập trình Java cơ bản"));
        List<Diem> diemList = new ArrayList<>();
        diemList.add(new Diem("BKC1","Java1",10));

        // Chuong trinh chinh
        Scanner in = new Scanner(System.in);
        int option = -1;
        do {
            mainMenu();
            System.out.print("Nhập lựa chọn: ");
            // Nhập dữ liệu
            try {
                option = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập sai định dạng");
                continue;
            }
            // Kiểm tra xem người dùng nhập lựa chọn nào?
            if (option < 1 || option > 10) {
                System.out.println("Lựa chọn không hợp lệ!");
                continue;
            }
            switch (option) {
                case 1:
                    // In ra danh sach sinh vien
                    if (sinhVienList.size() == 0) {
                        System.out.println("Danh sách sinh viên trống!");
                        continue;
                    }
                    System.out.printf("Danh sách %d sinh viên: \n", sinhVienList.size());
                    for (SinhVien s : sinhVienList) {
                        System.out.println(s);
                    }
                    break;
                case 2:
                    SinhVien s = new SinhVien();
                    System.out.print("\tNhập mã sinh viên: ");
                    s.setMaSinhVien(in.nextLine());
                    System.out.print("\tNhập tên sinh viên: ");
                    s.setTenSinhVien(in.nextLine());
                    System.out.print("\tNhập ngày sinh: ");
                    s.setNgaySinh(in.nextLine());
                    System.out.print("\tNhập quê quán: ");
                    s.setQueQuan(in.nextLine());

                    // Them ban sinh vien vua tao vao danh sach
                    sinhVienList.add(s);

                    break;
                case 3:
                    // Y tuong -> duyet arrayList, xem co khop id nhap vao hay ko?
                    System.out.print("\tNhập mã sinh viên cần tìm: ");
                    String maSV = in.nextLine();

                    // Đặt cờ đánh dấu, false là ko có
                    boolean flag = false;

                    for (SinhVien student: sinhVienList) {
                        if(student.getMaSinhVien().equals(maSV)){
                            flag = true;
                            System.out.println(student);
                            break;
                        }
                    }
                    if(flag == false){
                        System.out.println("Không tìm thấy sinh viên đó!");
                    }

                    break;
                case 4:
                    // Tu lam tiep
                    if (monHocList.size() == 0) {
                        System.out.println("Danh sách môn học trống!");
                        continue;
                    }
                    System.out.printf("Danh sách %d môn học: \n", monHocList.size());
                    for (MonHoc a : monHocList) {
                        System.out.println(a);
                    }
                    break;
                case 5:
                    // Tu lam tiep
                    MonHoc a = new MonHoc();
                    System.out.print("\tNhập mã môn học: ");
                    a.setMaMonHoc(in.nextLine());
                    System.out.print("\tNhập tên môn học: ");
                    a.setTenMonHoc(in.nextLine());
                    // Them ban sinh vien vua tao vao danh sach
                    monHocList.add(a);
                    break;
                case 6:
                    // Nhap ma sinh vien -> kiem tra xem co hop le hay ko
                    System.out.print("Nhập mã sinh viên: ");
                    String mSv = in.nextLine();
                    boolean flag1 = false;
                    for (SinhVien sinhVien: sinhVienList) {
                        if(sinhVien.getMaSinhVien().equals(mSv)){
                            flag1 = true;
                            break;
                        }
                    }
                    if(flag1 == false) {
                        System.out.println("Không có sinh viên đó!");
                        continue;
                    }
                    // Nhap ma mon hoc -> kiem tra xem ma mon co hop le hay ko
                    System.out.print("Nhập mã môn học: ");
                    String mMh = in.nextLine();
                    boolean flag2 = false;
                    for (MonHoc monHoc: monHocList) {
                        if(monHoc.getMaMonHoc().equals(mMh)){
                            flag2 = true;
                            break;
                        }
                    }
                    if(flag2 == false) {
                        System.out.println("Không có môn học đó!");
                        continue;
                    }
                    // Nhap diem
                    System.out.print("Nhập điểm: ");
                    int diem = Integer.parseInt(in.nextLine());
                    Diem d = new Diem(mSv, mMh, diem);

                    // Them diem vao listDiem
                    diemList.add(d);

                    break;
                case 7:
                    // Nhap ma sinh vien -> kiem tra xem co hop le hay ko
                    System.out.print("Nhập mã sinh viên: ");
                    String mSv11 = in.nextLine();
                    boolean flag11 = false;
                    for (SinhVien sinhVien: sinhVienList) {
                        if(sinhVien.getMaSinhVien().equals(mSv11)){
                            flag11 = true;
                            break;
                        }
                    }
                    if(flag11 == false) {
                        System.out.println("Không có sinh viên đó!");
                        continue;
                    }
                    // Nhap ma mon hoc -> kiem tra xem ma mon co hop le hay ko
                    System.out.print("Nhập mã môn học: ");
                    String mMh1 = in.nextLine();
                    boolean flag22 = false;
                    for (MonHoc monHoc: monHocList) {
                        if(monHoc.getMaMonHoc().equals(mMh1)){
                            flag22 = true;
                            break;
                        }
                    }
                    if(flag22 == false) {
                        System.out.println("Không có môn học đó!");
                        continue;
                    }

                    // Kiểm tra xem bạn sv đã học môn này chưa và có điểm chưa ??
                    Diem diemSv = null;
                    for (Diem diemMH: diemList) {
                        if(diemMH.getMaSinhVien().equals(mSv11) && diemMH.getMaMonHoc().equals(mMh1)){
                            diemSv = diemMH;
                            break;
                        }
                    }
                    if(diemSv == null){
                        System.out.println("Sinh viên có mã "+ mSv11 + " chưa có điểm môn học "+ mMh1);
                    }
                    else {
                        System.out.print("Nhập điểm mới: ");
                        diemSv.setDiemSo(Integer.parseInt(in.nextLine()));
                        System.out.println("Cập nhật điểm thành công");
                    }

                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
            }

        }
        while (option != 0);
        in.close();
    }
}
