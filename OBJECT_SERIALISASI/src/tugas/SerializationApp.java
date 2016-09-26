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
import java.util.ArrayList;
import java.util.List;
import java.io.*;


public class SerializationApp {
    
    static String nama_dpn;
    static String nama_blkg;
    static int umur;
    String choice;
    void inputData()throws IOException{
    
        BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Input Nama Depan : ");
        nama_dpn = dataIn.readLine();
        
        System.out.println(" Input Nama Belakang : ");
        nama_blkg=dataIn.readLine();
        
        System.out.println("Input umur: ");
        umur=Integer.parseInt(dataIn.readLine());
        
        
        
    }
    
    
    
    public static void main(String[] args) throws IOException {
        List<Participant>participants=new ArrayList<Participant>();
        
        
        SerializationApp in=new SerializationApp ();
        
        
        System.out.println("Input ");
        in.inputData();
        
        
        participants.add(new Participant(nama_dpn,nama_blkg,umur));
        
        
        
        
        
        System.out.println("Participants : "+participants);
        
        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "participantData.ser");
        
        System.out.println("Serialization Done");
        
        System.out.println("Deserilize Object");
        List<Participant>newList = demo.deserialize("participantData.ser");
        System.out.println("New List : "+newList);
    }
}
