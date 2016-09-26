/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author LAB_TI
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public class contoh1 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        InputStream fileInput = new FileInputStream("d:/dokumen.txt");
        
        int data = fileInput.read();
        
        while(data !=-1)
        {
            System.out.print((char)data);
            data=fileInput.read();
        }
        fileInput.close();
    }
}
