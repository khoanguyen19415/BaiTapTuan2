/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt2;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {

    public static void main(String[] args) {
        Account ac1 = new Account("Tk01", "nguyen Van A", 50000000);
        Account ac2 = new Account("Tk02", "nguyen Van B", 40000000);

        System.out.println("Thong tin tai khoan ban dau");
        System.out.println("My Account[id:" + ac1.getId() + ", name:" + ac1.getName() + ",balance: " + ac1.getBlance() + "]");
        System.out.println("My Friend Account[id:" + ac2.getId() + ", name:" + ac2.getName() + ",balance: " + ac2.getBlance() + "]");

        System.out.println("rut 20000000 tien tu tai khoan my account......");
        ac1.debit(20000000);

        System.out.println("nap 10000000 vao tai khoan MyFriend account.....");
        ac2.credit(10000000);
        System.out.println("chuyen khoan 30000000 tu tai khoan MyFriend account den MyAcount.....");
        ac2.tranferTo(ac1, 30000000);

        System.out.println("Thong tin tai khoan sau khi giao dich");
        System.out.println("My Account[id:" + ac1.getId() + ", name:" + ac1.getName() + ",balance: " + ac1.getBlance() + "]");
        System.out.println("My Friend Account[id:" + ac2.getId() + ", name:" + ac2.getName() + ",balance: " + ac2.getBlance() + "]");

    }
}
