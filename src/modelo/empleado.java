/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Alejandro
 */
public class empleado {

    private String idEmpleado, nombre1Empleado, nombre2Empleado, apellido1Empleado,
            apellido2Empleado, fotoEmpleado, correoEmpleado, direccionEmpleado, numeroContratoEmpleado;
    private int idServicioDf;
    private double salarioMensualEmpleado;

    public empleado() {
    }

    public empleado(String idEmpleado, String nombre1Empleado, String nombre2Empleado, String apellido1Empleado, String apellido2Empleado, String fotoEmpleado, String correoEmpleado, String direccionEmpleado, String numeroContratoEmpleado, int idServicioDf, double salarioMensualEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombre1Empleado = nombre1Empleado;
        this.nombre2Empleado = nombre2Empleado;
        this.apellido1Empleado = apellido1Empleado;
        this.apellido2Empleado = apellido2Empleado;
        this.fotoEmpleado = fotoEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.numeroContratoEmpleado = numeroContratoEmpleado;
        this.idServicioDf = idServicioDf;
        this.salarioMensualEmpleado = salarioMensualEmpleado;
    }

    public empleado(String nombre1Empleado, String nombre2Empleado, String apellido1Empleado, String apellido2Empleado) {
        this.nombre1Empleado = nombre1Empleado;
        this.nombre2Empleado = nombre2Empleado;
        this.apellido1Empleado = apellido1Empleado;
        this.apellido2Empleado = apellido2Empleado;
    }
    

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre1Empleado() {
        return nombre1Empleado;
    }

    public void setNombre1Empleado(String nombre1Empleado) {
        this.nombre1Empleado = nombre1Empleado;
    }

    public String getNombre2Empleado() {
        return nombre2Empleado;
    }

    public void setNombre2Empleado(String nombre2Empleado) {
        this.nombre2Empleado = nombre2Empleado;
    }

    public String getApellido1Empleado() {
        return apellido1Empleado;
    }

    public void setApellido1Empleado(String apellido1Empleado) {
        this.apellido1Empleado = apellido1Empleado;
    }

    public String getApellido2Empleado() {
        return apellido2Empleado;
    }

    public void setApellido2Empleado(String apellido2Empleado) {
        this.apellido2Empleado = apellido2Empleado;
    }

    public String getFotoEmpleado() {
        return fotoEmpleado;
    }

    public void setFotoEmpleado(String fotoEmpleado) {
        this.fotoEmpleado = fotoEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public String getNumeroContratoEmpleado() {
        return numeroContratoEmpleado;
    }

    public void setNumeroContratoEmpleado(String numeroContratoEmpleado) {
        this.numeroContratoEmpleado = numeroContratoEmpleado;
    }

    public int getIdServicioDf() {
        return idServicioDf;
    }

    public void setIdServicioDf(int idServicioDf) {
        this.idServicioDf = idServicioDf;
    }

    public double getSalarioMensualEmpleado() {
        return salarioMensualEmpleado;
    }

    public void setSalarioMensualEmpleado(double salarioMensualEmpleado) {
        this.salarioMensualEmpleado = salarioMensualEmpleado;
    }

    @Override
    public String toString() {
        return "empleado{" + "idEmpleado=" + idEmpleado + ", nombre1Empleado=" + nombre1Empleado + ", nombre2Empleado=" + nombre2Empleado + ", apellido1Empleado=" + apellido1Empleado + ", apellido2Empleado=" + apellido2Empleado + ", fotoEmpleado=" + fotoEmpleado + ", correoEmpleado=" + correoEmpleado + ", direccionEmpleado=" + direccionEmpleado + ", numeroContratoEmpleado=" + numeroContratoEmpleado + ", idServicioDf=" + idServicioDf + ", salarioMensualEmpleado=" + salarioMensualEmpleado + '}';
    }

    public LinkedList<empleado> consultarEmpleadoTelefonos(String sql) {
       LinkedList<empleado> em = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        
        String nombre1 = "";
        String nombre2 = "";
        String apellido1 = "";
        String apellido2 = "";
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    nombre1 = rs.getString("nombre1Empleado");
                    nombre2 = rs.getString("nombre2Empleado");
                    apellido1 = rs.getString("apellido1Empleado");
                    apellido2 = rs.getString("apellido2Empleado");
                    em.add(new empleado(nombre1, nombre2, apellido1, apellido2));
                }
            } catch (SQLException ex) {
                Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return em;
    }
    
    
}
