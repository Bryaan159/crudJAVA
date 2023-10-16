/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleado.sv.test;

import com.empleado.sv.bo.EmpleadoBO;
import com.empleado.sv.entities.Empleado;


/**
 *
 * @author Hernandez
 */
public class Test {
    EmpleadoBO ebo = new EmpleadoBO();
    Empleado emp  = new Empleado();
    String message =  "";
    public void insertar(){
        emp.setNombres("Walter");
        emp.setApellido("Rosero");
        emp.setCedula("0954765342");
        emp.setEstadoCivil('S');
        emp.setGenero('M');
        emp.setEdad(21);
        message = ebo.agregarEmpleado(emp);
        System.out.println(message);
    }
    public static void  main(String [] args){
        Test test = new Test();
        test.insertar();
    }
    
}
