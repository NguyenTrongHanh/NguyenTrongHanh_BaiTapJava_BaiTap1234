/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.Scanner;

/**
 *
 * @author TrongHanh
 */
public class MainBaiTap3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        
        System.out.println("Ten sinh vien: ");
        String ten = nhap.nextLine();
        System.out.println("Ngành học: ");
        String nganhHoc = nhap.nextLine();
        System.out.println("Điểm Java: ");
        double diemJava = nhap.nextDouble();
        System.out.println("Điểm Css: ");
        double diemCSS = nhap.nextDouble();
        System.out.println("Điểm HTML: ");
        double diemHtml = nhap.nextDouble();
        nhap.nextLine();
        SinhVienIT sinhVienIT = new SinhVienIT(ten, nganhHoc, diemJava, diemCSS, diemHtml);
        
        System.out.println("Ten sinh vien: ");
        ten = nhap.nextLine();
        System.out.println("Ngành học: ");
        nganhHoc = nhap.nextLine();
        System.out.println("Điểm Java: ");
        double diemMar = nhap.nextDouble();
        System.out.println("Điểm Css: ");
        double diemSale = nhap.nextDouble();
        nhap.nextLine();
        SinhVienBiz sinhVienBiz = new SinhVienBiz(ten, nganhHoc, diemMar, diemSale);
        
        System.out.println("Ten sinh vien: ");
        ten = nhap.nextLine();
        System.out.println("Ngành học: ");
        nganhHoc = nhap.nextLine();
        System.out.println("Điểm Java: ");
        diemJava = nhap.nextDouble();
        System.out.println("Điểm Css: ");
        diemCSS = nhap.nextDouble();
        System.out.println("Điểm HTML: ");
        diemHtml = nhap.nextDouble();
        nhap.nextLine();
        SinhVienPoLy sinhVIenPoly = new SinhVienIT(ten, nganhHoc, diemJava, diemCSS, diemHtml);
        
        sinhVienIT.xuat();
        System.out.println("diem: " + sinhVienIT.getDiem());
        System.out.println("hoc luc: " + sinhVienIT.getHocLuc());        
        sinhVienBiz.xuat();
        System.out.println("diem: " + sinhVienBiz.getDiem());
        System.out.println("hoc luc: " + sinhVienBiz.getHocLuc());      
        sinhVIenPoly.xuat();
        System.out.println("diem: " + sinhVIenPoly.getDiem());
        System.out.println("hoc luc: " + sinhVIenPoly.getHocLuc());
    }
}
