/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author LAB_TI
 */
 import java.io.*;

public class no4 {
    int angka = 1;
   void proses_input() throws IOException
{

    System.out.println("Masukkan text dan klik exit untuk keluar");
    
            InputStream input=System.in;
            InputStreamReader reader=new InputStreamReader(input);
            BufferedReader bfreader=new BufferedReader(reader);
            
    
            String text1=bfreader.readLine();
            System.out.println(angka+". Anda menulis "+text1);
            
            if(text1.equals("exit"))
            {
                System.out.println("Anda Telah Keluar");
                System.exit(0);
               
            }
            else{
             angka+=1;
             proses_input();
             
            }
     
}

    public static void main(String[] args) throws IOException {
       no4 p=new no4();
       
       p.proses_input();
    }
}


