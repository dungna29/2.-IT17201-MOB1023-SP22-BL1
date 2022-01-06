/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C;

import A.ClassA;

/**
 *
 * @author Dungna89
 */
public class ClassC extends ClassA{
  void method1(){
  
    //a = 5;//Không gọi được vì a bị private chỉ được sử dụng bên trong class.
    //b = 5;
    c = 5;
    d = 5;
  }
}
