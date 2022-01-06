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
/*
Khi kế thừa 1 lớp abstract bắt buộc lớp con phải kế thừa tất cả các phương thức abstract còn các phương thức không cùng loại thì có hoặc không đều được.
*/
public class Student extends Person{//Lớp con
  private String variable4;
  private String variable5;

  public Student() {
  }

  public Student(String variable4, String variable5, String variable1, String variable2, String variable3) {
    super(variable1, variable2, variable3);
    this.variable4 = variable4;
    this.variable5 = variable5;
    //this: Tham chiếu đến thuộc tính và phương thức của lớp hiện tại
    //super: Tham chiếu đến thuộc tính và phương thức của lớp cha
  }

  public String getVariable4() {
    return variable4;
  }

  public void setVariable4(String variable4) {
    this.variable4 = variable4;
  }

  public String getVariable5() {
    return variable5;
  }

  public void setVariable5(String variable5) {
    this.variable5 = variable5;
  }
  @Override
  public void method1(int variable) {
    //ĐƯợc phép code lại nội dung bên trong của phương thức đã được ghi đè của cha
  }
  
  @Override
  public void method2(int variable, String variableString) {
   
  }

  @Override
  public void method3() {
 
  }

  @Override
  public void method4(String a, int b) {
  
  }


  
}
