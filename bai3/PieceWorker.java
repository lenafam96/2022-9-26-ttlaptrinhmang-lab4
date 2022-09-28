package bai3;

import java.util.Scanner;

public class PieceWorker extends Employee {
    private int soLuongSanPham;

    @Override
    public float earnings() {
        return this.soLuongSanPham * 0.5f;
    }

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.printf("Nhap so luong san pham lam duoc: ");
        this.soLuongSanPham = Integer.parseInt(sc.nextLine());
    }
}
