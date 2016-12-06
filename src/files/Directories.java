package Files;

import Player.Music;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Tharles
 */
public class Directories {

    private Repository fm;
    private ArrayList<String> directories;

    public Directories() throws IOException {
        fm = new Repository();
        this.directories = fm.read("./directories.dat");
    }

    public void addDirectory(String path) throws IOException {

        ArrayList<String> temp = new ArrayList<String>();
        temp.add(path);
        fm.write("./directories.dat", temp, true);
        directories.add(path);
    }

    public void removeDirectory(String path) throws IOException {
        directories.remove(path);
        fm.write("./diretorios.dat", directories, false);
    }

    public ArrayList<Music> getValidFiles() {
        ArrayList<Music> m = new ArrayList<Music>();
        for (String path : directories) {
            m.addAll(getValidFiles(path));
        }
        return m;
    }

    private ArrayList<Music> getValidFiles(String path) {
        ArrayList<Music> m = new ArrayList<Music>();
        ArrayList<File> files = fm.listFiles(path);
        for (File f : files) {
            if (f.getName().length() > 4 && f.getName().substring(f.getName().length() - 4).equals(".mp3")) {
                m.add(new Music(f.getAbsolutePath(), f.getName()));
            }
        }

        return m;
    }

}
