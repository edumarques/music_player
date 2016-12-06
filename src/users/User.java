
package Users;

/**
 *
 * @author Tharles
 * 
 * Class for User
 */
public class User {
    private int id;
    private String senha;

    public User(int id, String senha) {
            this.id = id;
            this.senha = senha;
    }

    public int findSide(User user) {
        if (this.id < user.id) {
            return -1;
        }
        if (this.id > user.id) {
            return 1;
        }
        return 0;
    }

    public int getId() {
            return id;
    }

    public void setId(int id) {
            this.id = id;
    }

    public String getSenha() {
            return senha;
    }

    public void setSenha(String senha) {
            this.senha = senha;
    }
}
