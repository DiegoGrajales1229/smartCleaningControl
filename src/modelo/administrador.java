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
public class administrador {
    private int idAdmin;
    private String nombre1Admin,nombre2Admin,apellido1Admin,apellido2Admin,correoAdmin;

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
    
    
}
