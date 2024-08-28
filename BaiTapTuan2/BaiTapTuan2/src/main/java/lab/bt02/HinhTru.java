/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.bt02;

/**
 *
 * @author Administrator
 */
public class HinhTru extends HinhTron {
    private double chieucao;

    
    public HinhTru() {
        super();
        this.chieucao = 0;
    }

    
    public HinhTru(double bankinh, double chieucao) {
        super(bankinh);
        this.chieucao = chieucao;
    }

    
    public void setChieuCao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double getChieuCao() {
        return chieucao;
    }

    
    public double tinhTheTich() {
        return tinhDienTich() * chieucao;
    }

    
    @Override
    public double tinhDienTich() {
        return 2 * Math.PI * getBanKinh() * (getBanKinh() + chieucao);
    }
}

