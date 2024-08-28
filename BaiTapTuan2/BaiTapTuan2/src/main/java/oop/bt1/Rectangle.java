/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt1;

/**
 *
 * @author ADMIN
 */
public class Rectangle {
    //khai báo dữ liệu
    private double length;
    private double width;
    //định nghĩa các phương thức
    public Rectangle(){
        
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double findArea(){
        return length * width;
    }
    public double findPerimeter(){
        return (length + width)*2;
    }
}
