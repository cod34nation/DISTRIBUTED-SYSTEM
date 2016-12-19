/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kriptografi;

/**
 *
 * @author AFRIZAL
 */
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
public class Crypto {
private static Cipher ciper=null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception{
        // TODO code application logic here
        
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DESede");
        keyGenerator.init(168);
        
        SecretKey secretKey =keyGenerator.generateKey();
        ciper =Cipher.getInstance("DESede");
        
        String plainText = "Kriptografi menggunakan Java cryptografi Extension";
        System.out.println("Sebelum encrpsi "+plainText);
        
        byte[]plainTextByte =plainText.getBytes("UTF8");
        byte[]encryptedBytes =encrypt(plainTextByte,secretKey);
        
        String encryptedText=new String(encryptedBytes,"UTF8");
        System.out.println("encrypted text after encryption \t "+encryptedText);
        
        
        byte[] decryptedBytes=decrypt(encryptedBytes,secretKey);
        String decryptedtext =new String (plainTextByte,"UTF8");
        System.out.println("Decrypted text after decryption\t:"+decryptedtext);
        System.out.println("");
        
    }
    
    static byte[]encrypt(byte[]plainTextByte,SecretKey secretKey) throws Exception{
        
        ciper.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[]encryptedBytes=ciper.doFinal(plainTextByte);
        return encryptedBytes;
    }
    
     static byte[]decrypt(byte[]encryptedBytes,SecretKey secretKey) throws Exception{
        
        ciper.init(Cipher.DECRYPT_MODE, secretKey);
        byte[]decryptedBytes=ciper.doFinal(encryptedBytes);
        return decryptedBytes;
    }
    
    
}
