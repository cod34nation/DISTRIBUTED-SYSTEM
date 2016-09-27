/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author LAB_TI
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.List;

public class controller {

    public void serialize(List<get_set> pList, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(pList);
            out.flush();

        } catch (IOException e) {
            System.out.println(" masalah " + e.getMessage());
        }

    }

    public List<get_set> deserialize(String fileName) {
        List<get_set> pList = null;

        try (
                ObjectInputStream in
                = new ObjectInputStream(new FileInputStream(fileName))) {
            pList = (List<get_set>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("aaaa"+ex.getMessage());

        }
        return pList;
    }
}
