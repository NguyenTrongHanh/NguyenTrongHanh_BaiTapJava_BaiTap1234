/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;
import baitap1.NhanVien;
import java.util.Scanner;
/**
 *
 * @author TrongHanh
 */
public class MainBaiTap2 {
    public static void main(String[] args){
    IQuanLy qlNhanVien = new QuanLyNhanVien();
    Scanner nhap = new Scanner(System.in);

    NhanVien nv1 = new NhanVien();
    System.out.println("Ten nhan vien: ");
    nv1.ten = nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    nv1.tuoi = nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    nv1.diaChi = nhap.nextLine();
    System.out.println("luong nhan vien: ");
    nv1.luong = nhap.nextDouble();
    System.out.println("gio lam nhan vien: ");
    nv1.gioLam = nhap.nextInt();
    nhap.nextLine();

    // create nhan vien
    NhanVien nv2 = new NhanVien();
    System.out.println("Ten nhan vien: ");
    nv2.ten = nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    nv2.tuoi = nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    nv2.diaChi = nhap.nextLine();
    System.out.println("luong nhan vien: ");
    nv2.luong = nhap.nextDouble();
    System.out.println("gio lam nhan vien: ");
    nv2.gioLam = nhap.nextInt();
    nhap.nextLine();
    
    // create nhan vien
    NhanVien nv3 = new NhanVien();
    System.out.println("Ten nhan vien: ");
    nv3.ten = nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    nv3.tuoi = nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    nv3.diaChi = nhap.nextLine();
    System.out.println("luong nhan vien: ");
    nv3.luong = nhap.nextDouble();
    System.out.println("gio lam nhan vien: ");
    nv3.gioLam = nhap.nextInt();
    nhap.nextLine();

    // create nhan vien
    NhanVien nv4 = new NhanVien();
    System.out.println("Ten nhan vien: ");
    nv4.ten = nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    nv4.tuoi = nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    nv4.diaChi = nhap.nextLine();
    System.out.println("luong nhan vien: ");
    nv4.luong = nhap.nextDouble();
    System.out.println("gio lam nhan vien: ");
    nv4.gioLam = nhap.nextInt();
    nhap.nextLine();

    // create nhan vien
    NhanVien nv5 = new NhanVien();
    System.out.println("Ten nhan vien: ");
    nv5.ten = nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    nv5.tuoi = nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    nv5.diaChi = nhap.nextLine();
    System.out.println("luong nhan vien: ");
    nv5.luong = nhap.nextDouble();
    System.out.println("gio lam nhan vien: ");
    nv5.gioLam = nhap.nextInt();
    nhap.nextLine();

    qlNhanVien.them(nv1);
    qlNhanVien.them(nv2);
    qlNhanVien.them(nv3);
    qlNhanVien.them(nv4);
    qlNhanVien.them(nv5);
    qlNhanVien.inDS();
    }
}
