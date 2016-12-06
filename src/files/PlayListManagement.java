
package Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import Files.Repository;
import Player.Playlist;
import Users.User;
import Users.VipUser;


/**
 *
 * @author tharles
 */
public class PlayListManagement {
    private Repository r;
    private ArrayList<String> holder;
    private ArrayList<Playlist> playlists;
    private int playlistCounter = 0;
    public PlayListManagement() {
            r = new Repository();
            holder = new ArrayList<String>();
            playlists = new ArrayList<Playlist>();

            //loadPlaylists();
    }

//    public void loadPlaylists() throws IOException {
//        ArrayList<File> temp = r.listFiles("./playlists/");
//        for (File f : temp)
//            loadPlaylist(f);
//    }

//    private void loadPlaylist(File f) throws IOException {
//        ArrayList<String> read = null;
//        read = r.read(f.getAbsolutePath());
//
//        int playlistCode = Integer.parseInt(f.getName().substring(f.getName().length()-6, f.getName().length()-3));
//        if (playlistCode >= playlistCounter)
//                playlistCounter = playlistCode + 1;
//
//
//        Playlist pl = new Playlist();
//        holder.add(read.get(0));
//        pl.setNome(read.get(1));
//        for (int i = 2; i < read.size(); i += 2)
//            pl.addMusic(new Music(read.get(i), read.get(i+1)));
//
//        playlistNumber.put(pl.getNome(), playlistCode);
//        playlists.add(pl);
//    }

//    public void addPlaylist(Playlist pl, Usuario owner) {
//            ArrayList<String> temp = new ArrayList<String>();
//            temp.add(owner.getNome() + " - " + owner.getId());
//            temp.add(pl.getNome());
//            ArrayList<Musica> musicas = pl.getMusicas();
//            for (Musica m : musicas) {
//                    temp.add(m.getPath());
//                    temp.add(m.getFilename());
//            }
//
//            int number;
//            if (playlistNumber.containsKey(pl.getNome())) {
//                    for (Playlist tempPl : playlists) {
//                            if (tempPl.getNome().equals(pl.getNome())) {
//                                    playlists.remove(tempPl);
//                                    playlists.add(pl);
//                                    break;
//                            }
//                    }
//                    number = playlistNumber.get(pl.getNome());
//            } else {
//                    playlists.add(pl);
//                    ownerData.add(owner.getNome() + " - " + owner.getId());
//                    number = playlistCounter++;
//            }
//            try {
//                    fm.write("./playlists/" + String.format("%03d", number) + ".pl", temp, false);
//                    playlistNumber.put(pl.getNome(), number);
//            } catch (IOException e) {
//                    e.printStackTrace();
//            }
//    }

    public ArrayList<Playlist> getPlaylists() {
            return playlists;
    }

    public void setPlaylistsToUsers(UserManagement userReader) {
        ArrayList<User> users = userReader.getUsers();
        VipUser temp = null;
        for (User user : users) {
            if (user instanceof VipUser) {
                temp = (VipUser) user;
                for (int i = 0; i < playlists.size(); i++)
                    if (holder.get(i).equals(user.getId()))
                        temp.addPlaylist(playlists.get(i));
            }
        }
    }
}

