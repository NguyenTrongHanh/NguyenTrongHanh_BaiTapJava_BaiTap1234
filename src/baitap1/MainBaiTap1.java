/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.Scanner;

/**
 *
 * @author TrongHanh
 */
public class MainBaiTap1 {
    public static void main(String[] args) {
    Scanner nhap = new Scanner(System.in);
    NhanVien nhanVien1 = new NhanVien();
    System.out.println("Ten nhan vien: ");
    nhanVien1.ten = nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    nhanVien1.tuoi = nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    nhanVien1.diaChi = nhap.nextLine();
    System.out.println("luong nhan vien: ");
    nhanVien1.luong = nhap.nextDouble();
    System.out.println("gio lam nhan vien: ");
    nhanVien1.gioLam = nhap.nextInt();
    nhap.nextLine();
    
    NhanVien nhanVien2 = new NhanVien();
    System.out.println("Ten nhan vien: ");
    nhanVien2.ten = nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    nhanVien2.tuoi = nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    nhanVien2.diaChi = nhap.nextLine();
    System.out.println("luong nhan vien: ");
    nhanVien2.luong = nhap.nextDouble();
    System.out.println("gio lam nhan vien: ");
    nhanVien2.gioLam = nhap.nextInt();
    
    System.out.println(nhanVien1.getThongTin());
    System.out.println(nhanVien2.getThongTin());
    }
}
