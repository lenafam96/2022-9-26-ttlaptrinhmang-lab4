package bai2;

import java.util.Scanner;

public class StudentMark implements Imark {
    private String stuId;
    private String className;
    private String subjectName;
    private int semester;
    private float mark;

    public StudentMark() {

    }

    public StudentMark(String stuId, String className, String subjectName, int semester, float mark) {
        this.stuId = stuId;
        this.className = className;
        this.subjectName = subjectName;
        this.semester = semester;
        this.mark = mark;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public void input(Scanner sc) {
        System.out.printf("Nhap ma sinh vien: ");
        this.stuId = sc.nextLine();
        System.out.printf("Nhap ten lop: ");
        this.className = sc.nextLine();
        System.out.printf("Nhap ten mon hoc: ");
        this.subjectName = sc.nextLine();
        System.out.printf("Nhap hoc ky: ");
        this.semester = Integer.parseInt(sc.nextLine());
        System.out.printf("Nhap diem: ");
        this.mark = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void display() {
        System.out.printf("|%-10s|%-15s|%-25s|%-10s|%-10s|", this.getStuId().toUpperCase(),
                this.getClassName().toUpperCase(), this.getSubjectName().toUpperCase(), this.getSemester(),
                this.getMark());
    }
}
