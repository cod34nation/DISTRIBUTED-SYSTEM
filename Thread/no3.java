/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6_tugas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ARIEF
 */
public class no3 extends Thread{
    static boolean num=false;
    @Override
    public void run(){
        int count = 0;
        for(;;){
            try {
                Thread.sleep(500);
                if(!num){
                    count+=2;
                    System.out.print(count+" ");
                }else if(num){
                    count--;
                    if(count%2==1){
                        System.out.print(count+" ");
                    }
                    if(count==1){
                        System.exit(0);
                    }
                }
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        Thread t1=new no3();
        t1.start();
        System.out.println("Enter   1");
        System.in.read();
        num=true;
        System.out.println("\nEnter    2");
        System.in.read();
        t1.stop();
    }
}
