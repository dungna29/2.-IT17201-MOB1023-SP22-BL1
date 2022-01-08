/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String choice;
    IStudentService iStudentService = new StudentService();
    do {
      System.out.println("Quản lý SV và GV");
      System.out.println("1. QL Sinh Viên");
      System.out.println("2. QL Giảng Viên");
      System.out.println("3. Thoát");
      System.out.print("Mời bạn chọn cn: ");
      choice = sc.nextLine();
      switch (choice) {
        case "1":
          do {
            System.out.println("Quản lý Sinh Viên");
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. Tìm Kiếm");
            System.out.println("5. Xuất danh sách");
            System.out.println("6. Thoát");
            System.out.print("Mời bạn chọn cn: ");
            choice = sc.nextLine();
            switch (choice) {
              case "1":
                System.out.println(iStudentService.add());
                break;
              case "2":
                System.out.println(iStudentService.edit());
                break;
              case "3":
                System.out.println(iStudentService.delete());
                break;
              case "4":
                System.out.println(iStudentService.find());
                break;
              case "5":
                iStudentService.inRaManHinh();
                break;
              default:
                System.out.println("Mời chọn lại");
            }
          } while (!choice.equals("6"));

          break;
        case "2":

          break;
        default:
          System.out.println("Chức năng bạn chọn không tồn tại");
      }

    } while (!choice.equals("3"));

  }

}
