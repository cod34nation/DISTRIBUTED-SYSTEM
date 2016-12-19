/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6_tugas;

/**
 *
 * @author ARIEF
 */
public class perawat_1 extends Thread{
    int hit;
    public static int count;
    public perawat_1(int num){
        hit=num;
    }
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println("Pasien ke-"+hit+" DiRawat Perawat 1");
            count++;
            if(count==5){
                System.out.println("Perawat 1 Sudah Merawat "+count+" Pasien"); 
            }
        }catch(InterruptedException ie){
            System.out.println("Not Finish");
        }
    }
}
