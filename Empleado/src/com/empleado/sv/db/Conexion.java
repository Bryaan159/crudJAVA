/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empleado.sv.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Hernandez
 */
public class Conexion {

    //Se pone estatico para que solo se pueda utilizar en esta clase
    private static Connection conn = null;
    private static String login = "C##TEST1";
    private static String clave = "prueba123";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";

    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, login, clave);
            conn.setAutoCommit(false);

            if (conn != null) {
                System.out.println("Conexion existosa xD");
            } else {
                System.out.print("Conexion errorea");
            }

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion errorea" + e.getMessage());
        }
        return conn;
    }

    public void desconexion() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar" + e.getMessage());
        }
    }

}
