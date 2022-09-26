package bai1;

import java.util.Scanner;

public class QuanLyChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        XeMayHoaBinh xHb = new XeMayHoaBinh();
        XeMayHaNoi xHn = new XeMayHaNoi();
        String luachon = "";
        int n = 0;
        while (true) {
            System.out.println(
                    "===Menu===\n1.Nhap thong tin n xe Hoa Binh\n2.Nhap thong tin n xe Ha Noi\n3.Sap xep danh sach tang dan theo bien so xe\n3.Tim kiem thong tin xe theo bien so xe\n5.Thong ke so luong xe dang quan ly\n6.Thoat\n");

            System.out.printf("Nhap lua chon: ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    xHb.nhap(sc);
                    break;
                case 2:
                    xHn.nhap(sc);
                    break;
                case 3:
                    System.out.printf("(Hoa Binh/Ha Noi)?: ");
                    luachon = sc.nextLine();
                    if (luachon.toUpperCase().equals("HOA BINH")) {
                        xHb.Sort();
                        xHb.hienthi();
                    } else {
                        xHn.Sort();
                        xHn.hienthi();
                    }
                case 4:
                    System.out.printf("(Hoa Binh/Ha Noi)?: ");
                    luachon = sc.nextLine();
                    System.out.printf("Nhap bien so xe can tim: ");
                    String bienSo = sc.nextLine();
                    if (luachon.toUpperCase().equals("HOA BINH")) {
                        xHb.Search(bienSo);
                    } else {
                        xHn.Search(bienSo);
                    }
                case 5:
                    System.out.printf("(Hoa Binh/Ha Noi)?: ");
                    luachon = sc.nextLine();
                default:
                    break;
            }
        }
        sc.close();
    }
}
