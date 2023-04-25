
package com.porfolio.backEnd.security.repository;

import com.porfolio.backEnd.security.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JAMES
 */
@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByNickName(String nickName);
    
    boolean existsByNickName(String nickName);
    
    boolean existsByEmail(String email);
}
