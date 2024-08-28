/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.bt03;

/**
 *
 * @author Administrator
 */
public abstract class SinhVien {
    public String hoTen;
    public String nganh;

    public SinhVien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    // Phương thức trừu tượng getDiem()
    public abstract double getDiem();

    // Phương thức getHocLuc() để xếp loại học lực
    public String getHocLuc() {
        String kq = "";
        double dtb = getDiem();
        if (dtb < 5) {
            kq = "Yeu";
        } else if (dtb < 6.5) {
            kq = "Trung binh";
        } else if (dtb < 7.5) {
            kq = "Kha";
        } else if (dtb < 9) {
            kq = "Gioi";
        } else {
            kq = "Xuat sac";
        }
        return kq;
    }

    // Phương thức xuat() để xuất thông tin
    public void xuat() {
        System.out.println("SinhVien[Hoten:" + hoTen + ", nganh:" + nganh +
                ", DTB: " + getDiem() + ", Hoc luc:" + getHocLuc());
    }
}


