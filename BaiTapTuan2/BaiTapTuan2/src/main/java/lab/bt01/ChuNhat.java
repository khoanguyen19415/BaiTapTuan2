/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.bt01;

/**
 *
 * @author Administrator
 */
public class ChuNhat {
    private double rong;
    private double dai;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getChuVi() {
        return 2 * (dai + rong);
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("Chieu dai: " + dai);
        System.out.println("Chieu rong: " + rong);
        System.out.println("Chu vi: " + getChuVi());
        System.out.println("Dien tich: " + getDienTich());
    }
}
