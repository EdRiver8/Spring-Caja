package com.poli.caja.Servicios;

import com.poli.caja.Entidades.Profile;

import java.util.List;

public interface ProfileService {
    public Profile createProfile(Profile profile);
    public Profile findProfileById(Long id);
    public List<Profile> findAllProfile();
    public Profile updateProfile(Profile profile, Long id);
    public Profile deleteProfile(Long id);
}
