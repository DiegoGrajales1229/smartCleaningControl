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
public class unidad_residencial {
    
    private String nitUnidad,nombreUnidadResidencial,fechaContratoUnidad,direccionUnidad;
    private int idAdminf;

    public unidad_residencial(String nitUnidad, String nombreUnidadResidencial, String fechaContratoUnidad, String direccionUnidad, int idAdminf) {
        this.nitUnidad = nitUnidad;
        this.nombreUnidadResidencial = nombreUnidadResidencial;
        this.fechaContratoUnidad = fechaContratoUnidad;
        this.direccionUnidad = direccionUnidad;
        this.idAdminf = idAdminf;
    }

    public unidad_residencial() {
    }

    public String getNitUnidad() {
        return nitUnidad;
    }

    public void setNitUnidad(String nitUnidad) {
        this.nitUnidad = nitUnidad;
    }

    public String getNombreUnidadResidencial() {
        return nombreUnidadResidencial;
    }

    public void setNombreUnidadResidencial(String nombreUnidadResidencial) {
        this.nombreUnidadResidencial = nombreUnidadResidencial;
    }

    public String getFechaContratoUnidad() {
        return fechaContratoUnidad;
    }

    public void setFechaContratoUnidad(String fechaContratoUnidad) {
        this.fechaContratoUnidad = fechaContratoUnidad;
    }

    public String getDireccionUnidad() {
        return direccionUnidad;
    }

    public void setDireccionUnidad(String direccionUnidad) {
        this.direccionUnidad = direccionUnidad;
    }

    public int getIdAdminf() {
        return idAdminf;
    }

    public void setIdAdminf(int idAdminf) {
        this.idAdminf = idAdminf;
    }

    @Override
    public String toString() {
        return "unidad_residencial{" + "nitUnidad=" + nitUnidad + ", nombreUnidadResidencial=" + nombreUnidadResidencial + ", fechaContratoUnidad=" + fechaContratoUnidad + ", direccionUnidad=" + direccionUnidad + ", idAdminf=" + idAdminf + '}';
    }
    public boolean sqlUnidadResidencial(String sql) {
        boolean t=false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t=true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t= false;
            }
        }
        
        return t;
    }
     
     public LinkedList<unidad_residencial> consultarUnidadR(String sql) {
        LinkedList<unidad_residencial> listaUR = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
      String nit="";
      String nombre="";
        String      fecha="";
           String   direccion="";
       int idAdmi=0;
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    nit = rs.getString(" nitUnidad");
                    nombre = rs.getString("nombreUnidadResidencial");
                    fecha= rs.getString("fechaContratoUnidad");
                     direccion = rs.getString("direccionUnidad");
                     idAdmi= rs.getInt("idAminf");
                   
                    listaUR.add(new unidad_residencial(nit, nombre, fecha,direccion,idAdmi));
                }
            } catch (SQLException ex) {
                Logger.getLogger(productos_aseo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaUR;

    }
    
}
