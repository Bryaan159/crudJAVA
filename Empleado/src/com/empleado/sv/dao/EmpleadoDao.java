/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleado.sv.dao;

import com.empleado.sv.entities.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Hernandez
 */
public class EmpleadoDao {

    private String message = "";

    public String agregarEmpleado(Connection con, Empleado emp){
        PreparedStatement pst = null;
        String sql = "INSERT INTO EMPLEADO(IDEMPLEADO, NOMBRES, APELLIDOS, CEDULA, ESTADO, GENERO, EDAD)"
                + "VALUES(EMPLEADO_SEQ.NEXTVAL,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emp.getNombres());
            pst.setString(2, emp.getApellido());
            pst.setString(3, emp.getCedula());
            pst.setString(4, emp.getEstadoCivil() + "");
            pst.setString(5, emp.getGenero() + "");
            pst.setInt(6, emp.getEdad());
            message = "GUARDADO CORRECTAMENTE xd";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            message = "NO SE PUDO GUARDAR CORRECTAMENTE \n " + e.getMessage();
        }
        return message;
    }

    public void listarEmpleado(Connection con, JTable tabla) {
        
    }

    public String modificarEmpleado(Connection con, Empleado emp) {
        PreparedStatement pst = null;
        String sql =  "UPDATE EMPLEADO SET NOMBRES = ?, APELLIDOS = ? , CEDULA = ?, ESTADO = ?, GENERO = ? , EDAD  = ?"
                   + "WHERE IDEMPLEADO = ? ";
							
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emp.getNombres());
            pst.setString(2, emp.getApellido());
            pst.setString(3, emp.getCedula());
            pst.setString(4, emp.getEstadoCivil() + "");
            pst.setString(5, emp.getGenero() + "");
            pst.setInt(6, emp.getEdad());
            pst.setInt(7, emp.getIdEmpleado());
            message = "ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            message = "NO SE PUDO ACTUALIZAR CORRECTAMENTE \n " + e.getMessage();
        }
        return message;
    }

    public String eliminarEmpleado(Connection con, int id) {
        PreparedStatement pst = null;
        String sql = "DELETE FROM EMPLEADO WHERE IDEMPLEADO = ?";
        try
        {
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            message = "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch (SQLException e){ 
            message = "NO SE PUDO GUARDAR CORRECTAMENTE \n " + e.getMessage();
        }
        return message;
    }

}
