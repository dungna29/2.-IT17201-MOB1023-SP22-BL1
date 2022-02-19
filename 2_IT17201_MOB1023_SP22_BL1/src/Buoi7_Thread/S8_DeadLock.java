/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Thread;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S8_DeadLock {
    public static void main(String[] args) {
        /*
            ❑Dead lock: (khóa chết hoặc bế tắc) Là tình huống
            xảy khi hai hay nhiều tiểu trình chờ đợi lẫn nhau
            (tiến trình này chờ tiến trình kia kết thúc công
            việc thì mới tiếp tục được công việc của mình).
            Do vậy, các tiến trình này mãi mãi ở trạng thái
            chờ đợi lẫn nhau (waiting forever)
        
            DAEMON THREADS
            ❑Có hai loại thread trong Java:
            ❖Thread người dùng (user thread): Là thread do người
            dùng tạo ra.
            ❖Daemon threads: Là các thread làm việc ở chế độ
            nền, cung cấp các dịch vụ cho các thread khác
        
            Khi 1 thread của user kết thúc hoạt động, JVM sẽ
            kiểm tra xem còn thread nào đang chạy không.
            
            Nếu có thì sẽ lên lịch làm việc cho thread
            tiếp theo.
        
            Nếu chỉ còn các thread ‘daemon’ thì thread này
            cũng kết thúc hoạt động.
        
        
            GARBAGE COLLECTION
            ❑Garbage Collection là một trong các thread
            Daemon (là luồng thu dọn các dữ liệu không
            dùng đến – dọn rác)
            ❑Garbage Collection sẽ tự động dọn dẹp: giải
            phóng vùng bộ nhớ không còn cần thiết nữa.
            ❑Một object đủ điều kiện để thu gom nếu không
            có tham chiếu đến nó hoặc giá trị của nó là null.
            ❑Garbage Collection một thread chạy riêng biệt
            với độ ưu tiên thấp
        
            FINALIZE ()
            ❑Là phương thức được sử dụng cho việc dọn dẹp
            các vùng tài nguyên không được dùng nữa trước
            khi hủy bỏ các đối tượng.
            ❑Sau khi kết thúc chương trình, trước khi trả điều
            khiển về cho hệ điều hành, phương thức
            finalize() sẽ được gọi bởi thead ‘Gabage
            collector’ để thực hiện công việc dọn dẹp.
        */
    }
}
