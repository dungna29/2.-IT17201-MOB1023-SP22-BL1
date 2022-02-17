/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dungna89
 */
public class S2_Tao_Thread extends Thread {

  public static void main(String[] args) {
    //Thực hiện đa luồng
    S2_Tao_Thread thread1 = new S2_Tao_Thread();
    thread1.start();//Khởi động luồng lên
    S2_Tao_Thread thread2 = new S2_Tao_Thread();
    thread2.start();
  }

  @Override
  public void run() {
   int a = 0;
    while (true) {
     try {
       System.out.println(a++);
       Thread.sleep(1000);
     } catch (InterruptedException ex) {
       break;
     }
    }
  }

}
