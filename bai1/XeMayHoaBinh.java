package bai1;

import java.util.Scanner;

public class XeMayHoaBinh extends XeMay {
    private int n;
    XeMay[] mangxe;

    public XeMayHoaBinh(String bienso, String loaixe, String mauxe, float giatien, int n, XeMay[] mangxe) {
        super(bienso, loaixe, mauxe, giatien);
        this.n = n;
        this.mangxe = mangxe;
    }

    public XeMayHoaBinh() {
        super();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public XeMay[] getMangxe() {
        return mangxe;
    }

    public void setMangxe(XeMay[] mangxe) {
        this.mangxe = mangxe;
    }

    public void nhap(Scanner sc) {
        System.out.printf("Nhap  vao so luong xe may o hoa binh: ");
        n = Integer.parseInt(sc.nextLine());
        mangxe = new XeMay[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin xe  may thu :" + (i + 1));
            mangxe[i] = new XeMay();
            mangxe[i].nhap(sc);
        }
    }

    public void hienthi() {
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin xe  may thu :" + (i + 1));
            mangxe[i].hienthi();
        }
    }

    public void Sort() {
        for (int i = 0; i < mangxe.length - 1; i++) {
            for (int j = i + 1; j < mangxe.length; j++) {
                if (mangxe[i].bienso.compareTo(mangxe[j].bienso) > 0) {
                    XeMay tmp = mangxe[i];
                    mangxe[i] = mangxe[j];
                    mangxe[j] = tmp;
                }
            }
        }
    }

    public void Search(String bienSo) {
        for (int i = 0; i < mangxe.length; i++) {
            if (mangxe[i].bienso.toUpperCase().contains(bienSo))
                mangxe[i].hienthi();
        }
    }
}
