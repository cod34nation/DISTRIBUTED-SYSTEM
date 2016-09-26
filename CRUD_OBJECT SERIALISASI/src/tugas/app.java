/*=
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author LAB_TI
 */
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import javax.swing.*;

public class app {

    String nama;
    String nim;
    String jurusan;
    String asal;
    List<get_set> participants;
    controller con = new controller();

    void inputData() throws IOException {

        nama = JOptionPane.showInputDialog("Nama ");
        nim = JOptionPane.showInputDialog("NIM");
        jurusan = JOptionPane.showInputDialog("Jurusan");
        asal = JOptionPane.showInputDialog("Asal");

        String simpan = JOptionPane.showInputDialog("Simpan ? Y/T");
        if (simpan.equals("y")) {
            simpanData();
            JOptionPane.showMessageDialog(null, "Saving Done");
            action();
        } else {
            System.exit(0);
        }

    }

    void deleteData() throws IOException {

        File file = new File("data mah.txt");

        file.delete();
        JOptionPane.showMessageDialog(null, "Data Terhapus");

    }

    void simpanData() {
        controller con = new controller();
        participants = new ArrayList<get_set>();
        participants.add(new get_set(nama, nim, jurusan, asal));

        con.serialize(participants, "data mah.txt");

    }

    void viewData() throws IOException {

        
        System.out.println("Deserilize Object");
        participants = con.deserialize("data mah.txt");
        JOptionPane.showMessageDialog(null,  "\n =========\n" + participants);
    }

    void update() {
        List<get_set> newList = con.deserialize("data mah.txt");
        get_set aaa = newList.get(0);
        nama = JOptionPane.showInputDialog("Nama ");
        nim = JOptionPane.showInputDialog("NIM");
        jurusan = JOptionPane.showInputDialog("Jurusan");
        asal = JOptionPane.showInputDialog("Asal");
        participants.remove(aaa);
        participants.add(aaa);

    }

    void action() throws IOException {

        String action = JOptionPane.showInputDialog(null, "Form Input  Mahasiswa "
                + "\n Pilih untuk action berikut jika "
                + ": \n 1.Input Data \n 2.Update Data "
                + "\n 3.Delete \n 4.View Data  \n 5.Close ");

        if (action.equals("1")) {
            inputData();
        } else if (action.equals("4")) {
            viewData();
        } else if (action.equals("3")) {
            deleteData();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) throws IOException {

        app in = new app();

        in.action();

    }
}
