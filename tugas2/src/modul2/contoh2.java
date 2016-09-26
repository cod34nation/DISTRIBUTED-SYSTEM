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
import java.io.*;
public class contoh2 {
    public static void main(String[] args)throws FileNotFoundException,IOException {
        String destination ="D:/dokumen2.txt";
        OutputStream output=new FileOutputStream(destination);
        System.out.println("Opened "+destination+"for writing.");
        String data ="Try to write data using output stream";
        for(int i=0;i<data.length();i++)
        {
            output.write((byte)data.charAt(i));
        }
        output.close();
        System.out.println("Output Stream closed");
    }
}
