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
}
