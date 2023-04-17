
package com.porfolio.backEnd.controller;

import com.porfolio.backEnd.model.Users;
import com.porfolio.backEnd.service.IUsersService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JAMES
 */
@RestController
public class UsersController {
    @Autowired
    private IUsersService userServ;
    
    @GetMapping ("/users/list")
    public List<Users> getUsers(){
        return userServ.getUsers();
    }
    
    @PostMapping ("/users/new")
    public String createUser(@RequestBody Users user){
        userServ.createUser(user);
        return "El usuario fue creado correctamente";
    }
    
}
