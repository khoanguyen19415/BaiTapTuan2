/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt3;

/**
 *
 * @author Administrator
 */
public class SanPham {
    private String ten;
    private double gia;

    // Phương thức khởi tạo
    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    // Getter và Setter cho thuộc tính 'ten'
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    // Getter và Setter cho thuộc tính 'gia'
    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    // Phương thức để in thông tin sản phẩm
    @Override
    public String toString() {
        return "Ten: " + ten + ", Gia: " + gia;
    }
}
