package controller;

import Files.UserManagement;
import Users.DaoUser;
import Users.User;
import java.io.IOException;
import view.Player;

/**
 *
 * @author Eduardo
 */
public class LoginController {
    private DaoUser banco;
    private UserManagement userManager;
    private User currentUser;
    private Player player;
    
    public LoginController() throws IOException{
        userManager = new UserManagement();
        banco = new DaoUser(userManager.getUsers());
    }

    public boolean login(User user) {
        if (user == null) {
            System.out.println("Entre usuario");
            return false;
        } else {
            User realUser = banco.buscar(user.getId());
            if (realUser != null
                    && user.getSenha().equals(realUser.getSenha())) {
                currentUser = realUser;
//                if (currentUser instanceof UsuarioVip) {
//                    telaPrincipal.getIsVip().setText("VIP");
//                } else {
//                    telaPrincipal.getIsVip().setText("Normal");
//                }
                return true;
            } else {
                System.out.println("Usuario nao encontrado");
                return false;
            }
        }
    }
}
