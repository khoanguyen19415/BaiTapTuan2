/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.bt02;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ChuongTrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Nhap ban kinh cua hinh tron: ");
        double bankinh = sc.nextDouble();

        
        HinhTron hinhTron = new HinhTron(bankinh);

        
        System.out.print("Nhap chieu cao cua hinh tru: ");
        double chieucao = sc.nextDouble();

        
        HinhTru hinhTru = new HinhTru(bankinh, chieucao);

        
        System.out.println("\n---------Thong tin hinh tron--------");
        System.out.println("Ban kinh: " + hinhTron.getBanKinh());
        System.out.println("Chu vi: " + hinhTron.tinhChuVi());
        System.out.println("Dien tich: " + hinhTron.tinhDienTich());

        
        System.out.println("\n---------Thong tin hinh tru----------");
        System.out.println("Ban kinh: " + hinhTru.getBanKinh());
        System.out.println("Chieu cao: " + hinhTru.getChieuCao());
        System.out.println("Dien tich be mat: " + hinhTru.tinhDienTich());
        System.out.println("The tich: " + hinhTru.tinhTheTich());
    }
}
