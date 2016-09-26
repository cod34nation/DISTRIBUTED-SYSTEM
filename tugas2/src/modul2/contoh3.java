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
public class contoh3 {
    public static void main(String[] args) {
        try{
            System.out.println("Please Enter Your name : ");
            
            InputStream input=System.in;
            InputStreamReader reader=new InputStreamReader(input);
            BufferedReader bfreader=new BufferedReader(reader);
            String nama=bfreader.readLine();
            System.out.println("Pleased to meet you "+nama);
            
    }catch(IOException e)
    {
        System.out.println(e);
    }
    }
}
