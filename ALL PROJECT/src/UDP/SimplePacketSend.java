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
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
public class SimplePacketSend {
    public static void main(String[] args) throws SocketException,UnknownHostException,IOException {
        
        DatagramSocket socket =new DatagramSocket();
        String message="Assalammu'alaikum";
        DatagramPacket packet = new DatagramPacket(message.getBytes(),message.length(),InetAddress.getLocalHost(),2000);
        socket.send(packet);
        socket.close();
    }   
    }

