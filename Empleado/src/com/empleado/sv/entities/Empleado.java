/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleado.sv.entities;

public class Empleado {

    private int idEmpleado;
    private String nombres;
    private String apellido;
    private String cedula;
    private char estadoCivil;
    private char genero;
    private int edad;
//Se esta creando el constructor

    public Empleado() {
    }
    
    public Empleado(int idEmpleado, String nombre, String apellido, String cedula, char estadoCivil, char estado, char genero, int edad) {
        this.idEmpleado = idEmpleado;
        this.nombres = nombre;
        this.cedula = cedula;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.edad = edad;
    }

   

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }
    //-------------------------------------------	

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return nombres;
    }
    //-------------------------------------------	

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }
    //-------------------------------------------	

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }
    //-------------------------------------------	

    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public char getEstadoCivil() {
        return estadoCivil;
    }
    //-------------------------------------------	

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }
    //-------------------------------------------	

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}
