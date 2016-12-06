
package Users;

import Player.Playlist;
import java.util.ArrayList;


/**
 *
 * @author Tharles
 * 
 * Class for VIP User
 */

public class VipUser extends User{
    private ArrayList<Playlist> playlists;


    public VipUser(ArrayList<Playlist> playlists, int id, String senha) {
        super(id,senha);
        this.playlists = playlists;
    }

    public VipUser(int id, String senha) {
        super(id, senha);
    }
    
    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }
}
