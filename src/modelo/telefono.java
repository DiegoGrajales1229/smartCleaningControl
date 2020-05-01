/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.SQLException;
import java.sql.Statement;

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
    
    
}
