package day7b.bt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // a. Nhap hinh
        List<HinhHoc3D> hinhHoc3DList = new ArrayList<>();
        hinhHoc3DList.add(new HinhCau(9));
        hinhHoc3DList.add(new HinhLapPhuong(5));
        hinhHoc3DList.add(new HinhCau(7));
        hinhHoc3DList.add(new HinhLapPhuong(8));
        hinhHoc3DList.add(new HinhTru(2, 3));

        System.out.println(hinhHoc3DList);
        // b. Hinh co the tich be nhat
        HinhHoc3D minHinhHoc3D = hinhHoc3DList.get(0);
        for (int i = 1; i < hinhHoc3DList.size(); i++) {
            if (minHinhHoc3D.tinhTheTich() > hinhHoc3DList.get(i).tinhTheTich()) {
                minHinhHoc3D = hinhHoc3DList.get(i);
            }
        }
        System.out.println(minHinhHoc3D);

        // c. Tu lam
        // d. Sap xep tang dan
        Collections.sort(hinhHoc3DList);
        System.out.println(hinhHoc3DList);

        // e. Sap xep theo giam dan ?
        Collections.sort(hinhHoc3DList, new Comparator<HinhHoc3D>() {
            @Override
            public int compare(HinhHoc3D o1, HinhHoc3D o2) {
                if (o1.tinhTheTich() > o2.tinhTheTich()) {
                    return -1;
                } else if (o1.tinhTheTich() > o2.tinhTheTich()) {
                    return 1;
                }
                return 0;
            }
        });
        System.out.println(hinhHoc3DList);

    }
}
