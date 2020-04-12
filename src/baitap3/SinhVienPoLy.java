/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author TrongHanh
 */
public abstract class SinhVienPoLy {
    public String hoTen;
    public String nganhHoc;
    public SinhVienPoLy(String ht, String nh) {
      hoTen = ht;
      nganhHoc = nh; 
    }
    public abstract double getDiem();
    public String getHocLuc() {
      if (getDiem() < 5) {
        return "Yeu";
      }
      if (getDiem() < 6.5) {
        return "TB";
      }
      if (getDiem() < 7.5) {
        return "Kha";
      }
      if (getDiem() < 9) {
        return "Gioi";
      }
      return "Xuat sac";
    }
     public void xuat() {
       System.out.println(hoTen + ", : " + nganhHoc);
     }
}
