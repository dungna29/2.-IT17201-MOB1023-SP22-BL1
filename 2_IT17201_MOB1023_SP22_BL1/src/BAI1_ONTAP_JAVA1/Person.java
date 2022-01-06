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
//abstract Class thì vẫn là 1 lớp hoàn bình thường nhưng phải sử dụng phương thức abstract.
public abstract class Person { //Lớp cha
  private String variable1;
  private String variable2;
  private String variable3;

  public Person() {
  }

  public Person(String variable1, String variable2, String variable3) {
    this.variable1 = variable1;
    this.variable2 = variable2;
    this.variable3 = variable3;
  }

  public String getVariable1() {
    return variable1;
  }

  public void setVariable1(String variable1) {
    this.variable1 = variable1;
  }

  public String getVariable2() {
    return variable2;
  }

  public void setVariable2(String variable2) {
    this.variable2 = variable2;
  }

  public String getVariable3() {
    return variable3;
  }

  public void setVariable3(String variable3) {
    this.variable3 = variable3;
  }
  
  public void method1(int variable){
    
  }
  public void method2(int variable,String variableString){
    
  }
  
  //Phương thức abstract không body code
  public abstract void method3();
  public abstract void method4(String a, int b);
}
