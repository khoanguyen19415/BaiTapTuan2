/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt2;

/**
 *
 * @author ADMIN
 */
public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int blance) {
        this.id = id;
        this.name = name;
        this.balance = blance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBlance() {
        return balance;
    }
    
    public void credit(int amount){
        if(amount>0)
            balance +=amount;
    }
    public void debit(int amount){
        if(balance>=amount){
            balance -=amount;
            System.out.println("giao dich thanh cong");
        }else{
            System.out.println("giao dich that bai.");
        }
    }
    public void tranferTo(Account other, int amount){
        if(balance>=amount){
            balance -=amount;
            other.balance +=amount;
            System.out.println("chuyen khoan thanh cong");
        }else{
            System.out.println("so tien thanh toan vuot so du.giao dinh that bai");
        }
    }
}
