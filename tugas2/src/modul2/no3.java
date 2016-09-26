/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 *
 * @author LAB_TI
 */

public class no3 {

private String data ;

void prosesWriteData(String dest) throws FileNotFoundException,IOException
{
this.data=dest;
String destination ="d:/no3.txt";
OutputStream output=new FileOutputStream(destination);


 
   
        for(int i=0;i<data.length();i++)
        {
            output.write((byte)data.charAt(i));
        }
        output.close();
        System.out.println("Output Stream closed");
    }



    public static void main(String[] args) throws FileNotFoundException,IOException {
         no3 p=new no3();
         System.out.println("Please Enter Your name : ");
            
            InputStream input=System.in;
            InputStreamReader reader=new InputStreamReader(input);
            BufferedReader bfreader=new BufferedReader(reader);
            String text=bfreader.readLine();
            System.out.println("Pleased to meet you "+text);
        
         p.prosesWriteData(text);
    }
}







