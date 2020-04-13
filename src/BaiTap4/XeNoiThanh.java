/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author TrongHanh
 */
public class XeNoiThanh extends ChuyenXe{
    public String soTuyen;
    public double soKm;
    
    @Override
    public void inThongTinChuyenXe() {
      System.out.println(maChuyen + ", " + taiXe + ", " + soXe + ", " + doanhThu + ", " + soTuyen + ", " + soKm);
    }
}
