/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Eduardo
 */
public class App {

    FileInputStream FIS;
    BufferedInputStream BIS;

    public Player player;
    public boolean playing = false;
    public boolean first = true;
    public long pauseLocation;
    public long songTotalLength;
    
    public String fileName;
    
    public List<String> songLocationList = new ArrayList<String>();
    public List<String> songNameList = new ArrayList<String>();

    public void Stop() {
            player.close();
            playing = false;
            first = true;
            pauseLocation = 0;
            songTotalLength = 0;
    }

    public void PlayPause(String path) {
        if (playing == false) {
            try {
                FIS = new FileInputStream(path);
                BIS = new BufferedInputStream(FIS);
                player = new Player(BIS);
                playing = true;
                if (first) {
                    songTotalLength = FIS.available();
                    first = false;
                } else {
                    FIS.skip(songTotalLength - pauseLocation);
                }
            } catch (FileNotFoundException | JavaLayerException ex) {

            } catch (IOException ex) {

            }
            new Thread() {
                @Override
                public void run() {
                    try {
                        player.play();
                    } catch (JavaLayerException ex) {

                    }
                }
            }.start();
        } else {
            try {
                pauseLocation = FIS.available();
                player.close();
                playing = false;
            } catch (IOException ex) {

            }
        }

    }
    
    public String addFile(){
        FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 Files", "mp3", "mpeg3");
        JFileChooser chooser = new JFileChooser("C:\\Users\\Eduardo\\Desktop\\Musicas");
        chooser.addChoosableFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(null);
        
        if (returnVal == JFileChooser.APPROVE_OPTION){
            File myFile = chooser.getSelectedFile();
            songLocationList.add(myFile + "");
            String name = chooser.getSelectedFile().getName();
            songNameList.add(name);
            return fileName;
        }else{
            return null;
        }
    }
}
