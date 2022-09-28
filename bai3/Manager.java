package bai3;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[3];
        e[0] = new Boss();
        e[1] = new PieceWorker();
        e[2] = new CommissionWorker();
        for (Employee employee : e) {
            System.out.println("\nNhap thong tin cho " + employee.getClass().getName().substring(5,
                    employee.getClass().getName().length()) + ":");
            employee.nhap(sc);
        }
        System.out.println("\n\n===Thong tin bang luong===");
        for (Employee employee : e) {
            employee.hienthi();
        }
    }
}
