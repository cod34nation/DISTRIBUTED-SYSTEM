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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB_TI
 */
import java.io.Serializable;
public class get_set implements Serializable {
    private final String nama;
    private final String nim;
    private final String jurusan;
    private final String asal;

    public get_set(String nama, String nim,String jurusan,String asal) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan=jurusan;
        this.asal=asal;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
        
    }

    public String asal(){
        return asal;
    }
    
    @Override
    public String toString() {
        return "Nama :" + nama + ", \n NIM :" + nim+ ", \n Jurusan :" + jurusan+ 
                "\n Asal : "+asal+"";
    }
    
    
    
    
    
}
