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

/**
 *
 * @author Nguyen Anh Dung
 */
public class S3_FileInputStream {

    public static void main(String[] args) throws IOException {
        //❑FileInputStream là luồng dữ liệu vào từ file nhị phân
        //Cặp luồng này được sử dụng để làm việc với file nhị phân
        //    ❖Sử dụng FileInputStream để đọc dữ liệu từ file nhị  phân
        //    ❖Sử dụng FileOutputStream để ghi dữ liệu vào file nhị   phân
        ghiFileOutStream();
        docFileInputStream();
        

    }

    static void docFileInputStream() throws IOException {   
        File file = new File("dataName.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        // Tạo một đối tượng InputStream để đọc 1 file
        FileInputStream is = new FileInputStream(file);

        int i = -1;

        // Đọc lần lượt các byte (8bit) trong luồng và lưu vào biến i
        // Khi đọc ra giá trị -1 nghĩa là vị trí cuối cùng
        while ((i = is.read()) != -1) {
            System.out.println(is.read());
            System.out.print((char) i);
        }
        is.close();
    }

    static void ghiFileOutStream() throws IOException {
        //Nhập từ ký tự từ bàn phím và hiển thị kết quả lên màn hình
        File file = new File("dataName.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        // Tạo một đối tượng InputStream để đọc 1 file
        FileOutputStream fos = new FileOutputStream(file);

        String text = "Chúc các em vượt qua JAVA 2 thành công";
        byte[] arrTextAsByte = text.getBytes();
        fos.write(arrTextAsByte);
        fos.close();
    }
}
