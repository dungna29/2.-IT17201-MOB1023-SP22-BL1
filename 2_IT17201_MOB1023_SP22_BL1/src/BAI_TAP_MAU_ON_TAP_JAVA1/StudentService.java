/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class StudentService implements IStudentService {

  Scanner _sc;
  String _input;
  List<Student> _lstStudents;
  Student _student;
  Utilities _Utilities;

  public StudentService() {
    _sc = new Scanner(System.in);
    _lstStudents = new ArrayList<Student>();
    _Utilities = new Utilities();
    fake5Data();
  }

  public void fake5Data() {
    _lstStudents.add(new Student("AnvPH1", "UDPM.JAVA", 1, "Nguyễn Văn A", "0123456"));
    _lstStudents.add(new Student("BnvPH2", "UDPM.NET", 2, "Nguyễn Văn B", "0123456"));
    _lstStudents.add(new Student("CnvPH3", "UDPM.JAVA", 3, "Nguyễn Văn C", "0123456"));
    _lstStudents.add(new Student("DnaPH4", "UDPM.JAVA", 4, "Nguyễn Anh D", "0123456"));
    _lstStudents.add(new Student("EnvPH5", "UDPM.NET", 5, "Nguyễn Văn E", "0123456"));
  }

  @Override
  public String add() {
    System.out.print("Mời bạn nhập sl: ");
    _input = _sc.nextLine();
    for (int i = 0; i < Integer.parseInt(_input); i++) {
      _student = new Student();
      _student.setId(getMaxID(_lstStudents) + 1);
      System.out.println("Mời bạn nhập tên: ");
      _student.setTen(_Utilities.convertFullName(_sc.nextLine()));
      System.out.println("Mời bạn nhập sđt: ");
      _student.setSdt(_sc.nextLine());
      _student.setMsv(_Utilities.msvFpoly(_student.getTen(), _student.getId(), 0));
      System.out.println("Chọn ngành: ");
      System.out.println("1. C#");
      System.out.println("2. Java");
      System.out.print("Mời bạn chọn ngành: ");
      String nganh = _sc.nextLine();
      _student.setNganhHoc(nganh.equals("1") ? "C#" : "JAVA");
      _lstStudents.add(_student);
    }
    return "Thêm thành công";
  }

  @Override
  public String edit() {
    int index = getIndexByID(Integer.parseInt(getInputValue("id")));
    if (index == -1) {
      return "Không tìm thấy";
    }
    System.out.println("Mời bạn nhập tên: ");
    _lstStudents.get(index).setTen(_Utilities.convertFullName(_sc.nextLine()));
    System.out.println("Mời bạn nhập sđt: ");
    _lstStudents.get(index).setSdt(_sc.nextLine());
    System.out.println("Chọn ngành: ");
    System.out.println("1. C#");
    System.out.println("2. Java");
    System.out.print("Mời bạn chọn ngành: ");
    String nganh = _sc.nextLine();
    _lstStudents.get(index).setNganhHoc(nganh.equals("1") ? "C#" : "JAVA");
    return "Đã sửa thành công";
  }

  @Override
  public String delete() {
    int index = getIndexByID(Integer.parseInt(getInputValue("id")));
    if (index == -1) {
      return "Không tìm thấy";
    }
    _lstStudents.remove(index);
    return "Đã xóa thành công";
  }

  @Override
  public String find() {
    int index = getIndexByID(Integer.parseInt(getInputValue("id")));
    if (index == -1) {
      return "Không tìm thấy";
    }
    _lstStudents.get(index).inRaManHinh();
    return "Đã tìm thấy ở trên";
  }

  @Override
  public void inRaManHinh() {
    for (Student x : _lstStudents) {
      x.inRaManHinh();
    }
  }
  //Code các chức năng CRUD của đối tượng 

  public int getMaxID(List<Student> lstStd) {
    if (lstStd.isEmpty()) {
      return 1;
    }
    int max = lstStd.get(0).getId();
    for (Student x : lstStd) {
      if (max < x.getId()) {
        max = x.getId();
      }
    }
    return max;
  }

  private int getIndexByID(int id) {
    for (int i = 0; i < _lstStudents.size(); i++) {
      if (_lstStudents.get(i).getId() == id) {
        return i;
      }
    }
    return -1;
  }

  private String getInputValue(String msg) {
    System.out.printf("Mời bạn nhập %s: ", msg);
    return _sc.nextLine();
  }

  public void timKiemGanDung() {
    System.out.printf("Mời bạn nhập %s: ");
    var temp = _sc.nextLine();//dun
    for (Student x : _lstStudents) {
      if (x.getTen().startsWith(temp)|| x.getMsv().startsWith(temp)) {
        x.inRaManHinh();
        //return;
      }
    }
  }
}
