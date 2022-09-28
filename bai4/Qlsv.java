package bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Qlsv {
    private static void Nhap(ArrayList<SinhVienPoly> list, Scanner sc) {
        do {
            String name, majors;
            double mark1, mark2, mark3;
            System.out.printf("\nNhap ho ten: ");
            name = sc.nextLine();
            do {
                System.out.printf("Nhap thong tin sinh vien (IT/Biz)?: ");
                majors = sc.nextLine();
            } while (!majors.toUpperCase().equals("IT") && !majors.toUpperCase().equals("BIZ"));
            if (majors.toUpperCase().equals("IT")) {
                System.out.printf("Nhap diem Java: ");
                mark1 = Double.parseDouble(sc.nextLine());
                System.out.printf("Nhap diem Html: ");
                mark2 = Double.parseDouble(sc.nextLine());
                System.out.printf("Nhap diem Css: ");
                mark3 = Double.parseDouble(sc.nextLine());
                list.add(new SinhVienIT(name, majors, mark1, mark2, mark3));
            } else {
                System.out.printf("Nhap diem Marketing: ");
                mark2 = Double.parseDouble(sc.nextLine());
                System.out.printf("Nhap diem Sales: ");
                mark3 = Double.parseDouble(sc.nextLine());
                list.add(new SinhVienBiz(name, majors, mark2, mark3));
            }
            System.out.printf("\nTiep tuc nhap (y/n)?: ");
        } while (!sc.nextLine().toUpperCase().equals("N"));
    }

    private static void Xuat(ArrayList<SinhVienPoly> list) {
        System.out.println("-".repeat(63));
        System.out.printf("%-20s|%-20s|%-10s|%-10s\n", "Ho ten", "Nganh hoc", "Diem", "Hoc luc");
        System.out.println("-".repeat(63));
        for (SinhVienPoly sinhVienPoly : list) {
            sinhVienPoly.xuat();
        }
        System.out.println("-".repeat(63));
    }

    private static void SVGioi(ArrayList<SinhVienPoly> list) {
        System.out.println("\n\n\t===Danh sach thong tin sinh vien hoc luc gioi===\n\n");
        System.out.println("-".repeat(63));
        System.out.printf("%-20s|%-20s|%-10s|%-10s\n", "Ho ten", "Nganh hoc", "Diem", "Hoc luc");
        System.out.println("-".repeat(63));
        for (SinhVienPoly sinhVienPoly : list) {
            if (sinhVienPoly.getHocLuc().equals("Gioi"))
                sinhVienPoly.xuat();
        }
        System.out.println("-".repeat(63));
    }

    private static void SapXep(ArrayList<SinhVienPoly> list) {
        Collections.sort(list, new Comparator<SinhVienPoly>() {

            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                return o1.getDiem() > o2.getDiem() ? 1 : o1.getDiem() == o2.getDiem() ? 0 : -1;
            }
        });
        System.out.println("\n\n\t===Danh sach thong tin sinh vien theo diem===\n\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVienPoly> list = new ArrayList<SinhVienPoly>();
        int n;
        while (true) {
            System.out.println(
                    "\n\n\n\t===Quan ly sinh vien===\n\n1.Nhap danh sach sinh vien\n2.Xuat thong tin sinh vien\n3.Xuat danh sach sinh vien co hoc luc gioi\n4.Sap xep danh sach sinh vien theo diem\n5.Ket thuc\n");
            System.out.printf("Nhap lua chon: ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    Nhap(list, sc);
                    break;
                case 2:
                    System.out.println("\n\n\t\t===Danh sach thong tin sinh vien===\n\n");
                    Xuat(list);
                    break;
                case 3:
                    SVGioi(list);
                    break;
                case 4:
                    SapXep(list);
                    Xuat(list);
                    break;
                case 5:
                    sc.close();
                    return;
            }
        }
    }
}
