/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6_tugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import static modul5.no3_client.SERVICE_PORT;

/**
 *
 * @author ARIEF
 */
public class client_t_tcp {
    public static final int SERVICE_PORT =2999;
    public static void main(String[] args) {
                String hostname="localhost";
                String data;
        try {
            Socket daytime=new Socket(hostname, SERVICE_PORT);
            System.out.println("Connection Established");
             BufferedReader br=new BufferedReader(new InputStreamReader(daytime.getInputStream()));
             data=br.readLine();
             System.out.println(data);
             daytime.close();
        } catch (IOException ex) {
            System.out.println(ex+"    ");
        }
    }
}
