/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author TrongHanh
 */
public class NhanVien {
  public String ten;
  public int tuoi;
  public String diaChi;
  public double luong;
  public int gioLam;

  public NhanVien() {
    ten = "";
    tuoi = 0;
    diaChi = "";
    luong = 0;
    gioLam = 0;
  }


  public String getThongTin() {
    return  ten + " "+ tuoi + diaChi + ", " + luong + ", " + gioLam;
  }

  public double tinhThuong() {
    if (gioLam >= 200) return luong * 0.2;
    else if (gioLam >= 100) return luong * 0.1;
    return 0;
  }
}
