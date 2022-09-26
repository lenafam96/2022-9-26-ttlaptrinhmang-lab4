package bai1;

import java.util.Scanner;

public class XeMay implements IXe {
    String bienso;
    String loaixe;
    String mauxe;
    float giatien;

    public XeMay() {
    }

    public XeMay(String bienso, String loaixe, String mauxe, float giatien) {
        this.bienso = bienso;
        this.loaixe = loaixe;
        this.mauxe = mauxe;
        this.giatien = giatien;
    }

    @Override
    public void nhap(Scanner sc) {
        System.out.printf("Nhap bien so xe: ");
        this.bienso = sc.nextLine();
        System.out.printf("Nhap loai xe: ");
        this.loaixe = sc.nextLine();
        System.out.printf("Nhap mau xe: ");
        this.mauxe = sc.nextLine();
        System.out.printf("Nhap gia xe: ");
        this.giatien = Float.parseFloat(sc.nextLine());

    }

    @Override
    public void hienthi() {
        System.out.println("Bien so xe: " + this.bienso);
        System.out.println("Loai xe: " + this.loaixe);
        System.out.println("Mau xe: " + this.mauxe);
        System.out.println("Gia xe: " + this.giatien);
    }
}

    