/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleado.sv.bo;

import com.empleado.sv.dao.EmpleadoDao;
import com.empleado.sv.db.Conexion;
import com.empleado.sv.entities.Empleado;
import java.sql.Connection;

public class EmpleadoBO {

    private String message = "";
    private EmpleadoDao edao = new EmpleadoDao();

    public String agregarEmpleado(Empleado emp) {
        Connection conn = Conexion.getConnection();
        try {
            message = edao.agregarEmpleado(conn, emp);
            conn.commit();
        } catch (Exception e) {
            message = message + " " + e.getMessage();
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (Exception ex) {
                message = message + " " + ex.getMessage();
            }
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                message = message + " " + e.getMessage();
            }
        }
        return message;
    }

    public void listarEmpleado() {
    }

    public String modificarEmpleado(Empleado emp) {
        Connection conn = Conexion.getConnection();
        try {
            message = edao.modificarEmpleado(conn, emp);
            conn.rollback();

        } catch (Exception e) {
            message = message + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                message = message + " " + e.getMessage();

            }
        }
        return message;
    }

    public String eliminarEmpleado(int id) {
        Connection conn = Conexion.getConnection();
        try {
            message = edao.eliminarEmpleado(conn, id);
            conn.rollback();

        } catch (Exception e) {
            message = message + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                message = message + " " + e.getMessage();

            }
        }
        return message;
    }

}
