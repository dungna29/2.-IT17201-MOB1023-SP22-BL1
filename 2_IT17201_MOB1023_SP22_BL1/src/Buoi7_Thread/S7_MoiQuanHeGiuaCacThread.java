/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi7_Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dungna29
 */
public class S7_MoiQuanHeGiuaCacThread {
    float tienTrongVi = 100000;
    public static void main(String[] args) {
        S7_MoiQuanHeGiuaCacThread s7 = new S7_MoiQuanHeGiuaCacThread();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    s7.rutTien(110000);
                } catch (InterruptedException ex) {
                }
            }
            
        };
        t1.start();
        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    s7.napTien(20000);
                } catch (InterruptedException ex) {
                }
            }
            
        };
        t2.start();
        
    }
    synchronized void rutTien(float soTienRut) throws InterruptedException{
        System.out.println("Đang tiến hành rút tiền....");
        Thread.sleep(2000);
        if (soTienRut > tienTrongVi) {
            System.out.println("Bạn không đủ tiền rút");
            wait();//Đưa thread vào trạng thái ngủ
        }
        tienTrongVi -= soTienRut;
        System.out.println("Phương thức rút tiền");
        System.out.println("Số tiền trong tk còn: " + tienTrongVi);
    }
    synchronized void napTien(float soTienNap) throws InterruptedException{
        System.out.println("Đang tiến hành nạp tiền....");
        Thread.sleep(2000);
        tienTrongVi += soTienNap;
        System.out.println("Sau khi nạp tk bạn có: " + tienTrongVi);
        Thread.sleep(3000);
        notify();//Kích hoạt các Thread đang ngủ
    }
}
