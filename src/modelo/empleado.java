/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
    
    
}
