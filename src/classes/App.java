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
    public boolean first = true;
    public long pauseLocation;
    public long songTotalLength;

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
                System.out.println("entrou if (playing false)");
                FIS = new FileInputStream(path);
                BIS = new BufferedInputStream(FIS);
                player = new Player(BIS);
                playing = true;
                if (first) {
                    System.out.println("entrou if (first true)");
                    songTotalLength = FIS.available();
                    first = false;
                } else {
                    System.out.println("entrou else (first false)");
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
                System.out.println("entrou else (playing true)");
                pauseLocation = FIS.available();
                player.close();
                playing = false;
            } catch (IOException ex) {

            }
        }

    }
}
