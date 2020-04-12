/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;
import baitap1.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author TrongHanh
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

  public void them(NhanVien nv) {
    dsNhanVien.add(nv);
  };
  public void inDS() {
    dsNhanVien.forEach(nv -> System.out.println(nv.getThongTin()));
  };   
}
