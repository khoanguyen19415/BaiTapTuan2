/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.bt01;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ChuongTrinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("-------Nhap thong tin cho hinh chu nhat thu nhat-------");
        System.out.print("Chieu dai: ");
        double dai1 = sc.nextDouble();
        System.out.print("Chieu rong: ");
        double rong1 = sc.nextDouble();

        System.out.println("-------Nhap thong tin cho hinh chu nhat thu hai--------");
        System.out.print("Chieu dai: ");
        double dai2 = sc.nextDouble();
        System.out.print("Chieu rong: ");
        double rong2 = sc.nextDouble();

        
        System.out.println("---------Nhap thong tin cho hinh vuong--------");
        System.out.print("Canh: ");
        double canh = sc.nextDouble();

        
        ChuNhat cn1 = new ChuNhat(dai1, rong1);
        ChuNhat cn2 = new ChuNhat(dai2, rong2);
        ChuNhat vu = new Vuong(canh);

        
        System.out.println("\n----------Thong tin hinh chu nhat thu nhat-----------");
        cn1.xuat();

        System.out.println("\n----------Thong tin hinh chu nhat thu hai---------------");
        cn2.xuat();

        System.out.println("\n----------Thong tin hinh vuong------------");
        vu.xuat();
    }
}
