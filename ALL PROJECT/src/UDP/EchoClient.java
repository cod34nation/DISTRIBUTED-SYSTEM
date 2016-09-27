/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDP;

/**
 *
 * @author LAB_TI
 */
import java.io.*;
import java.net.*;
public class EchoClient {
    public static final int SERVICE_PORT=7;
    public static final int BUFSIZE =256;
    
    public static void main(String[] args) throws SocketException,IOException{
        String hostname="localhost";
        InetAddress addr= InetAddress.getByName(hostname);
        DatagramSocket socket = new DatagramSocket();
        socket.setSoTimeout(2000);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(;;)
        { System.out.println("Write your Message here");
            String pesan=reader.readLine();
           
           
            ByteArrayOutputStream bout=new ByteArrayOutputStream(); //ByteArrayOutputStream bout = new ByteArrayOuputStream();
            PrintStream pout = new PrintStream(bout);
            pout.print(pesan);
            if(pesan.equals("EXIT")||pesan.equals("exit"))
               {
                   System.exit(0);
               }
            
            byte[] barray = bout.toByteArray();
            
            DatagramPacket packet=new DatagramPacket(barray,barray.length,addr,SERVICE_PORT);
            System.out.println("Sending packet to "+hostname);
            socket.send(packet);
            
            System.out.println("Writing for packet .. ");
            byte[] recbuf = new byte[BUFSIZE];
           DatagramPacket receivePacket = new DatagramPacket(recbuf,BUFSIZE);
           boolean timeout=false;
           try{
               socket.receive(receivePacket);
               
           }catch(InterruptedIOException a)
           {
               timeout=true;
           }
           if(!timeout)
           {
               System.out.println("Packet received");
               System.out.println("Details : "+receivePacket.getAddress());
               ByteArrayInputStream bin=new ByteArrayInputStream(
               receivePacket.getData(),0,receivePacket.getLength());
               
               BufferedReader reader2= new BufferedReader(new InputStreamReader(bin));
               String input=reader2.readLine();
              
              
           }
           else{
               System.out.println("Packet lost");
           }
        }
    }
}
