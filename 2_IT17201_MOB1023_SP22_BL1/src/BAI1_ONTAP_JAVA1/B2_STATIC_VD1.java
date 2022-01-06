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
public class B2_STATIC_VD1 {
  public static String tempStatic = "Đây là biến static";
  
  //Khối Static
  static {
    System.out.println("Đây là khối static 1");
  }
  static {
    System.out.println("Đây là khối static 2");
  }

  public B2_STATIC_VD1() {
    System.out.println("Đã vào hàm main");
    System.out.println(tempStatic);
  }
  public static void main(String[] args) {
    B2_STATIC_VD1 vd1 = new B2_STATIC_VD1();
    vd1.method1();    
  }
  void method1(){
    System.out.println("Đây là method 1");
  }
}
