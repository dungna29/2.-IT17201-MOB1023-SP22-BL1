/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

/**
 *
 * @author Dungna89
 */
public class ClassD {
  void method1(){
    ClassA classA = new ClassA();
    //classA.a = 5;//Không gọi được vì a bị private chỉ được sử dụng bên trong class.
    classA.b = 5;
    classA.c = 5;
    classA.d = 5;
  }
}
