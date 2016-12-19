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
public class kasir extends Thread{
    int hit;
    public static int count;
    public kasir(int num){
        hit=num;
    }
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println("Pasien ke-"+hit+" Membayar Ke Kasir");
            count++;
            if(count==10){
                System.out.println(count+" Pasien Sudah Membayar Pada Kasir"); 
            }
        }catch(InterruptedException ie){
            System.out.println("Not Finish");
        }
    }
}
