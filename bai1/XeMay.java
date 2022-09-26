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

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
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
        System.out.printf("|%-10s|%-20s|%-15s|%15.2f|\n", this.getBienso().toUpperCase(),
                this.getLoaixe().toUpperCase(),
                this.getMauxe().toUpperCase(), this.getGiatien());
    }
}
