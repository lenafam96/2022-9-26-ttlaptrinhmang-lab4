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
        System.out.printf("Nhap vao so luong xe may Hoa Binh: ");
        n = Integer.parseInt(sc.nextLine());
        mangxe = new XeMay[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n*Nhap thong tin xe may thu " + (i + 1));
            mangxe[i] = new XeMay();
            mangxe[i].nhap(sc);
        }
    }

    public void hienthi() {
        System.out.printf("+%-10s+%-20s+%-15s+%-15s+\n", "-".repeat(10), "-".repeat(
                20), "-".repeat(15), "-".repeat(15));
        System.out.printf("|%-10s|%-20s|%-15s|%-15s|\n", "Bien so", "Loai xe",
                "Mau xe", "Gia tien");
        System.out.printf("+%-10s+%-20s+%-15s+%-15s+\n", "-".repeat(10), "-".repeat(
                20), "-".repeat(15), "-".repeat(15));
        for (int i = 0; i < n; i++) {
            mangxe[i].hienthi();
        }
        System.out.printf("+%-10s+%-20s+%-15s+%-15s+\n", "-".repeat(10), "-".repeat(
                20), "-".repeat(15), "-".repeat(15));
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
        System.out.printf("+%-10s+%-20s+%-15s+%-15s+\n", "-".repeat(10), "-".repeat(
                20), "-".repeat(15), "-".repeat(15));
        System.out.printf("|%-10s|%-20s|%-15s|%-15s|\n", "Bien so", "Loai xe",
                "Mau xe", "Gia tien");
        System.out.printf("+%-10s+%-20s+%-15s+%-15s+\n", "-".repeat(10), "-".repeat(
                20), "-".repeat(15), "-".repeat(15));
        for (int i = 0; i < mangxe.length; i++) {
            if (mangxe[i].bienso.toUpperCase().contains(bienSo))
                mangxe[i].hienthi();
        }
        System.out.printf("+%-10s+%-20s+%-15s+%-15s+\n", "-".repeat(10), "-".repeat(
                20), "-".repeat(15), "-".repeat(15));
    }
}
