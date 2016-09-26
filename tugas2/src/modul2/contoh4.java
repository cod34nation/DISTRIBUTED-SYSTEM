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
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
public class contoh4 {
    public static void main(String[] args) {
        try{
        OutputStream out=System.out;
        OutputStreamWriter writer= new OutputStreamWriter(out);
     
        writer.write("Jomblo");
        writer.flush();
        writer.close();
        }catch(IOException c)
        {
            
        }
    }
    
}
