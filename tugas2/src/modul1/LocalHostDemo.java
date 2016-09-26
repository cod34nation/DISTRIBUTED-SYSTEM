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
public class LocalHostDemo {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Looking up localhost ");
        InetAddress localAddress =InetAddress.getLocalHost();
        System.out.println("Name : "+localAddress.getHostName());
        System.out.println("IP Address : "+localAddress.getHostAddress());
        System.out.println(localAddress);
        
        try{
          System.out.print("Input Host Address : ");
        String ip = "127.0.0.1";
        System.out.println(" Hostname from ip \""+ip+"\":"+InetAddress.getByName(ip).getHostName());
        
          System.out.print("Input Host Name :");
        String host="jaringan03";
        System.out.println(" Host/IP : "+InetAddress.getByName(host)); 
        
         InetAddress ia=InetAddress.getByName(host);
           
           if(ia.isReachable(3000))
           {
               System.out.println(ia+" is reachable");
           }
           else{
               System.out.println(ia+"unreachable ");
           }
        
        }catch(Exception e)
        {
            System.out.println("Error");
        }
    }    
    
}