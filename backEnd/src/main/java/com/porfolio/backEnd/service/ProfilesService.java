
package com.porfolio.backEnd.service;

import com.porfolio.backEnd.model.Profiles;
import com.porfolio.backEnd.repository.ProfilesRepository;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JAMES
 */
@Service
public class ProfilesService implements IProfilesService{
    
    @Autowired 
    private ProfilesRepository profileRepository;
    
    @Override
    public void saveProfile(Profiles profile) {
        profileRepository.save(profile);
    }

    @Override
    public void deleteProfile(long id) {
        profileRepository.deleteById(id);
    }

    @Override
    public List<Profiles> getListProfiles() {
        List<Profiles> listProfiles = profileRepository.findAll();
        return listProfiles;
    }


    @Override
    public Profiles findProfile(long id) {
       return profileRepository.findById(id).orElseThrow(()-> new NoSuchElementException("No se encuentra el perfil con el id: "+ id ));
        
    }

    @Override
    public void editProfile(long id, Profiles newProfile) {
        Profiles profile = profileRepository.findById(id).orElseThrow(()-> new NoSuchElementException("No se encuentra el perfil con el id: "+ id ));
        
        profile.setFullName(newProfile.getFullName());
        profile.setProfession(newProfile.getProfession());
        profile.setAboutMe(newProfile.getAboutMe());
        profile.setImageProfile(newProfile.getImageProfile());
        
        profileRepository.save(profile);
            
        
    }

   


}
