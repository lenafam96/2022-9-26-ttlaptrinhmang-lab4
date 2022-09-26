package bai2;

import java.util.Scanner;

public class StudentUneti implements Imark {
    private String stuId;
    private String stuName;
    private String gender;
    private String birthday;
    private String nativePlace;

    public StudentUneti() {

    }

    public StudentUneti(String stuId, String stuName, String gender, String birthday, String nativePlace) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.gender = gender;
        this.birthday = birthday;
        this.nativePlace = nativePlace;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    @Override
    public void input(Scanner sc) {
        System.out.printf("Nhap ma sinh vien: ");
        this.stuId = sc.nextLine();
        System.out.printf("Nhap ten sinh vien: ");
        this.stuName = sc.nextLine();
        System.out.printf("Nhap gioi tinh: ");
        this.gender = sc.nextLine();
        System.out.printf("Nhap ngay sinh: ");
        this.birthday = sc.nextLine();
        System.out.printf("Nhap que quan: ");
        this.nativePlace = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.printf("|%-10s|%-30s|%-10s|%-10s|%-20s|\n", this.getStuId().toUpperCase(),
                this.getStuName().toUpperCase(), this.getGender().toUpperCase(), this.getBirthday(),
                this.getNativePlace().toUpperCase());
    }
}
