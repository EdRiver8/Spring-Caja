package com.poli.caja.Servicios;

import com.poli.caja.Entidades.Employee;
import com.poli.caja.Entidades.Profile;

import java.time.LocalDate;
import java.util.ArrayList;

public class ServiciosEmployee {

    ArrayList<Employee> listaEmpleado = this.listEmployee();

    public ArrayList listEmployee(){
//        Profile perfil = new Profile("2","image1", "123", LocalDate.of(2022, 9, 1), LocalDate.of(2022, 9, 11));
//
//        ArrayList <Employee> listaEmpleados = new ArrayList<>();
//        Employee empleado1 = new Employee(1, "abc@gmail.com", null, "admin", '10/02/1892');
        return null;
    }

    public Employee findEmployee(int id){
        Employee employee = null;
        for(Employee empleado : listaEmpleado) {
            if(empleado.getId() == id){
                employee = empleado;
                break;
            }
        }
        return employee;
    }

    public ArrayList<Employee> saveEmployee(Employee employee){
        listaEmpleado.add(employee);
        return listaEmpleado;
    }

}
