/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;
import java.util.ArrayList;

/**
 *
 * @author TrongHan
 */
public class QuanLyChuyenXe {
    public ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();
    public void themChuyenXe(ChuyenXe cx) {
      dsChuyenXe.add(cx);
    }
    public ArrayList<ChuyenXe> xuatDanhSach() {
      return dsChuyenXe;
    }
    public void inThongTin() {
      for (int i = 0; i< dsChuyenXe.size(); i++) {
          dsChuyenXe.get(i).inThongTinChuyenXe();
      }
    }
    public double tongDoanhThuNoiThanh() {
      double dt = 0;
      for (int i = 0; i< dsChuyenXe.size(); i++) {
        if (dsChuyenXe.get(i) instanceof XeNoiThanh) {
          dt += dsChuyenXe.get(i).doanhThu;
        }
      }
      return dt;
    }
    public double tongDoanhThuNgoaiThanh() {
      double dt = 0;
      for (int i = 0; i< dsChuyenXe.size(); i++) {
        if (dsChuyenXe.get(i) instanceof XeNgoaiThanh) {
          dt += dsChuyenXe.get(i).doanhThu;
        }
      }
      return dt;
    }
    public double tongDoanhThu() {
      double dt = 0;
      for (int i = 0; i< dsChuyenXe.size(); i++) {
          dt += dsChuyenXe.get(i).doanhThu;
      }
      return dt;
    }
}
