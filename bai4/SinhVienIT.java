package bai4;

public class SinhVienIT extends SinhVienPoly {
    private double java, html, css;

    public SinhVienIT(String hoTen, String nganh, double java, double html, double css) {
        super(hoTen, nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    @Override
    public double getDiem() {
        return (this.java * 2 + this.html + this.css) / 4;
    }
}
