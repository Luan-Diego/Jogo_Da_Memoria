/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.event.KeyEvent;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Som {    
    
    public static int nromusic;
    public static String nome;
    public static String statusmusica = "tocando";
       
    public static final File fund0 = new File("build/classes/musics/outer0.wav");
    public static final File fund1 = new File("build/classes/musics/outer1.wav");
    
    public static Clip tocando;
        
    public static void tocarmusica(File musica){
        
        try{
            
            tocando = AudioSystem.getClip();
            tocando.open(AudioSystem.getAudioInputStream(musica));
            tocando.start();
            
        }catch(Exception e){
            
        }

    }
    
    public static void pausarmusica(){
        
        try{
            
            tocando.stop();
            
        }catch(Exception e){
            
        }

    }
    
}


