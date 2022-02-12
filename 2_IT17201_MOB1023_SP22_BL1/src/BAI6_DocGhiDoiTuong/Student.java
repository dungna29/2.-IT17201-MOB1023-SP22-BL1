/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_DocGhiDoiTuong;

import java.io.Serializable;

/**
 *
 * @author Dungna89
 */
//implements Serializable Giúp trong quá trình ghi vào file các thuộc tính và đối tượng sắp được sắp xếp thứ tự và không xáo trộn dữ liệu
public class Student extends Person implements Serializable{

  private String msv;
  private int gioiTinh;
  private String nganhHoc;

  public Student() {
  }

  public Student(String msv, int gioiTinh, String nganhHoc, int id, String ten, String sdt) {
    super(id, ten, sdt);
    this.msv = msv;
    this.gioiTinh = gioiTinh;
    this.nganhHoc = nganhHoc;
  }

  

  public String getMsv() {
    return msv;
  }

  public void setMsv(String msv) {
    this.msv = msv;
  }

  public String getNganhHoc() {
    return nganhHoc;
  }

  public void setNganhHoc(String nganhHoc) {
    this.nganhHoc = nganhHoc;
  }

  public int getGioiTinh() {
    return gioiTinh;
  }

  public void setGioiTinh(int gioiTinh) {
    this.gioiTinh = gioiTinh;
  }
  
  
  @Override
  public void inRaManHinh() {
    System.out.printf("ID: %d | Tên: %s | Sđt: %s | MSV: %s | Ngành Học: %s \n",getId(),getTen(),getSdt(),getMsv(),getNganhHoc());   
  }
}
