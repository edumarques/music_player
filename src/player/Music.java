package Player;

/**
 *
 * @author Tharles
 */
public class Music {

    private String path;
    private String name;

    public Music(String path, String name) {
        this.path = path;
        this.setFilename(name);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String name() {
        return name;
    }

    public String getFilename() {
        return name;
    }

    public void setFilename(String name) {
        this.name = name;
    }
}
