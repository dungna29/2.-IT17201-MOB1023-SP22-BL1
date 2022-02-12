/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_FileReader_FileWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S2_IOBinary {

    public static void main(String[] args) throws IOException {
        //Luồng IO NHỊ PHÂN JAVA
       // docKyTuTuBanPhim();
       // docChuoiKyTuTuBanPhim();
        //docFile();
        //docNhieuByteFile();
        //ghiNoiDungRaFile();
        ghiNoiDungNhieuByteRaFile();
//      

    }

    static void docKyTuTuBanPhim() throws IOException {
        //Nhập từ ký tự từ bàn phím và hiển thị kết quả lên màn hình
        InputStream is = System.in;
        while (true) {
            System.out.print("Mời bạn nhập 1 ký tự vào: ");
            int ch = is.read();//is.read() nó trả kiểu số nguyên // ASCII Table - DECIMAL
            System.out.println(ch);
            is.read();
            if (ch == 'e') {
                System.out.println("Kết Thúc");
                break;
            }
            // skip one byte
            is.skip(2);
            System.out.println("Ký tự Bạn vừa nhập: " + Character.toString(ch));
        }
    }

    static void docChuoiKyTuTuBanPhim() throws IOException {
        while (true) {
            System.out.print("Nhập chuỗi ký tự: ");
            byte[] arrBytes = new byte[1000]; // Khởi tạo mảng Byte để chứa
            int length = System.in.read(arrBytes);
            String str = new String(arrBytes, 0, length);
            if (str.equalsIgnoreCase("ESC")) {
                System.out.println("KẾT THÚC RỒI");
                break;
            }
            System.out.println("Chuỗi bạn nhận được: " + str);
        }

        //String(byte[] bytes, int offset, int length) 
//        byte ascii[] = {65, 66, 67, 68, 69, 70};
//
//        String s1 = new String(ascii);
//        System.out.println(s1);
//
//        String s2 = new String(ascii, 2, 4);
//        System.out.println(s2);
    }

    static void docFile() throws IOException {
        //File nó chỉ lớp quản lý file và ở đây sẽ đường dẫn bên trong file
        String path ="dataName.txt";
        File file = new File("dataName.txt");//dataName.dat
        //Nếu file không tìm thấy file có trong thư mục thì tạo 1 file mới
        if (!file.exists()) {
            file.createNewFile();
        }

        // Tạo một đối tượng InputStream để đọc 1 file
        InputStream is = new FileInputStream(file);
        int i = -1;

        // Đọc lần lượt các byte (8bit) trong luồng và lưu vào biến i
        // Khi đọc ra giá trị -1 nghĩa là vị trí cuối cùng
        while ((i = is.read()) != -1) {
            System.out.print((char) i);
        }
        is.close();
    }

    static void docNhieuByteFile() throws IOException {
        File file = new File("dataName.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        // Tạo một đối tượng InputStream để đọc 1 file
        InputStream is = new FileInputStream(file);

        byte[] arrByte = new byte[10];
        int i = -1;
        
        // Đọc các byte trong luồng và gán lên các phần tử của mảng.
        // Giá trị i là số đọc được của 1 lần. (i sẽ <= 2).
        // Khi không còn phần tử trong luồng i sẽ = -1
        while ((i = is.read(arrByte)) != -1) {
            // Tạo String từ các byte đọc được
            String s = new String(arrByte, 0, i);
            System.out.println(s);
        }
        is.close();
    }
    
    static void ghiNoiDungRaFile() throws IOException {
        File file = new File("dataName.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

       // Tạo một luồng ký tự đầu ra với mục đích ghi thông tin vào file
        OutputStream os = new FileOutputStream(file);
 
        // Tạo một mảng byte ,ta sẽ ghi các byte này vào file nói trên .
        byte[] by = new byte[] { 'f', 'p', 't', 'J', 'A', 'V', 'A', '2', '2', '0', '2','0'};
        //os.write(by[1]);//Ghi 1 byte xuống file
//        // Ghi lần lượt các ký tự vào luồng
        for (int i = 0; i < by.length; i++) {
            byte b = by[i];
            // Thực hiện ghi vào file
            os.write(b);
        }
        // Đóng công việc khi hoàn tất
        os.close();
    }
    
    static void ghiNoiDungNhieuByteRaFile() throws IOException {
        File file = new File("dataName.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        // Tạo một luồng nhị phân đầu ra với mục đích ghi thông tin vào file
        OutputStream os = new FileOutputStream(file);
 
        // Tạo một mảng byte ,ta sẽ ghi các byte này vào file nói trên .
        byte[] b1 = new byte[] { 'F', 'P', 'T' };
        byte[] b2 = new byte[] { 'J', 'A', 'V', 'A' };
        byte[] b3 = new byte[] { 13, 10 }; // Xuống dòng mới - nghiên cứu xem tại sao
        byte[] b4 = new byte[] { 'F', 'P', '1' };
 
        // Ghi cả các byte trong mảng byte[] by vào luồng
        os.write(b1);
 
        // Đẩy các byte hiện có trên luồng xuống file .
        os.flush();
 
        // Tiếp tục ghi các byte trong mảng thứ 2 vào luồng
        os.write(b2);
        os.write(b3);
        os.write(b4);
 
        // Đóng lcông việc khi hoàn tất
        os.close();
    }
    

}
