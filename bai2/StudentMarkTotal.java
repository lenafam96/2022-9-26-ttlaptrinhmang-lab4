package bai2;

import java.util.Scanner;

public class StudentMarkTotal extends StudentMark {
    private int totalExamSubject;
    private float everageMark;

    public StudentMarkTotal() {

    }

    public StudentMarkTotal(String stuId, String className, String subjectName, int semester, float mark,
            int totalExamSubject, float everageMark) {
        super(stuId, className, subjectName, semester, mark);
        this.totalExamSubject = totalExamSubject;
        this.everageMark = everageMark;
    }

    public int getTotalExamSubject() {
        return totalExamSubject;
    }

    public void setTotalExamSubject(int totalExamSubject) {
        this.totalExamSubject = totalExamSubject;
    }

    public float getEverageMark() {
        return everageMark;
    }

    public void setEverageMark(float everageMark) {
        this.everageMark = everageMark;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.printf("Nhap tong so mon hoc: ");
        this.totalExamSubject = Integer.parseInt(sc.nextLine());
        System.out.printf("Nhap diem trung binh: ");
        this.everageMark = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%-10s|%-10s|\n", this.getTotalExamSubject(), this.getEverageMark());
    }

    public static void getTotalExamSubject(StudentMarkTotal[] list) {
        int sum = 0;
        for (StudentMarkTotal item : list) {
            sum += item.getTotalExamSubject();
        }
        System.out.println("Tong so mon thi la " + sum + " mon");
    }

    public static void calculateEverageMark(StudentMarkTotal[] list) {
        int sumSub = 0;
        float sumEve = 0;
        for (StudentMarkTotal item : list) {
            sumSub += item.getTotalExamSubject();
            sumEve += item.getEverageMark() * item.getTotalExamSubject();
        }
        System.out.println("Diem trung binh cac mon thi la " + sumEve / sumSub);
    }
}
