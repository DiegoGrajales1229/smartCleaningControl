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
public class telefono {
    
    private int idTelefono;
    private String telefono,idEmpleadof;

    public telefono() {
    }

    public telefono(String telefono, String idEmpleadof) {
        this.telefono = telefono;
        this.idEmpleadof = idEmpleadof;
    }

    public telefono(int idTelefono, String telefono, String idEmpleadof) {
        this.idTelefono = idTelefono;
        this.telefono = telefono;
        this.idEmpleadof = idEmpleadof;
    }

    public telefono(String telefono) {
        this.telefono = telefono;
    }

    public telefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public telefono(int idTelefono, String telefono) {
        this.idTelefono = idTelefono;
        this.telefono = telefono;
    }
    
    
    
    
    

    public int getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdEmpleadof() {
        return idEmpleadof;
    }

    public void setIdEmpleadof(String idEmpleadof) {
        this.idEmpleadof = idEmpleadof;
    }

    @Override
    public String toString() {
        return "telefono{" + "idTelefono=" + idTelefono + ", telefono=" + telefono + ", idEmpleadof=" + idEmpleadof + '}';
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

    public LinkedList<telefono> consultarUnicamenteTelefonos(String sql) {
           LinkedList<telefono> lt = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
       
        String telefono = "";
       
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    
                    telefono = rs.getString("telefono");
                   
                    lt.add(new telefono(telefono));
                }
            } catch (SQLException ex) {
                Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lt;
    }

    public LinkedList<telefono> consultarTelefonoCompleto(String sql) {
         LinkedList<telefono> lt = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
       
        int idTelefono=0 ;
        String telefono = "";
        String idEmpleadof="" ;
       
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    idTelefono = rs.getInt("idTelefono");
                    telefono = rs.getString("telefono");
                    idEmpleadof = rs.getString("idEmpleadof");
                   
                    lt.add(new telefono(idTelefono, telefono, idEmpleadof));
                }
            } catch (SQLException ex) {
                Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lt;
    }
    
    
}
