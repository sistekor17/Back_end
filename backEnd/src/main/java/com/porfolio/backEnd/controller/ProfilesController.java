
package com.porfolio.backEnd.controller;

import com.porfolio.backEnd.model.Profiles;
import com.porfolio.backEnd.service.IProfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author JAMES
 */

@Controller
public class ProfilesController {
    @Autowired
    private IProfilesService interProfile;
    
    @GetMapping("/profiles/find/{id}")
    public Profiles getProfile(@PathVariable long id){
        Profiles profile = interProfile.findProfile(id);
        return profile;  
    }
    
    @PostMapping("/profiles/new")
    public String newProfile(@RequestBody Profiles profile){
        interProfile.saveProfile(profile);
        return "El usuario se a creado correctamente";
    }
    
    @DeleteMapping("profiles/delete/{id}")
    public String deleteProfile(@PathVariable long id){
        interProfile.deleteProfile(id);
        return "El usuario a sido eliminado";
    }
    
    
}
