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
public class Modulo26Crypto {
    public static void main(String[] args) {
        String plainText = "AFRIZAL";
        String secretKey = "MALANGKOTA";
        
        System.out.println("Plain text before Excryption\t: "+plainText);
        String encryptedText=encrypted(plainText, secretKey) ;
        System.out.println("Encrypted Text after encryption\t:"+encryptedText);
        String decryptedText=decryp(encryptedText, secretKey);
        System.out.println("Decrypted text after descryption\t:"+decryptedText);
        
        
        
        
    }
    
    private static String encrypted(String plainText,String secreatKey){
        StringBuilder encryptedString = new StringBuilder();
        int encryptedInt;
        for(int i=0;i<plainText.length();i++){
            int plainTextInt = (int) (plainText.charAt(i)-'A');
            int secretKeyInt =(int)(secreatKey.charAt(i)-'A');
            encryptedInt=(plainTextInt+secretKeyInt)%26;
            encryptedString.append((char)((encryptedInt)+(int)'A'));
            
        }
         return encryptedString.toString();
       
 
   }
    
    private static String decryp(String decryptedText,String secreatKey){
       StringBuilder decryptedString = new StringBuilder();
        int decryptedInt;
        for(int i=0;i<decryptedText.length();i++){
            int decryptedTextInt = (int) (decryptedText.charAt(i)-'A');
            int secretKeyInt =(int)(secreatKey.charAt(i)-'A');
            decryptedInt= decryptedTextInt-secretKeyInt%26;
            if(decryptedInt<0){
                decryptedInt+=26;
           
            
        }
            decryptedString.append((char)((decryptedInt)+(int)'A'));
         
       
    }
return decryptedString.toString();}
}