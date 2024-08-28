/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ChuongTrinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        boolean tiepTuc = true;

        while (tiepTuc) {
            // Hiển thị menu cho người dùng
            System.out.println("============Menu===========");
            System.out.println("1.Nhap danh sach san pham tu ban phim");
            System.out.println("2.Sap xep giam dan theo gia va xuat ra man hinh");
            System.out.println("3.Tim va xoa san pham theo ten");
            System.out.println("4.Xuat gia trung binh cua cac san pham");
            System.out.println("5.Thoat");
            System.out.print("Chon mot tuy chon (1-5): ");
            int luaChon = sc.nextInt();
            sc.nextLine(); // Đọc ký tự xuống dòng

            switch (luaChon) {
                case 1:
                    // Nhập danh sách sản phẩm
                    danhSachSanPham.clear(); // Xóa danh sách cũ
                    System.out.print("Nhap so luong san pham: ");
                    int soLuong = sc.nextInt();
                    sc.nextLine(); // Đọc ký tự xuống dòng
                    for (int i = 0; i < soLuong; i++) {
                        System.out.print("Nhap ten san pham " + (i + 1) + ": ");
                        String ten = sc.nextLine();
                        System.out.print("Nhap gia san pham " + (i + 1) + ": ");
                        double gia = sc.nextDouble();
                        sc.nextLine(); // Đọc ký tự xuống dòng
                        danhSachSanPham.add(new SanPham(ten, gia));
                    }
                    break;

                case 2:
                    // Sắp xếp giảm dần theo giá và xuất ra màn hình
                    Collections.sort(danhSachSanPham, (sp1, sp2) -> Double.compare(sp2.getGia(), sp1.getGia()));
                    System.out.println("Danh sach san pham sau khi sap xep theo gia giam dan:");
                    for (SanPham sp : danhSachSanPham) {
                        System.out.println(sp);
                    }
                    break;

                case 3:
                    // Tìm và xóa sản phẩm theo tên
                    System.out.print("Nhap ten san pham can xoa: ");
                    String tenXoa = sc.nextLine();
                    boolean xoaThanhCong = danhSachSanPham.removeIf(sp -> sp.getTen().equalsIgnoreCase(tenXoa));
                    if (xoaThanhCong) {
                        System.out.println("San pham da duoc xoa.");
                    } else {
                        System.out.println("Khong tim thay san pham voi ten: " + tenXoa);
                    }
                    break;

                case 4:
                    // Xuất giá trung bình của các sản phẩm
                    if (danhSachSanPham.isEmpty()) {
                        System.out.println("Danh sach san pham rong.");
                    } else {
                        double tongGia = 0;
                        for (SanPham sp : danhSachSanPham) {
                            tongGia += sp.getGia();
                        }
                        double giaTrungBinh = tongGia / danhSachSanPham.size();
                        System.out.printf("Gia trung binh cua cac san pham: %.2f\n", giaTrungBinh);
                    }
                    break;

                case 5:
                    // Thoát
                    tiepTuc = false;
                    System.out.println("Tam biet!");
                    break;

                default:
                    System.out.println("Tuy chon khong hop le. Vui long chon lai.");
                    break;
            }
        }
    }
}
