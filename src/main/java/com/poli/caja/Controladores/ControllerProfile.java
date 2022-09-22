package com.poli.caja.Controladores;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ControllerProfile {

    @GetMapping("/list")
    public String listProfile(){
        return "Perfiles: Jefe, Operario, Adtivo...";
    }

    @PostMapping("/save")
    public String saveProfile(){
        return "Datos guardados!";
    }

    @PutMapping("/update")
    public String updateProfile(){
        return "Datos Actualizados!";
    }

    @DeleteMapping("/delete")
    public boolean deleteProfile(boolean eliminar){
        if(eliminar == true){
            return true;
        }else{
            return false;
        }
    }
}
