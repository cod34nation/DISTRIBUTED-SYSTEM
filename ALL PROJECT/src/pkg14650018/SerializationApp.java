/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14650018;

/**
 *
 * @author LAB_TI
 */
import java.util.ArrayList;
import java.util.List;
public class SerializationApp {
    public static void main(String[] args) {
        List<Participant>participants=new ArrayList<Participant>();
        participants.add(new Participant("dee","aja",22));
        participants.add(new Participant("aa","aja",24));
        participants.add(new Participant("ee","aa",22));
        
        System.out.println("Participants : "+participants);
        
        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "participantData.ser");
        
        System.out.println("Serialization Done");
        
        System.out.println("Deserilize Object");
        List<Participant>newList = demo.deserialize("participantData.ser");
        System.out.println("New List : "+newList);
    }
}
