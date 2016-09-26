/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

/**
 *
 * @author LAB_TI
 */
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.*;
import javax.swing.*;
public class no2 {
    
    public static void main(String[] args) throws UnknownHostException  {
       BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
       try{
           
        System.out.print("Cari berdasarkan alamat atau nama host???? ketik 1 jika alamat ketik 2 jika nama ");
        
        String pilihan =dataIn.readLine();
        
        if(pilihan.equals("1"))
            
        
        {
        System.out.print("Input Host Address : ");
        String ip = dataIn.readLine();
        System.out.println(" Hostname from ip \""+ip+"\":"+InetAddress.getByName(ip).getHostName());
           
        
          System.out.println("Cek Koneksi ");
           
           
           InetAddress ia=InetAddress.getByName(ip);
           
           if(ia.isReachable(3000))
           {
               System.out.println(ia+" is reachable");
           }
           else{
               System.out.println(ia+"unreachable ");
           }
        }
        
        else{
            
        
        System.out.print("Input Host Name :");
        String host=dataIn.readLine();
        System.out.println(" Host/IP : "+InetAddress.getByName(host)); 
        
         System.out.println("Cek Koneksi ");
           
           
           InetAddress ia=InetAddress.getByName(host);
           
           if(ia.isReachable(3000))
           {
               System.out.println(ia+" is reachable");
           }
           else{
               System.out.println(ia+"unreachable ");
           }
        }
        
        
         
        
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       
       
    }
    
}
