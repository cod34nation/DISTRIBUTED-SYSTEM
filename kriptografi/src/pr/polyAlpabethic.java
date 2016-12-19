/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr;

/**
 *
 * @author AFRIZAL
 */
public class polyAlpabethic {
    
    public static String encrypt(String text,final String key)
    {
        String res="";
        text = text.toUpperCase();
        for(int i =0,j=0;i<text.length();i++){
        
        char c=text.charAt(i);
        if(c<'A'||c>'Z')
            continue;
            res+=(char)((c+key.charAt(j)-2*'A')%26+'A');
            j=++j%key.length();
            
        
        }
        return res;
    }
    
    public static String decryp(String text,final String key){
        
        String res="";
        text = text.toUpperCase();
        for(int i=0,j=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c<'A'||c>'Z')
                 continue;
                res+=(char)((c-key.charAt(j)+26)%26+'A');
                j=++j%key.length();
               
                
            
        }
        return res;
    }
    public static void main(String[] args) {
        String key ="MALANG";
        String pesan="AFRIZALSETYO";
        String encryptedMSG=encrypt(pesan, key);
        System.out.println("String : "+pesan);
        System.out.println("Pesan encripsi : "+encryptedMSG );
        System.out.println("Pesan setelah dekripsi : "+decryp(encryptedMSG, key));
        
        int a =20,b=26,c;
        c= 6%26;
        System.out.println("Modulo "+c);
        
        String text="ABC";
        char cd=text.charAt(1);
        System.out.println(cd);
        
    }
  
}
