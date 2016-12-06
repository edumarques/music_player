
package controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Eduardo
 * 
 * Player Controller
 */
public class PlayerController {
    private FileInputStream FIS;
    private BufferedInputStream BIS;
    private Player player;
    private boolean playing;
    private boolean first;
    private long pauseLocation;
    private long songTotalLength;
    private String fileName;
    private List<String> songLocationList;
    private List<String> songNameList;

    public boolean isPlaying() {
        return this.playing;
    }

    public List<String> getSongLocationList() {
        return this.songLocationList;
    }

    public List<String> getSongNameList() {
        return songNameList;
    }
    
    public PlayerController(){
        this.playing = false;
        this.first = true;
        this.songLocationList = new ArrayList<String>();
        this.songNameList = new ArrayList<String>();
    }

    public void Stop() {
            this.player.close();
            this.playing = false;
            this.first = true;
            this.pauseLocation = 0;
            this.songTotalLength = 0;
    }

    public void PlayPause(String path) {
        if (this.playing == false) {
            try {
                this.FIS = new FileInputStream(path);
                this.BIS = new BufferedInputStream(this.FIS);
                this.player = new Player(this.BIS);
                this.playing = true;
                if (this.first) {
                    this.songTotalLength = this.FIS.available();
                    this.first = false;
                } else {
                    this.FIS.skip(this.songTotalLength - this.pauseLocation);
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
                this.pauseLocation = this.FIS.available();
                this.player.close();
                this.playing = false;
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
            this.songLocationList.add(myFile + "");
            String name = chooser.getSelectedFile().getName();
            this.songNameList.add(name);
            return this.fileName;
        }else{
            return null;
        }
    }
    
    public String addDirectory(){
        FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 Files", "mp3", "mpeg3");
        JFileChooser chooser = new JFileChooser("C:\\Users\\Eduardo\\Desktop\\Musicas");
        chooser.addChoosableFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(null);
        
        if (returnVal == JFileChooser.APPROVE_OPTION){
            File myFile = chooser.getSelectedFile();
            this.songLocationList.add(myFile + "");
            String name = chooser.getSelectedFile().getName();
            this.songNameList.add(name);
            return this.fileName;
        }else{
            return null;
        }
    }
}
