package bai4;

public abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        if (this.getDiem() >= 8)
            return "Gioi";
        else if (this.getDiem() > 7)
            return "Kha";
        else if (this.getDiem() >= 5)
            return "Trung Binh";
        else
            return "Yeu";
    }

    public void xuat() {
        System.out.printf("%-20s|%-20s|%-10.2f|%-10s\n", this.hoTen.toUpperCase(), this.nganh.toUpperCase(),
                this.getDiem(),
                this.getHocLuc().toUpperCase());
    }
}
