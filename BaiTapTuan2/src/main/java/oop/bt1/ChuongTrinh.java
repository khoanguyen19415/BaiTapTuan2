/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //khai báo 2 đối tượng r1.r2 kiểu lớp rectangle
        Rectangle r1, r2;
        //tạo đối tượng r1
        System.out.println("tao doi tuong r1....");
        r1 = new Rectangle();
        //tạo đối tượng r2
        System.out.println("tao doi tuong r2....");
        System.out.print("cho biet dai:");
        double dai = sc.nextDouble();
        System.out.print("cho biet rong:");
        double rong = sc.nextDouble();
        r2 = new Rectangle(dai, rong);

        System.out.println("thong tin ket qua");
        System.out.println("HCN thu 1: dai: " + r1.getLength() + "-rong: " + r1.getWidth() + "-dien tich:" + r1.findArea() + "-chu vi:" + r1.findPerimeter());
        System.out.println("HCN thu 2: dai: " + r2.getLength() + "-rong: " + r2.getWidth() + "-dien tich:" + r2.findArea() + "-chu vi:" + r2.findPerimeter());

    }
}
