package com.poli.caja.Servicios;

import com.poli.caja.Entidades.Profile;
import com.poli.caja.Repositorios.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImp implements ProfileService{
    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Profile findProfileById(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    @Override
    public List<Profile> findAllProfile() {
        return profileRepository.findAll();
    }

    @Override
    public Profile updateProfile(Profile profile, Long id) {
        if(findProfileById(id) != null){
            return profileRepository.save(profile);// el 'save' sirve para actualizar
        }
        return null;
    }

    @Override
    public Profile deleteProfile(Long id) {
        if(findProfileById(id) != null){
            Profile profile = findProfileById(id);
            profileRepository.deleteById(id);
            return profile;
        }
        return null;
    }

}
