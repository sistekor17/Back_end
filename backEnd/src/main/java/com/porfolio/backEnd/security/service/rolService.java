
package com.porfolio.backEnd.security.service;

import com.porfolio.backEnd.security.entity.Rol;
import com.porfolio.backEnd.security.enums.RolName;
import com.porfolio.backEnd.security.repository.IRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JAMES
 */
@Service @Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepo;
    
    public Optional<Rol> getByRolname(RolName rolName){
        return irolRepo.findByRolName(rolName);
    };
    
    public void save (Rol rol){
        irolRepo.save(rol);
    }
}
