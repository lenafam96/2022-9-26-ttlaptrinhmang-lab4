package bai3;

import java.util.Scanner;

public abstract class Employee {
    private String name;

    public abstract float earnings();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void nhap(Scanner sc) {
        System.out.printf("Nhap vao ten: ");
        this.name = sc.nextLine();
    }

    public void hienthi() {
        System.out.printf("%s luong %.2f\n", this.getName().toUpperCase(), this.earnings());
    }
}
