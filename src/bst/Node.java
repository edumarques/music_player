package bst;

import Users.User;

/**
 *
 * @author Eduardo
 *
 * Binary Search Tree Node
 */
public class Node {
    private User usuario;

    public Node(User usuario) {
        this.usuario = usuario;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
}
