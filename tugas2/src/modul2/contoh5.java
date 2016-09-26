/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author LAB_TI
 */
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class contoh5 {
    public static void main(String[] args) {
     Image image=null;
    try{
    File sourceimage =new File("d:/images.jpg");
    image = ImageIO.read(sourceimage); 
    InputStream is=new BufferedInputStream(new FileInputStream("d:/images.jpg"));
     image = ImageIO.read(is); 
    
    }catch(IOException e)
    {
        
    }
    
    JFrame frame=new JFrame();
    JLabel label =new JLabel(new ImageIcon(image));
    frame.getContentPane().add(label,BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
}}


