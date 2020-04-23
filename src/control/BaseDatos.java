/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Alejandro
 */
public class BaseDatos {
     Connection conexion;
    Statement st;

    public BaseDatos() {
        //conexion
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }

    
    public Connection getConexion() {
        return conexion;
    }
    
    //metodo utilizado para establecer la conexion con la base de datos
    //return estado regresa el estado de la conexion, true si se establecio, false
    // si no
    
    
    public boolean crearConexion(){
        boolean t=false;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcleaningcontrol","root","root");
            st = conexion.createStatement();
            t=true;
        
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return t=false;
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t= true;
    }
}
