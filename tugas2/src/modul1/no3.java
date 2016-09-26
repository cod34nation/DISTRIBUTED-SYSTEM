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
import java.lang.SecurityException;

public class no3 {
    public static void main(String[] args) throws UnknownHostException  {
           
       InetAddress var[]=InetAddress.getAllByName("localhost");
       for(int a=0 ;a<var.length;a++)
       {
           System.out.println(" Address ke"+i +" Hostname nya : "+var[a]);
       }

    }
}
