
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
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class contoh6 {
    public static void main(String[] args) throws Exception {
        String audioFile ="d:/bubbles.wav";
        InputStream in =new FileInputStream(audioFile);
        AudioStream audioStream=new AudioStream(in);
        AudioPlayer.player.start(audioStream);
    }
}
