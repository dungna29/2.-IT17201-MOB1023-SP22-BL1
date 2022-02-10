/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_XuLyNgoaiLe;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Dungna89
 */
public class S1_Exception {

  /*
            Định nghĩa mức cơ bản: Try Catch dùng để chống crash chương trình.
            1. Không sử dụng try catch khi đang lập trình
            2. Ở môi trường học tập Chỉ dùng try catch khi nộp bài hoặc đi chấm bài
            3. Trong môi trường làm việc: Chỉ khi nào đóng gói cho Tester thì phải đóng try catch hoặc trước khi bàn giao cho khách hàng cũng phải đóng lại.
   */
 /*
        Exception là một sự kiện xảy ra trong quá trình thực thi một chương trình Java, nó làm phá vỡ cái flow (luồng xử lý) bình thường của một chương trình, thậm chí chết chương trình.
        
        Một ngoại lệ có thể xảy ra với nhiều lý do khác nhau, nó nằm ngoài dự tính của chương trình.
        Một vài ngoại lệ xảy ra bởi lỗi của người dùng, 
        một số khác bởi lỗi của lập trình viên và số khác nữa đến từ lỗi của nguồn dữ liệu vật lý. 
        Chẳng hạn như:
            Người dùng nhập dữ liệu không hợp lệ.
            Truy cập ngoài chỉ số mảng.
            Một file cần được mở nhưng không thể tìm thấy.
            .......
        
        Phân cấp của Exception trong java.
            + Class ở mức cao nhất là Throwable
            + Hai class con trực tiếp là Error và Exception.
   */
 /*
    
   */

 /*
        Exception
        Trong Java có 2 loại exception: checked và unchecked. 
        Tất cả các checked exception được kế thừa từ lớp Exception ngoại trừ lớp RuntimeException. 
        RuntimeException là lớp cơ sở của tất cả các lớp unchecked exception.
        Đó cũng là dấu hiệu để nhận biết đâu là checked exception và đâu là unchecked exception.
        
        ❑Ngoại lệ ‘unchecked’:
        ❖Là các ngoại lệ được kiểm tra lúc chạy
        ❖Bao gồm các class Error, RuntimeException và các lớp con của chúng
        ❖Ví dụ: Integer.parseInt(“abc”) vẫn dịch được nhưng chạy lỗi.
        ❑Ngoại lệ ‘checked’:
        ❖Là các ngoại lệ được kiểm tra lúc dịch
        ❖Bao gồm các class exception còn lại
        ❖Ví dụ: new FileWriter(“c:/data.txt”) dịch lỗi dù file đã tồn tại
   */
  public static void main(String[] args) {
    CoTheSuDungNhieuCatch();
  }

  static void Exception1() {
    int zero = 0;
    int average = 10 / zero;
    //Exception in thread "main" java.lang.ArithmeticException: / by zero
  }

  static void Exception2() {
    try {
      String input = "Chương";
      int number = Integer.parseInt(input);
    } catch (NumberFormatException numberFormatException) {
      //NumberFormatException nó là 1 lớp bắt được các Exception liên quan đến định dạng số từ chuỗi
    }
    //Exception in thread "main" java.lang.NumberFormatException: For input string: "Chương"
  }

  static void UncheckedExcep() {
    /*Là loại exception xảy ra tại thời điểm thực thi chương trình, 
        nó cũng có thể gọi là runtime exceptions đó là programming bugs,
        lỗi logic của chương trình… 
        Loại exception này được bỏ qua trong quá trình compile, không bắt buộc ta phải handle nó.
        Ví dụ: NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, DivideByZeroException
     */
    String temp = null;
    System.out.println(temp.length());
    //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "temp" is null
  }

  static void CheckedExcep() {
    /*Là loại exception xảy ra trong lúc compile time, 
        nó cũng có thể được gọi là compile time exceptions. 
        Loại exception này không thể bỏ qua được trong quá trình compile, 
        bắt buộc ta phải handle nó.
        Các lớp extends từ lớp Throwable ngoại trừ 
        RuntimeException và Error được gọi là checked exception.
        
        Ví dụ: IOException, FileNotFoundException, NoSuchFieldException,
     */
    //FileReader f = new FileReader("File không tồn tại");
  }

  static void ViDuTongHop1VaiException() {
    int a = 10 / 0;//ArithmeticException
    String temp = null;
    System.out.println(temp.length());//NullPointerException
    int b = Integer.parseInt("a");//NumberFormatException
    int arr[] = new int[5];
    arr[9] = 50;//ArrayIndexOutOfBoundsException

    //Khi code 1 chương trình hoặc chức năng luôn cố gắng lường hết mọi tình huống trước khi hoàn thành.
  }

  static void CoTheSuDungNhieuCatch() {
    try {
      String[] arr = {"1", "a", "101"};
      int a = Integer.parseInt(arr[1]);
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatException");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException");
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException");
    } catch (NullPointerException e) {
      System.out.println("NullPointerException");
    } catch (Exception e) {
      System.out.println("Exception");
    }
  }
}
