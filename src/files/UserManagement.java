/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import Users.SimpleUser;
import Users.User;
import Users.VipUser;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author tharles
 */
public class UserManagement {
    private Repository r;
    private ArrayList<User> users;

    public UserManagement() throws IOException {
        r = new Repository();
        users = new ArrayList<User>();
        ArrayList<String> temp = null;
           
        temp = r.read("./users.dat");
            
        for (int i = 0; i < temp.size(); i += 4) {
            if (temp.get(i).equals("VIP")) {
                users.add(new VipUser(Integer.parseInt(temp.get(i+1)),
                temp.get(i+2)));
            } else {
                users.add(new SimpleUser(Integer.parseInt(temp.get(i+1)),
                temp.get(i+2)));
            }
        }

        // Se vazio, adiciona o admin
        if (users.isEmpty()) {
            insertUser(new VipUser(0, "admin"));
        }
        
    }


    public void insertUser(User user) throws IOException {

           
        ArrayList<String> temp = new ArrayList<String>();
        if (user instanceof VipUser)
                temp.add("VIP");
        else
            temp.add("Not VIP");
            temp.add(String.valueOf(user.getId()));
            temp.add(user.getSenha());
        
        r.write("./users.dat", temp, true);
        users.add(user);
    }

    public void removeUsuario(User user) throws IOException {
            
            users.remove(user);
            ArrayList<String> temp = new ArrayList<String>();
            for (User u : users) {
                    if (u instanceof VipUser)
                            temp.add("VIP");
                    else
                            temp.add("Not VIP");
                    temp.add(String.valueOf(u.getId()));
                    temp.add(u.getSenha());
            }
            r.write("./users.dat", temp, false);
    } 
       
    public ArrayList<User> getUsers() {
            return users;
    }
}
