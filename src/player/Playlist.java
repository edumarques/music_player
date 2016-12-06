/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import java.util.ArrayList;

/**
 *
 * @author tharles
 */
public class Playlist {
    private String nome; 
    private ArrayList<Music> m;

    public Playlist(String nome, ArrayList<Music> musicas) {
            this.nome = nome;
            this.m = musicas;
    }

    public Playlist() {
            nome = "Default";
            m = new ArrayList<Music>();
    }

    public String getNome() {
            return nome;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }

    public void addMusic(Music musica) {
            m.add(musica); 
    }

    public boolean contains(Music mus) {
            return m.contains(mus);
    }

    public Music getMusic(int index) {
            if (index < 0 || index >= m.size())
                    return m.get(0);
            return m.get(index);
    }

    public void removeMusica(int index) {
            m.remove(index);
    }

    public void removeMusica(Music mus) {
            m.remove(mus);
    }

    public ArrayList<Music> getMusicas() {
            return m;
    }

    public void setMusicas(ArrayList<Music> musicas) {
            this.m = musicas;
    }

    public int getSize() {
            return this.m.size();
    }
}
