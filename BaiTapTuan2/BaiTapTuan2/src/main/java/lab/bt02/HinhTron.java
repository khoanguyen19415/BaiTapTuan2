/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.bt02;

/**
 *
 * @author Administrator
 */
public class HinhTron {
    private double bankinh;

    
    public HinhTron() {
        this.bankinh = 0;
    }

    
    public HinhTron(double bankinh) {
        this.bankinh = bankinh;
    }

    
    public void setBanKinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getBanKinh() {
        return bankinh;
    }

    
    public double tinhDienTich() {
        return Math.PI * bankinh * bankinh;
    }

    
    public double tinhChuVi() {
        return 2 * Math.PI * bankinh;
    }
}

