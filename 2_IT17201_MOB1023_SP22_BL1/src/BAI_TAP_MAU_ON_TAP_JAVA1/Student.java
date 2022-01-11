/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

/**
 *
 * @author Dungna89
 */
public class Student extends Person {

  private String msv;
  private String nganhHoc;

  public Student() {
  }

  public Student(String msv, String nganhHoc, int id, String ten, String sdt) {
    super(id, ten, sdt);
    this.msv = msv;
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
  
  
  @Override
  public void inRaManHinh() {
    System.out.printf("ID: %d | Tên: %s | Sđt: %s | MSV: %s | Ngành Học: %s \n",getId(),getTen(),getSdt(),getMsv(),getNganhHoc());   
  }
}
