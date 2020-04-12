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
public class SinhVienBiz extends SinhVienPoLy{
    public double diemMarketing;
    public double diemSales;
    public SinhVienBiz(String ht, String nh, double mar, double sal) {
      super(ht, nh);
      diemMarketing = mar;
      diemSales = sal;
    }
    public double getDiem() {
      return (2 * diemMarketing + diemSales) / 3;
    }
}
