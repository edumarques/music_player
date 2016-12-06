
package Users;

import bst.Node;
import bst.Tree;
import java.util.ArrayList;

/**
 *
 * @author Tharles
 */
public class DaoUser {
    private Tree arvoreDeUsuarios;

    public DaoUser(Tree listaDeUsuarios) {
            this.arvoreDeUsuarios = listaDeUsuarios;
    }

    public DaoUser() {
            arvoreDeUsuarios = new Tree();
    }

    public DaoUser(ArrayList<User> userList) {
            arvoreDeUsuarios = new Tree();
            for (User u : userList)
                    arvoreDeUsuarios.insertUser(u);
    }

//    public boolean addUsuario (int id, String nome, String senha, boolean isVip) {
//        if (isVip) 
//            return arvoreDeUsuarios.insertUser(new VipUser(id, senha));
//        else
//            return arvoreDeUsuarios.insertUser(new SimpleUser(id, senha));
//    }

    public boolean addUsuario(User user) {
            return arvoreDeUsuarios.insertNode(new Node(user));
    }

    public boolean remove(int id) {
            return arvoreDeUsuarios.removeNode(id);
    }

    public User buscar (int id) {
        return arvoreDeUsuarios.search(id);
    }

    public void listar() {
            System.out.println("Usuários:");
            arvoreDeUsuarios.scrollThroughInOrder();
    }

}
