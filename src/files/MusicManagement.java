
package Files;

import Player.Music;
import Player.Playlist;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Tharles
 */
public class MusicManagement {
    private Repository f;
    private Playlist playlist;

    public MusicManagement() throws IOException {
        f = new Repository();
        playlist = new Playlist();

        ArrayList<String> temp = null;
        temp = f.read("./playlist.dat");

        for (int i = 0; i < temp.size(); i += 2) {
            playlist.addMusic(new Music(temp.get(i), temp.get(i+1)));
        }      
    }

    public void InsertMusic(Music music) throws IOException { 
        ArrayList<String> temp = new ArrayList<String>();
        temp.add(music.getPath());
        temp.add(music.getFilename());
        f.write("./playlist.dat", temp, true);
        playlist.addMusic(music);
    }

    public void setNewPlaylist(Playlist pl) throws IOException {
            playlist = pl;
            ArrayList<String> temp = new ArrayList<String>();
            for (Music music : pl.getMusicas()) {
                temp.add(music.getPath());
                temp.add(music.getFilename());
            }
            f.write("./playlist_padrao.dat", temp, false);
            
    }

    public void removeMusic(Music music) throws IOException {
            if (playlist.contains(music)) {
                playlist.removeMusica(music);
                ArrayList<String> temp = new ArrayList<String>();
                for (Music m : playlist.getMusicas()) {
                    temp.add(m.getPath());
                    temp.add(m.getFilename());
                }
                f.write("./playlist.dat", temp, false);

            }
    }

    public Playlist getPlaylist() {
            return playlist;
    }

    public void clear() throws IOException {
        playlist.getMusicas().clear();
        f.write("./playlist.dat", new ArrayList<String>(), false);

    }  
}
