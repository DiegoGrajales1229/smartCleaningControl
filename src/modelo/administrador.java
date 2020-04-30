/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Alejandro
 */
public class administrador {

    private int idAdmin;
    private String nombre1Admin, nombre2Admin, apellido1Admin, apellido2Admin, correoAdmin;

    public administrador() {
    }

    public administrador(int idAdmin, String nombre1Admin, String nombre2Admin, String apellido1Admin, String apellido2Admin, String correoAdmin) {
        this.idAdmin = idAdmin;
        this.nombre1Admin = nombre1Admin;
        this.nombre2Admin = nombre2Admin;
        this.apellido1Admin = apellido1Admin;
        this.apellido2Admin = apellido2Admin;
        this.correoAdmin = correoAdmin;
    }

    public administrador(String nombre1Admin, String nombre2Admin, String apellido1Admin, String apellido2Admin, String correoAdmin) {
        this.nombre1Admin = nombre1Admin;
        this.nombre2Admin = nombre2Admin;
        this.apellido1Admin = apellido1Admin;
        this.apellido2Admin = apellido2Admin;
        this.correoAdmin = correoAdmin;
    }

    public administrador(int idAdmin, String nombre1Admin, String nombre2Admin, String apellido1Admin, String apellido2Admin) {
        this.idAdmin = idAdmin;
        this.nombre1Admin = nombre1Admin;
        this.nombre2Admin = nombre2Admin;
        this.apellido1Admin = apellido1Admin;
        this.apellido2Admin = apellido2Admin;
    }

    public administrador(int idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    
    

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNombre1Admin() {
        return nombre1Admin;
    }

    public void setNombre1Admin(String nombre1Admin) {
        this.nombre1Admin = nombre1Admin;
    }

    public String getNombre2Admin() {
        return nombre2Admin;
    }

    public void setNombre2Admin(String nombre2Admin) {
        this.nombre2Admin = nombre2Admin;
    }

    public String getApellido1Admin() {
        return apellido1Admin;
    }

    public void setApellido1Admin(String apellido1Admin) {
        this.apellido1Admin = apellido1Admin;
    }

    public String getApellido2Admin() {
        return apellido2Admin;
    }

    public void setApellido2Admin(String apellido2Admin) {
        this.apellido2Admin = apellido2Admin;
    }

    public String getCorreoAdmin() {
        return correoAdmin;
    }

    public void setCorreoAdmin(String correoAdmin) {
        this.correoAdmin = correoAdmin;
    }

    @Override
    public String toString() {
        return "administrador{" + "idAdmin=" + idAdmin + ", nombre1Admin=" + nombre1Admin + ", nombre2Admin=" + nombre2Admin + ", apellido1Admin=" + apellido1Admin + ", apellido2Admin=" + apellido2Admin + ", correoAdmin=" + correoAdmin + '}';
    }

    public boolean SQL(String sql) {
        boolean t = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t = false;
            }
        }

        return t;
    }

    public LinkedList<administrador> consultarAdministradores(String sql) {
        LinkedList<administrador> la = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int idAdmin = 0;
        String nombre1 = "";
        String nombre2 = "";
        String apellido1 = "";
        String apellido2 = "";
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    idAdmin = rs.getInt("idAdmin");
                    nombre1 = rs.getString("nombre1Admin");
                    nombre2 = rs.getString("nombre2Admin");
                    apellido1 = rs.getString("apellido1Admin");
                    apellido2 = rs.getString("apellido2Admin");
                    la.add(new administrador(idAdmin, nombre1, nombre2, apellido1, apellido2));
                }
            } catch (SQLException ex) {
                Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return la;

    }

    

}
