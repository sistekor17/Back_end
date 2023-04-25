
package com.porfolio.backEnd.security.repository;

import com.porfolio.backEnd.security.entity.Rol;
import com.porfolio.backEnd.security.enums.RolName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JAMES
 */
@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolName(RolName rolname);
}
