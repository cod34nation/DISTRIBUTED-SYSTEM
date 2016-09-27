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
import javax.swing.JOptionPane;

public class PacketSendDemo {
    public static void main(String[] args) {
        System.out.println(" Packet Send \n=======");
        String hostname="localhost";
        
        System.out.println("Binding to a local port");
        
        try(DatagramSocket socket = new DatagramSocket())
        {
            for(;;){
            String input =JOptionPane.showInputDialog(null,"Input Pesan");
            System.out.println("Bound to local port "+socket.getLocalPort());
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream pout = new PrintStream(bout);
            pout.printf(input);
            byte[]barray = bout.toByteArray();
            
            DatagramPacket packet = new DatagramPacket(barray,barray.length);
            
            System.out.println("Looking up hostname"+hostname);
            InetAddress remote_adr =InetAddress.getByName(hostname);
            System.out.println("Hostname resolved as "+remote_adr.getHostAddress());
            packet.setAddress(remote_adr);
            packet.setPort(2000);
            socket.send(packet);
            System.out.println("Packet Sent!");
            }
            
        }catch(SocketException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }catch(IOException ex)
        {
            System.out.println("Error "+ex.getMessage());
        }
        
    }
}
