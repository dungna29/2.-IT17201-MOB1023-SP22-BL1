/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_DocGhiDoiTuong;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dungna89
 */
public class S1_DocGhiDoiTuong {

  List<Student> _lstStudents = new ArrayList<Student>();

  public static void main(String[] args) {
    try {
      S1_DocGhiDoiTuong s1 = new S1_DocGhiDoiTuong();
      s1.ghiFile();
      s1.docFile();
    } catch (IOException ex) {
      Logger.getLogger(S1_DocGhiDoiTuong.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(S1_DocGhiDoiTuong.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  void ghiFile() throws IOException {
    _lstStudents.add(new Student("AnvPH1", 1, "UDPM.JAVA", 1, "Nguyễn Văn A", "0123456"));
    _lstStudents.add(new Student("BnvPH2", 0, "UDPM.NET", 2, "Nguyễn Văn B", "0123456"));
    _lstStudents.add(new Student("CnvPH3", 2, "UDPM.JAVA", 3, "Nguyễn Văn C", "0123456"));
    _lstStudents.add(new Student("DnaPH4", 1, "UDPM.JAVA", 4, "Nguyễn Anh D", "0123456"));
    _lstStudents.add(new Student("EnvPH5", 1, "UDPM.NET", 5, "Nguyễn Văn E", "0123456"));
    //Check sự tồn tại của file đó
    File file = new File("C:\\New folder\\New Text Document.txt");
    if (!file.exists()) {//Nếu File không tồn tại
      file.createNewFile();//Tạo mới file
    }

    //Tiến hành ghi file
    FileOutputStream fos = new FileOutputStream(file);
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    for (Student x : _lstStudents) {
      oos.writeObject(x);
    }
    oos.close();
    fos.close();
  }

  static void docFile() throws IOException, ClassNotFoundException {
     File file = new File("C:\\New folder\\New Text Document.txt");
    if (!file.exists()) {//Nếu File không tồn tại
      System.out.println("Không thấy file bạn ơi");
      return;
    }
    //Khai báo 1 List Trắng
    List<Student> _lstStudents_news = new ArrayList<Student>();
    FileInputStream  fis = new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(fis);
    while (fis.available() > 0) {
      var temp = ois.readObject();
      _lstStudents_news.add((Student)temp);
    }
    
    for (Student x : _lstStudents_news) {
      x.inRaManHinh();
    }
    ois.close();
    fis.close();
  }
}
