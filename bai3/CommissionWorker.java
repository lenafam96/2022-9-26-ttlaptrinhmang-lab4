package bai3;

import java.util.Scanner;

public class CommissionWorker extends Employee {
    private int soLuongSanPham;

    @Override
    public float earnings() {
        return this.soLuongSanPham * 0.1f + 1500;
    }

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.printf("Nhap so luong san pham ban duoc: ");
        this.soLuongSanPham = Integer.parseInt(sc.nextLine());
    }
}
