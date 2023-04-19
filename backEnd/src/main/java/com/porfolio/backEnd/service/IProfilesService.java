
package com.porfolio.backEnd.service;

import com.porfolio.backEnd.model.Profiles;
import java.util.List;

/**
 *
 * @author JAMES
 */
public interface IProfilesService {
    
    // Save profile
    public void saveProfile(Profiles profile);
    
    // Delete profile
    public void deleteProfile(long id);
    
    // Find profile
    public Profiles findProfile(long id);
    
    // List profiles
    public List<Profiles> getListProfiles();
    
    // Edit profile
    public void editProfile(long id, Profiles newProfile);
}
