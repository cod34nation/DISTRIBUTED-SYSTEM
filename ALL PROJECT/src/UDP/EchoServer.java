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
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EchoServer {

    public static final int SERVICE_PORT = 7;
    public static final int BUFSIZE = 4090;

    private DatagramSocket socket;

    public EchoServer() {
        try {

            socket = new DatagramSocket(SERVICE_PORT);
            System.out.println("Server active on poert " + socket.getLocalPort());
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
    }
    
    public void serviceClient(){
        byte[]buffer = new byte[BUFSIZE];
        for(;;){
            try{
                DatagramPacket packet = new DatagramPacket(buffer,BUFSIZE);
                socket.receive(packet);
                System.out.println("Packet received from "
                +packet.getAddress()+": "
                +packet.getPort()
                +" of length "+packet.getLength());
                socket.send(packet);
            }catch(IOException ioe)
            {
                System.out.println("Error : "+ioe);
            }
             
        }
   
    }

    public static void main(String[] args) {
        
        EchoServer server =new EchoServer();
        server.serviceClient();
    }

}
