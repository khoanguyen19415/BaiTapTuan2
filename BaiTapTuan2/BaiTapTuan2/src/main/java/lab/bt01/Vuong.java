/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.bt01;

/**
 *
 * @author Administrator
 */
public class Vuong extends ChuNhat {

    public Vuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("Canh: " + getDai()); 
        System.out.println("Chu vi: " + getChuVi());
        System.out.println("Dien tich: " + getDienTich());
    }
}

