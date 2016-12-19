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
public class dokter extends Thread{
    int hit;
    public static int count=0;
    public dokter(int num){
        hit=num;
    }
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println("Pasien ke-"+hit+" Diperiksa Dokter");
            count++;
            if(count==10){
                System.out.println("Dokter Sudah Memerikas "+count+" Pasien");
            }
        }catch(InterruptedException ie){
            System.out.println("Not Finish");
        }
    }
}
