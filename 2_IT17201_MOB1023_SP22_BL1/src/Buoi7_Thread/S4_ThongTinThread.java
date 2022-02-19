/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi7_Thread;

/**
 *
 * @author dungna29
 */
public class S4_ThongTinThread extends Thread{
    public static void main(String[] args) {
        S4_ThongTinThread t1 = new S4_ThongTinThread();
        t1.start();
        
        Thread t2 = Thread.currentThread();
        System.out.println("Định danh: " + t2.getId());
        System.out.println("Tên: " + t2.getName());
        System.out.println("Độ ưu tiên: " + t2.getPriority());
        System.out.println("Trạng thái: " + t2.getState());
        System.out.println("Trạng thái hoạt động: " + t2.isAlive());
        System.out.println("Số luồng Thread: " + Thread.activeCount());
    }
}
