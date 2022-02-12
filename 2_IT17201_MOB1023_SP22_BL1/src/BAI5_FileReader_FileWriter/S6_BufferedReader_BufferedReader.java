/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_FileReader_FileWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S6_BufferedReader_BufferedReader {

    public static void main(String[] args) throws IOException {
        /*
        Lớp BufferedWriter trong java được sử dụng để cung cấp bộ đệm cho các các thể hiện của lớp Writer. 
        Nó giúp hiệu suất nhanh. Nó thừa kế lớp Writer. Các ký tự đệm được sử dụng để cung cấp việc ghi dữ liệu hiệu quả với các mảng đơn, 
        các ký tự và chuỗi.
        Lớp BufferedReader trong java được sử dụng để đọc văn bản từ một input stream dựa trên các ký tự (character stream). 
        Nó có thể được sử dụng để đọc dữ liệu theo dòng (line by line) bằng phương thức readLine(). 
        Nó giúp hiệu suất nhanh. Nó kế thừa lớp Reader.
         */
        FileWriter writer = new FileWriter("test.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("JAVA 2 BufferedWriter");
        buffer.close();
        System.out.println("In Thành Công...");
        
        
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr); 
        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
}
