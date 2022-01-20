/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_SINHVIEN;

import BAI_TAP_MAU_ON_TAP_JAVA1.*;

/**
 *
 * @author Dungna89
 */
public abstract class Person {//Lớp cha
  private int id;
  private String ten;
  private String sdt;

  public Person() {
  }

  public Person(int id, String ten, String sdt) {
    this.id = id;
    this.ten = ten;
    this.sdt = sdt;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public String getSdt() {
    return sdt;
  }

  public void setSdt(String sdt) {
    this.sdt = sdt;
  }
  
  public abstract void inRaManHinh();
}
