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
public class StudentService implements IStudentService{

  Scanner _sc;
  String _input;
  List<Student> _lstStudents;
  Student _student;
  public StudentService() {
    _sc = new Scanner(System.in);
    _lstStudents = new ArrayList<Student>();
    fake5Data();
  }
  
  public void fake5Data(){
    _lstStudents.add(new Student("AnvPH001", "UDPM.JAVA", 1, "Nguyễn Văn A", "0123456"));
    _lstStudents.add(new Student("BnvPH002", "UDPM.NET", 2, "Nguyễn Văn B", "0123456"));
    _lstStudents.add(new Student("CnvPH003", "UDPM.JAVA", 3, "Nguyễn Văn C", "0123456"));
    _lstStudents.add(new Student("DnaPH004", "UDPM.JAVA", 4, "Nguyễn Anh D", "0123456"));
    _lstStudents.add(new Student("EnvPH005", "UDPM.NET", 5, "Nguyễn Văn E", "0123456"));
  }
  
  @Override
  public String add() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String edit() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String delete() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String find() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void inRaManHinh() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
 //Code các chức năng CRUD của đối tượng 
}
