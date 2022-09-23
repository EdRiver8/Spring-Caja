package com.poli.caja.Servicios;

import com.poli.caja.Entidades.Profile;
import com.poli.caja.Repositorios.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProfileServiceImp implements ProfileService{
    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public Profile createProfile(Profile profile) {
        return null;
    }

    @Override
    public Profile findProfileById(Long id) {
        return null;
    }

    @Override
    public List<Profile> findAllProfile() {
        return null;
    }

    @Override
    public Profile updateProfile(Profile profile, Long id) {
        return null;
    }

    @Override
    public Profile deleteProfile(Long id) {
        return null;
    }

}
