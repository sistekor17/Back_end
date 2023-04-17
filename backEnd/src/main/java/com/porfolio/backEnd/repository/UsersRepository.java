
package com.porfolio.backEnd.repository;

import com.porfolio.backEnd.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JAMES
 */
@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{
    
}
