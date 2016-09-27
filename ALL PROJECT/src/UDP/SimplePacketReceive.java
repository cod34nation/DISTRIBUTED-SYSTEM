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
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
public class SimplePacketReceive {
    public static void main(String[] args) throws SocketException,IOException {
        DatagramSocket socket=new DatagramSocket(2000);
        DatagramPacket packet = new DatagramPacket(new byte[256],256);
        socket.receive(packet);
        
        String message = new String(packet.getData(),0,packet.getLength());
        System.out.println(message);
        
    }
  
}
