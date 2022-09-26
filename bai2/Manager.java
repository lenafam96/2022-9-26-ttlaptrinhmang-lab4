package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentUneti> listStudent = new ArrayList<StudentUneti>();
        ArrayList<StudentMarkTotal> listMark = new ArrayList<StudentMarkTotal>();
        int chose = 0, n = 0;
        while (true) {
            System.out.println(
                    "\n\n\n\t===Menu===\n1.Nhap thong tin n sinh vien Uneti\n2.Nhap thong tin m diem thi\n3.Sap xep sinh vien theo ten\n4.Tim thong tin diem thi theo id cua sinh vien\n5.Thoat\n");

            System.out.printf("Nhap lua chon: ");
            chose = Integer.parseInt(sc.nextLine());
            switch (chose) {
                case 1:
                    System.out.printf("Nhap so luong sinh vien Uneti: ");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n*Nhap thong tin sinh vien thu " + (i + 1));
                        StudentUneti studentUneti = new StudentUneti();
                        studentUneti.input(sc);
                        listStudent.add(studentUneti);
                    }
                    break;
                case 2:
                    System.out.printf("Nhap so luong diem: ");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n*Nhap thong tin diem thu " + (i + 1));
                        StudentMarkTotal mark = new StudentMarkTotal();
                        mark.input(sc);
                        listMark.add(mark);
                    }
                    break;
                case 3:
                    System.out.println("\n\n\t\t\t=== Danh sach sinh vien theo ten ====\n\n");
                    Collections.sort(listStudent, new Comparator<StudentUneti>() {
                        @Override
                        public int compare(StudentUneti s1, StudentUneti s2) {
                            return s1.getStuName().compareToIgnoreCase(s2.getStuName());
                        }
                    });
                    System.out.printf("+%-10s+%-30s+%-10s+%-10s+%-20s+\n", "-".repeat(10), "-".repeat(
                            30), "-".repeat(10), "-".repeat(10), "-".repeat(20));
                    System.out.printf("|%-10s|%-30s|%-10s|%-10s|%-20s|\n", "Ma SV", "Ho ten",
                            "Gioi tinh", "Sinh nhat", "Que quan");
                    System.out.printf("+%-10s+%-30s+%-10s+%-10s+%-20s+\n", "-".repeat(10), "-".repeat(
                            30), "-".repeat(10), "-".repeat(10), "-".repeat(20));
                    for (StudentUneti item : listStudent) {
                        item.display();
                    }
                    System.out.printf("+%-10s+%-30s+%-10s+%-10s+%-20s+\n", "-".repeat(10), "-".repeat(
                            30), "-".repeat(10), "-".repeat(10), "-".repeat(20));
                    break;
                case 4:
                    System.out.printf("Nhap id sinh vien can tim: ");
                    String id = sc.nextLine();
                    System.out.println("\n\n\t\t\t\t=== Danh sach diem cua sinh vien " + id + " ====\n\n");
                    System.out.printf("+%-10s+%-15s+%-25s+%-10s+%-10s+%-10s+%-10s+\n", "-".repeat(10), "-".repeat(
                            15), "-".repeat(25), "-".repeat(10), "-".repeat(10), "-".repeat(10), "-".repeat(10));
                    System.out.printf("|%-10s|%-15s|%-25s|%-10s|%-10s|%-10s|%-10s|\n", "Ma SV", "Ten lop",
                            "Ten mon hoc", "Hoc ky", "Diem", "Tong SM", "DiemTB");
                    System.out.printf("+%-10s+%-15s+%-25s+%-10s+%-10s+%-10s+%-10s+\n", "-".repeat(10), "-".repeat(
                            15), "-".repeat(25), "-".repeat(10), "-".repeat(10), "-".repeat(10), "-".repeat(10));
                    for (StudentMarkTotal item : listMark) {
                        if (item.getStuId().toLowerCase().contains(id.toLowerCase()))
                            item.display();
                    }
                    System.out.printf("+%-10s+%-15s+%-25s+%-10s+%-10s+%-10s+%-10s+\n", "-".repeat(10), "-".repeat(
                            15), "-".repeat(25), "-".repeat(10), "-".repeat(10), "-".repeat(10), "-".repeat(10));
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    break;
            }
        }
    }
}