package controller;

import Users.SimpleUser;
import Users.User;
import Users.VipUser;

/**
 *
 * @author Eduardo
 */
public class RegisterController {

    public User createUser(boolean isVip, int id, String senha) {
        if (isVip) {
            return new VipUser(id, senha);
        } else {
            return new SimpleUser(id, senha);
        }
    }
}
