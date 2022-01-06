/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1_ONTAP_JAVA1;

/**
 *
 * @author Dungna89
 */
public class B2_STATIC_VD2 {
  private static int tempStatic = 0;//Được khởi tạo 1 lần duy nhất và có thể bị thay đổi giá trị
  //private int tempStatic = 0;
  public static void main(String[] args) {
    B2_STATIC_VD2 sv1 = new B2_STATIC_VD2();
    sv1.demSoSinhVien();
    B2_STATIC_VD2 sv2 = new B2_STATIC_VD2();
    sv2.demSoSinhVien();
    B2_STATIC_VD2 sv3 = new B2_STATIC_VD2();
    sv3.demSoSinhVien();
  }
  void demSoSinhVien(){
    tempStatic++;
    this.inra();
  }
  void inra(){
    System.out.println("Đây là sv số: " + tempStatic);
  }
}
