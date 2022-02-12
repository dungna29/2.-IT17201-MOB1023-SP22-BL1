/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_FileReader_FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S5_FileReader_FileWriter {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Ghi File với FileWriter
        FileWriter fw = new FileWriter("test.txt");
        fw.write("JAVA2 POLY FileWriter");
        fw.close();
        System.out.println("Ghi File Xong");

        //Đọc File với FileReader
        System.out.println("Đọc File lên");
        FileReader fr = new FileReader("test.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }

}
