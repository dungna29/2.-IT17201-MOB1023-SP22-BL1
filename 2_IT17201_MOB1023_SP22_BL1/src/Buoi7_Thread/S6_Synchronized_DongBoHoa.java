/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi7_Thread;

/**
 *
 * @author dungna29
 */
public class S6_Synchronized_DongBoHoa implements Runnable{
     /*
        ĐỒNG BỘ HÓA THREAD
        ❑Nếu nhiều thread đang hoạt động đồng thời mà
        sử dụng chung một tài nguyên nào đó thì sẽ xảy
        ra xung đột
        ❑Đồng bộ hóa chính là việc sắp xếp thứ tự các
        thread khi truy xuất vào cùng đối tượng sao cho
        không có sự xung đột dữ liệu.
        ❑Để đảm bảo rằng một nguồn tài nguyên chia sẻ
        được sử dụng bởi một thread tại một thời điểm,
        chúng ta sử dụng đồng bộ hóa
        (synchronization).
        */
    @Override
    public synchronized void run() {
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
    public static void main(String[] args) {
        S6_Synchronized_DongBoHoa s1 = new S6_Synchronized_DongBoHoa();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        t1.start();
        t2.start();
    }
}
