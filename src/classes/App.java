/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public long pauseLocation = 0;
    public long songTotalLength;

    public void Stop() {
        if (playing) {
            player.close();
            playing = false;
        }
    }

    public void PlayPause(String path) {
        if (playing == false) {
            try {
                if (pauseLocation == 0) {
                    FIS = new FileInputStream(path);
                    BIS = new BufferedInputStream(FIS);
                    player = new Player(BIS);
                    songTotalLength = FIS.available();
                    playing = true;
                }
                else{
                    FIS.skip(songTotalLength - pauseLocation);
                    playing = true;
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
                
                player.close();
                pauseLocation = FIS.available();
                playing = false;
            } catch (IOException ex) {

            }
        }

    }
}
