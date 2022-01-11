/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_ON_TAP_JAVA1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dungna89
 */
public class Utilities {

  boolean checkSo(String text) {
    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(text);
    return matcher.matches();
  }

  String convertFullName(String fullname) {
    String[] arrName = fullname.split("\\s+");
    String fullN = "";
    for (String x : arrName) {
      fullN += vietHoaChuCaiDau(x) + " ";
    }
    return fullN;
  }

  String vietHoaChuCaiDau(String text) {//DUNG
    var temp = text.trim().toLowerCase();//dung
    return String.valueOf(temp.charAt(0)).toUpperCase() + text.substring(1);//= Dung
  }

  //Viết 1 phương thức tạo mã sinh viên tự động khi nhập tên NGUYỄN VĂN CHƯƠNG => MSV: ChuongnvPH1
  String msvFpoly(String fullName, int maxMSV, int a) {
    String[] arrName = fullName.split("\\s+");//Nguyễn Văn Chương
    String name = vietHoaChuCaiDau(arrName[arrName.length - 1]);//Chương
    for (int i = 0; i < arrName.length - 1; i++) {
      name += String.valueOf(arrName[i].charAt(0)).toUpperCase();
    }
    //0 là sinh viên, 1 là GV
    name += ((a == 0) ? "PH" : "") + String.valueOf(maxMSV);//Đoạn cộng PH và số đằng sau 
    return name;//chuongNVPH001
  }
}
