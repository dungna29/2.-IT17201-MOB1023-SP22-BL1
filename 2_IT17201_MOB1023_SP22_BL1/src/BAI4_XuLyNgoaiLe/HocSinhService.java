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
public class HocSinhService {
  public void checkTuoiYeu(int tuoi)throws TuoiDeYeuException{
    if (tuoi < 16) {
      throw new TuoiDeYeuException("Bạn chưa đủ tuổi yêu đương");
    }else{
      System.out.println("Bạn đã đủ tuổi để yêu");
    }
  }
}
