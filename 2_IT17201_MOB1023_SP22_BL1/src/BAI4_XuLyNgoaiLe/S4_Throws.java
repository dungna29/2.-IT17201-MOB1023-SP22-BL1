/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_XuLyNgoaiLe;

/**
 *
 * @author Dungna89
 */
public class S4_Throws {
       /*
          Lưu ý:
        Nếu bạn đang gọi một phương thức khai báo throws một ngoại lệ, bạn phải bắt hoặc throws ngoại lệ đó. 
        Có hai trường hợp:
        Trường hợp bắt ngoại lệ, tức là xử lý ngoại lệ bằng cách sử dụng try/catch.
        Trường hợp khai báo ném ngoại lệ, tức là sử dụng từ khóa throws với phương thức.
         */
  public static void main(String[] args) throws Exception {
    S4_Throws s4 = new S4_Throws();
    s4.method();
  }
  void method() throws Exception{
    //throw new Exception("Lỗi rồi");
    int a = 10/0;
  }
    //A) Trong trường hợp bạn khai báo throws ngoại lệ, 
    //nếu ngoại lệ không xảy ra, code sẽ được thực hiện tốt.
    
//    void method() throws IOException {
//        System.out.println("device operation performed");  
//    }
// 
//    public static void main(String args[]) throws IOException {
//        S5_ThrowsViDu obj = new S5_ThrowsViDu();
//        obj.method();
//        System.out.println("Chạy đến hết hàm");
//    }
    
//    //B) Trong trường hợp bạn khai báo throws ngoại lệ, nếu ngoại lệ xảy ra, 
//    // một ngoại lệ sẽ được ném ra tại runtime vì throws nên không xử lý ngoại đó.
//    
}
