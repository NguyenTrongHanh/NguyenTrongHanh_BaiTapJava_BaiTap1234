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
public class SinhVienIT extends SinhVienPoLy {
    public double diemJava;
    public double diemCss;
    public double diemHtml;
    public SinhVienIT(String ht, String nh, double java, double css, double html) {
      super(ht, nh);
      diemJava = java;
      diemCss = css;
      diemHtml = html;
    }
    public double getDiem() {
      return (2 * diemJava + diemHtml + diemCss) / 4;
    };
}
