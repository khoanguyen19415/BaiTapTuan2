/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.bt03;

/**
 *
 * @author Administrator
 */
public class SinhVienIT extends SinhVien {
    public double diemJava;
    public double diemHtml;
    public double diemCss;

    public SinhVienIT(String hoTen, double diemJava, double diemHtml, double diemCss) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    @Override
    public double getDiem() {
        return (diemJava*2 + diemHtml + diemCss) / 4;
    }
}

