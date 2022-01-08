/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

/**
 *
 * @author Dungna89
 */
public interface IStudentService {
  /*
    1. Trong interface phương thức không có body code
    2. Trong interface không bao giờ có private và sẽ luôn là public kể cả khi các bạn để phươn thức ở dạng mặc định
  */
  public String add();//Thêm sv
  public String edit();//Sửa sv
  public String delete();//Xóa sv
  public String find();//Tìm Kiếm sv
  public void inRaManHinh();//Xuất danh ds sinh viên
}
