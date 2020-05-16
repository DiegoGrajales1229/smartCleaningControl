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
public class detalle_Servicio {
    
    private int idServicioD;
    String fechaInicioServicio,fechaVenceServicio,nitUnidadf;

    public detalle_Servicio() {
    }

    public detalle_Servicio(String fechaInicioServicio, String fechaVenceServicio, String nitUnidadf) {
        this.fechaInicioServicio = fechaInicioServicio;
        this.fechaVenceServicio = fechaVenceServicio;
        this.nitUnidadf = nitUnidadf;
    }

    public detalle_Servicio(int idServicioD, String fechaInicioServicio, String fechaVenceServicio, String nitUnidadf) {
        this.idServicioD = idServicioD;
        this.fechaInicioServicio = fechaInicioServicio;
        this.fechaVenceServicio = fechaVenceServicio;
        this.nitUnidadf = nitUnidadf;
    }

    public int getIdServicioD() {
        return idServicioD;
    }

    public void setIdServicioD(int idServicioD) {
        this.idServicioD = idServicioD;
    }

    public String getFechaInicioServicio() {
        return fechaInicioServicio;
    }

    public void setFechaInicioServicio(String fechaInicioServicio) {
        this.fechaInicioServicio = fechaInicioServicio;
    }

    public String getFechaVenceServicio() {
        return fechaVenceServicio;
    }

    public void setFechaVenceServicio(String fechaVenceServicio) {
        this.fechaVenceServicio = fechaVenceServicio;
    }

    public String getNitUnidadf() {
        return nitUnidadf;
    }

    public void setNitUnidadf(String nitUnidadf) {
        this.nitUnidadf = nitUnidadf;
    }

    @Override
    public String toString() {
        return "detalle_Servicio{" + "idServicioD=" + idServicioD + ", fechaInicioServicio=" + fechaInicioServicio + ", fechaVenceServicio=" + fechaVenceServicio + ", nitUnidadf=" + nitUnidadf + '}';
    }
    
      public boolean sqlDetalleServicio(String sql) {
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
     
     public LinkedList<detalle_Servicio> consultarDetalleServicio(String sql) {
        LinkedList<detalle_Servicio> listaDS= new LinkedList<>();
        BaseDatos objb = new BaseDatos();
       
        
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    detalle_Servicio objD=new detalle_Servicio();
                    objD.setIdServicioD(rs.getInt("idServicioD"));
                    objD.setFechaInicioServicio(rs.getString("fechaInicioServicio"));
                    objD.setFechaVenceServicio(rs.getString("fechaVenceServicio"));
                    objD.setNitUnidadf(rs.getString("nitUnidadf"));
                    listaDS.add(objD);
                }
            } catch (SQLException ex) {
                Logger.getLogger(productos_aseo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaDS;

    }
    
    
    
}
