/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erservelet.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Trabajo
 */
public class Conexiondba {
    Connection conectar = null;
    
    String usuario = "usersql";
    String contraseña = "123";
    String bd = "DBJAVANETBEANS";
    String ip = "localhost";
    String puerto = "1433";
    
    String cadena = "jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        try{
            String cadena = "jdbc:sqlserver://localhost:" +puerto+":"+"databaseName="+bd;
            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
            JOptionPane.showMessageDialog(null,"Se conecto correctamente a la base de datos");
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos: "+ e.toString()); 
        }
        return conectar;
    }
}
