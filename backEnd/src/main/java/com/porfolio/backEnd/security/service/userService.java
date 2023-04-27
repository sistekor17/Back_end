/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.backEnd.security.service;

import com.porfolio.backEnd.security.entity.User;
import com.porfolio.backEnd.security.repository.IUserRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JAMES
 */
@Service @Transactional
public class UserService {
    
    @Autowired 
    IUserRepository iUserRepo;
    
    public Optional<User> getByNickName(String nickName){
        return iUserRepo.findByNickName(nickName);
    }
    
    public boolean existsByNickName(String nickName){
        return iUserRepo.existsByNickName(nickName);
    }
    
    public boolean getByEmail(String email){
        return iUserRepo.existsByEmail(email);
    }
    
    public void save (User user){
        iUserRepo.save(user);
    }
}
