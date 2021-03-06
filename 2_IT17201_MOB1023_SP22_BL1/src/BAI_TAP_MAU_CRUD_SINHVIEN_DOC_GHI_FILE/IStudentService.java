/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_CRUD_SINHVIEN_DOC_GHI_FILE;


import java.util.List;

/**
 *
 * @author Dungna89
 */
public interface IStudentService {
  /*
    1. Trong interface phương thức không có body code
    2. Trong interface không bao giờ có private và sẽ luôn là public kể cả khi các bạn để phươn thức ở dạng mặc định
  */
  public String add(Student st);//Thêm sv
  public String edit(Student st);//Sửa sv
  public String delete(int id);//Xóa sv
  public List<Student> find(String txt);//Tìm Kiếm sv
//  public void inRaManHinh();//Xuất danh ds sinh viên
  public List<Student> getlstStudents();//Lấy danh sách sinh viên
  public int getIndexByID(int id);
  public int getMaxID();
  public void fake5Data();
  
  public String ghiFile(String path);
  public String docFile(String path);
}
