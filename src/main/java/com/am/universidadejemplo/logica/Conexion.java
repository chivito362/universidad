/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.am.universidadejemplo.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    private String url,us,pw,driver,db;
    private Connection conn;

    public Conexion(String db) throws SQLException {
        this.url = "jdbc:mysql://localhost:3306/";
        this.us = "root";
        this.pw = "";
        this.driver = "com.mysql.cj.jdbc.Driver";
        this.db = db;
    }
    
    public Connection conn(){
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url+db,us,pw);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al realizar la carga de Driver");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al realizar la consulta");
        }
        return null;
    }
    
}
