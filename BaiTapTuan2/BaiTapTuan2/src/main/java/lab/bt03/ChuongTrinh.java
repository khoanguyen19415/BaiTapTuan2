/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.bt03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ChuongTrinh {
    static ArrayList<SinhVien> ds = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  chon = 5;
        do {
            menu();
            chon = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng mới

            switch (chon) {
                case 1:
                    nhapDS();
                    break;
                case 2:
                    xuatDS();
                    break;
                case 3:
                    xuatSinhVienGioi();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    System.out.println("GoodBye! see you");
                    break;
            }
        } while (chon != 5);
    }

    private static void menu() {
        System.out.println("======= QUAN LY SINH VIEN ======");
        System.out.println("1. Nhap danh sach sinh vien");
        System.out.println("2. Xuat thong tin danh sach sinh vien");
        System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
        System.out.println("4. Sap xep danh sach sinh vien theo diem");
        System.out.println("5. Ket thuc");
        System.out.print("ban chon(1->5): ");
    }

    private static void nhapDS() {
        SinhVien sv=null;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("---------Thuc hien nhap ds sinh vien------------");
        System.out.print("cho biet loai sinh vien(IT:1, Biz:2): ");
        int chon = 0;        
        chon = sc1.nextInt();
        if(chon==1){
            System.out.print("Ho ten: ");
            String hoten = sc2.nextLine();
            System.out.print("Diem java: ");
            double java = sc1.nextDouble();
            System.out.print("Diem css: ");
            double css = sc1.nextDouble();
             System.out.print("Diem html: ");
            double html = sc1.nextDouble();
            
            sv = new SinhVienIT(hoten, java, html, css);
        } else if(chon == 2){
            System.out.print("Ho ten: ");
            String hoten = sc2.nextLine();
            System.out.print("Diem marketing: ");
            double marketing = sc1.nextDouble();
            System.out.print("Diem sales: ");
            double sales = sc1.nextDouble();
            
            sv = new SinhVienBiz(hoten, marketing, sales);
        }
        if(sv!=null){
            ds.add(sv);
        }
    }

    private static void xuatDS() {
        System.out.println("=== DANH SACH SINH VIEN ===");
        for (SinhVien sv : ds) {
            sv.xuat();
            System.out.println("-------------------------");
        }
    }

    private static void xuatSinhVienGioi() {
        System.out.println("=== DANH SACH SINH VIEN GIOI ===");
        for (SinhVien sv : ds) {
            if (sv.getDiem() <9 && sv.getDiem() >=7.5) {
                sv.xuat();
                System.out.println("-------------------------");
            }
        }
    }

    private static void sapXep() {
        Comparator<SinhVien> cmp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getDiem(), sv1.getDiem());

            }
        };  
        Collections.sort(ds,cmp);
        xuatDS();
    }
}
