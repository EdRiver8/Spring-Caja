package com.poli.caja.Controladores;

import com.poli.caja.Entidades.*;
import com.poli.caja.Servicios.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/employee")
public class ControllerEmployee {

    Profile perfil;

    EmployeeServiceImp employeeServiceImp;

    public ControllerEmployee(){
        this.employeeServiceImp = new EmployeeServiceImp();
    }

    @GetMapping("/list")
    public ArrayList listEmployee(){
        return null;
    }

    @GetMapping(value = "/list/nombres")
    public String getNombre(@RequestParam(value = "nombre", defaultValue = "Ed") String nombre, @RequestParam String apellidos){
        return nombre;
    }

    @GetMapping("/list/{id}")
    public Employee listEmployee(@PathVariable int id){
        return employeeServiceImp.findEmployee(id);
    }

    @PostMapping("/save")
    public ArrayList<Employee> saveEmployee(@RequestBody Employee employee){
        return employeeServiceImp.saveEmployee(employee);
    }

    @PutMapping("/update")
    public String updateEmployee(){
        return "Empleado actualizado";
    }

    @DeleteMapping("/delete")
    public String deleteEmployee(){
        return "Empleado eliminado";
    }
}
