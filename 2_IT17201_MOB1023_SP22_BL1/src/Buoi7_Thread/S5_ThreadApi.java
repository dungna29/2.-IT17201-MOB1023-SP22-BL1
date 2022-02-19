/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi7_Thread;

/**
 *
 * @author dungna29
 */
public class S5_ThreadApi implements Runnable {

    @Override
    public void run() {
        int a = 0;
        while (true) {
            try {
                System.out.println(a++);
                Thread.sleep(1000);
                if (a == 5) {
                    break;
                }
            } catch (InterruptedException ex) {
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        S5_ThreadApi s1 = new S5_ThreadApi();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        t1.start();
        t1.join();//t1 yêu cầu luồng tiếp theo phải chờ nó chạy xong
        t2.start();//Luồng 2 sẽ phải chờ khi luồng t1 thực hiện xong
    }

    /*
        final String getName() Lấy ra tên của thread
        final int getPriority() Lấy ra thứ tự ưu tiên của thread
        final boolean isAlive() Kiểm tra 1 thread vẫn còn chạy hay không
        final void join() Chờ đến khi 1 thread ngừng hoạt động
        void run() Chạy một một thread
        static void sleep(long
        milliseconds)
        Tạm ngừng hoạt động của 1 thread với một khoảng
        thời gian là mili giây
        void start() Bắt đầu 1 thread bằng cách gọi run()
        
        THỨ TỰ ƯU TIÊN THREAD
        ❑Các hằng số biểu thị độ ưu tiên
        ❖NORM_PRIORITY 5
        ❖MAX_PRIORITY 10
        ❖MIN_PRIORITY 1
        ❑Giá trị mặc định cho thứ tự ưu tiên
        ❖NORM_PRIORITY
        ❑Đọc/ghi độ ưu tiên của Thread
        ❖final void setPriority(int p)
        ❖final int getPriority()
        ❑Trong trường hợp xảy ra tranh chấp tài nguyên
        thì thread có độ ưu tiên cao hơn sẽ thực hiện
     */
}
