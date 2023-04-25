
package com.porfolio.backEnd.security.service;

import com.porfolio.backEnd.security.entity.MainUser;
import com.porfolio.backEnd.security.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author JAMES
 */
@Service
public class userDetailsImplement implements UserDetailsService {
    
    @Autowired
    userService userServ;

    @Override
    public UserDetails loadUserByUsername(String nickName) throws UsernameNotFoundException {
        User user = userServ.getByNickName(nickName).get();
        return MainUser.build(user);
    }
    
    
    
    
}
