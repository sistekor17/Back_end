
package com.porfolio.backEnd.service;

import com.porfolio.backEnd.model.Users;
import java.util.List;

/**
 *
 * @author JAMES
 */
//implementacion de usuario
public interface IUsersService {
    public List<Users> getUsers();
    
    public void createUser(Users user);
    
    public void deleteUser (long id);
   
    public Users searchUser (long id);
    
    
    
    
}
