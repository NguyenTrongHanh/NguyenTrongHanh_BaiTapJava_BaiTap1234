/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.Scanner;

/**
 *
 * @author TrongHanh
 */
public class MainBaiTap4 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        
        QuanLyChuyenXe qlChuyenXe = new QuanLyChuyenXe();
        
        XeNoiThanh xeNT1 = new XeNoiThanh();
        System.out.println("Mã Chuyến: ");
        xeNT1.maChuyen = nhap.nextInt();
        nhap.nextLine();
        System.out.println("Tên Tài Xế: ");
        xeNT1.taiXe = nhap.nextLine();
        System.out.println("Số Xe: ");
        xeNT1.soXe = nhap.nextLine();
        System.out.println("Doanh Thu: ");
        xeNT1.doanhThu = nhap.nextDouble();
        nhap.nextLine();
        System.out.println("Số Tuyến: ");
        xeNT1.soTuyen = nhap.nextLine();
        System.out.println("Số Km: ");
        xeNT1.soKm = nhap.nextDouble();
        nhap.nextLine();
        qlChuyenXe.themChuyenXe(xeNT1);
        
        XeNoiThanh xeNT2 = new XeNoiThanh();
        System.out.println("Mã Chuyến: ");
        xeNT2.maChuyen = nhap.nextInt();
        nhap.nextLine();
        System.out.println("Tên Tài Xế: ");
        xeNT2.taiXe = nhap.nextLine();
        System.out.println("Số Xe: ");
        xeNT2.soXe = nhap.nextLine();
        System.out.println("Doanh Thu: ");
        xeNT2.doanhThu = nhap.nextDouble();
        nhap.nextLine();
        System.out.println("Số Tuyến: ");
        xeNT2.soTuyen = nhap.nextLine();
        System.out.println("Số Km: ");
        xeNT2.soKm = nhap.nextDouble();
        nhap.nextLine();
        qlChuyenXe.themChuyenXe(xeNT2);
        
        XeNoiThanh xeNT3 = new XeNoiThanh();
        System.out.println("Mã Chuyến: ");
        xeNT3.maChuyen = nhap.nextInt();
        nhap.nextLine();
        System.out.println("Tên Tài Xế: ");
        xeNT3.taiXe = nhap.nextLine();
        System.out.println("Số Xe: ");
        xeNT3.soXe = nhap.nextLine();
        System.out.println("Doanh Thu: ");
        xeNT3.doanhThu = nhap.nextDouble();
        nhap.nextLine();
        System.out.println("Số Tuyến: ");
        xeNT3.soTuyen = nhap.nextLine();
        System.out.println("Số Km: ");
        xeNT3.soKm = nhap.nextDouble();
        nhap.nextLine();
        qlChuyenXe.themChuyenXe(xeNT3);
        
        XeNgoaiThanh xeNgT1 = new XeNgoaiThanh();
        System.out.println("Mã Chuyến: ");
        xeNgT1.maChuyen = nhap.nextInt();
        nhap.nextLine();
        System.out.println("Tên Tài Xế: ");
        xeNgT1.taiXe = nhap.nextLine();
        System.out.println("Số Xe: ");
        xeNgT1.soXe = nhap.nextLine();
        System.out.println("Doanh Thu: ");
        xeNgT1.doanhThu = nhap.nextDouble();
        nhap.nextLine();
        System.out.println("Nơi đến: ");
        xeNgT1.noiDen = nhap.nextLine();
        System.out.println("Số ngày: ");
        xeNgT1.soNgay = nhap.nextInt();
        nhap.nextLine();
        qlChuyenXe.themChuyenXe(xeNgT1);
        
        XeNgoaiThanh xeNgT2 = new XeNgoaiThanh();
        System.out.println("Mã Chuyến: ");
        xeNgT2.maChuyen = nhap.nextInt();
        nhap.nextLine();
        System.out.println("Tên Tài Xế: ");
        xeNgT2.taiXe = nhap.nextLine();
        System.out.println("Số Xe: ");
        xeNgT2.soXe = nhap.nextLine();
        System.out.println("Doanh Thu: ");
        xeNgT2.doanhThu = nhap.nextDouble();
        nhap.nextLine();
        System.out.println("Nơi đến: ");
        xeNgT2.noiDen = nhap.nextLine();
        System.out.println("Số ngày: ");
        xeNgT2.soNgay = nhap.nextInt();
        nhap.nextLine();
        qlChuyenXe.themChuyenXe(xeNgT2);
        
        XeNgoaiThanh xeNgT3 = new XeNgoaiThanh();
        System.out.println("Mã Chuyến: ");
        xeNgT3.maChuyen = nhap.nextInt();
        nhap.nextLine();
        System.out.println("Tên Tài Xế: ");
        xeNgT3.taiXe = nhap.nextLine();
        System.out.println("Số Xe: ");
        xeNgT3.soXe = nhap.nextLine();
        System.out.println("Doanh Thu: ");
        xeNgT3.doanhThu = nhap.nextDouble();
        nhap.nextLine();
        System.out.println("Nơi đến: ");
        xeNgT3.noiDen = nhap.nextLine();
        System.out.println("Số ngày: ");
        xeNgT3.soNgay = nhap.nextInt();
        nhap.nextLine();
        qlChuyenXe.themChuyenXe(xeNgT3);

        qlChuyenXe.inThongTin();
        System.out.println("Tong doanh thu xe noi thanh: " + qlChuyenXe.tongDoanhThuNoiThanh());
        System.out.println("Tong doanh thu xe ngoai thanh: " + qlChuyenXe.tongDoanhThuNgoaiThanh());
        System.out.println("Tong doanh thu: " + qlChuyenXe.tongDoanhThu());
    }
}
