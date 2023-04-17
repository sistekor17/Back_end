/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.backEnd.service;

import com.porfolio.backEnd.model.Users;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.backEnd.repository.UsersRepository;

/**
 *
 * @author JAMES
 */
@Service
public class UserService implements IUsersService {
    
    @Autowired
    private UsersRepository userRepository;
    
    @Override
    public List<Users> getUsers() {
        List<Users> listUsers = userRepository.findAll();
        return listUsers;
    }

    @Override
    public void createUser(Users user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Users searchUser(long id) {
        Users usu = userRepository.findById(id).orElse(null);
        return usu;
        
    }

    
}
