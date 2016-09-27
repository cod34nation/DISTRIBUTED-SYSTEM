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
import  java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Main implements Serializable{

    private String firtsName;
    private String lastName;
    private int age;
    /**
     * @param args the command line arguments
     */
    
    
    public Main(String firstName,String lastName,int age) {
        
         this.firtsName=firstName;
         this.lastName=lastName;
         this.age=age;
        
        
    }
    
    public void printData()
    {
        System.out.println("Nama \t : " +firtsName+ " " +lastName+"");
        System.out.println("Usia : "+age);
        
    }
    
    public void saveObject( Main obj)
    {
        try{
         FileOutputStream fos=new FileOutputStream("data.ser");
         ObjectOutputStream oos=new ObjectOutputStream(fos);
         oos.writeObject(obj);
         fos.close();
        }catch(IOException e)
        {
            System.out.println("Error "+e);
        }
        
    }
    
    public void readObject( Main obj) throws ClassNotFoundException
    {
        try{
            FileInputStream fis=new FileInputStream("data.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            obj =(Main) ois.readObject();
            obj.printData();
            fis.close();
        }catch(IOException e ){
            System.out.println("Error "+e);
        }
    }
    
    
    

    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        
        Main is=new Main("afrizal ","setyo",22);
        is.saveObject(is);
        is.readObject(is);
    }
    
}
