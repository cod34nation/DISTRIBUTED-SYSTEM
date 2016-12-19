/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6_tugas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ARIEF
 */
public class no1 extends Thread {

    int count;
    String name;
    public static int ar1[] = {6, 9, 1, 2, 3, 5};
    public static int ar2[] = {7, 11, 6, 4, 3, 1};
    public static int ar3[] = {5, 4, 3, 2, 1, 12};
    public static int hasil[] = new int[ar1.length];
    public static int total, hit;

    public no1(int num) {
        count = num;
    }

    public void run() {
        try {
            Thread.sleep(500);
            //for (int i = 0; i <=hasil.length; i++) {
            if (count <= hasil.length) {
                hasil[count - 1] = ar1[count - 1] + ar2[count - 1] + ar3[count - 1];
                System.out.println("Index-" + (count - 1) + " = " + hasil[count - 1]);
                total += hasil[count - 1];
                hit++;
                if (hit == 6) {
                    System.out.println("Total = " + total);
                }
            }
            //}
        } catch (InterruptedException ex) {

        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < ar1.length; j++) {
            System.out.print(ar1[j] + "\t");
        }
        System.out.println("");
        for (int j = 0; j < ar2.length; j++) {
            System.out.print(ar2[j] + "\t");
        }
        System.out.println("");
        for (int j = 0; j < ar3.length; j++) {
            System.out.print(ar3[j] + "\t");
        }
        System.out.println("");
        System.out.println("Hasil=======================================================+");
        for (int i = 1; i <= 6; i++) {
            Thread t1 = new no1(i);
            t1.start();
        }

    }
}
