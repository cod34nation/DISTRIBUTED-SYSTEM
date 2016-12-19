/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6_tugas;

import java.io.IOException;

/**
 *
 * @author ARIEF
 */
public class no2 extends Thread{
//    int no;
//    public no2(int num){
//        no=num;
//    }
    
    public static void main(String[] args) throws IOException {
        System.out.println("Dokter Memeriksa Pasien...................................");
        for (int i = 1; i <=10; i++) {
            Thread d=new dokter(i);
            d.start();
        }
        //System.in.read();
        System.out.println("Perawat 1 Merawat Pasien..................................");
        for (int i = 1; i <=5; i++) {
            Thread p1=new perawat_1(i);
            p1.start();
        }
        //System.in.read();
        System.out.println("Perawat 2 Merawat Pasien..................................");
        for (int i = 6; i <=10; i++) {
            Thread p2=new perawat_2(i);
            p2.start();
        }
        //System.in.read();
        System.out.println("Pasien Membayar Ke Kasir...................................");
        for (int i = 1; i <=10; i++) {
            Thread k=new kasir(i);
            k.start();
        }
    }
}
