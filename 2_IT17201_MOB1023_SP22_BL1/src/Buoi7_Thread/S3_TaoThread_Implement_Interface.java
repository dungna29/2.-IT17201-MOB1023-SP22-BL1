/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Thread;

/**
 *
 * @author Dungna89
 */
public class S3_TaoThread_Implement_Interface implements Runnable{

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
  public static void main(String[] args) {
    Thread thread1 = new Thread(new S3_TaoThread_Implement_Interface());
    thread1.start();
    Thread thread2 = new Thread(new S3_TaoThread_Implement_Interface());
    thread2.start();
  }
  
}
