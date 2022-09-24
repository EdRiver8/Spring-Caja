package com.poli.caja.Controladores;

import com.poli.caja.Entidades.Profile;
import com.poli.caja.Servicios.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService; //need @Service on ProfileServiceImp

    @GetMapping("/find/{id}")
    public Profile findProfileById(@PathVariable Long id){
        return profileService.findProfileById(id);
    }

    @GetMapping("/findAll")
    public List<Profile> listAllProfiles(){
        return profileService.findAllProfile();
    }

    @PostMapping("/save")
    public ResponseEntity<Profile> saveProfile(@RequestBody Profile profile){

        if(profileService.createProfile(profile) != null){
            return new ResponseEntity<Profile>(profile, HttpStatus.OK);
        }else{
            return ResponseEntity.badRequest().build();
        }

    }

    @PutMapping("/update/{id}")
    public Profile updateProfile(@RequestBody Profile profile, @PathVariable("id") Long id){
        return profileService.updateProfile(profile, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProfile(@PathVariable("id") Long id){
        profileService.deleteProfile(id);
        return "redirect:/profile/findAll";
    }
}
