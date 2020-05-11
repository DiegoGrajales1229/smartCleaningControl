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
public class producto_unidad {
    
    private int idProductoU,idServicioDf,idProductoAseof;
    private String fechaUnidadProducto;

    public producto_unidad() {
    }

    public producto_unidad(int idProductoAseof, String fechaUnidadProducto,  int idServicioDf) {
        this.idServicioDf = idServicioDf;
        this.idProductoAseof = idProductoAseof;
        this.fechaUnidadProducto=fechaUnidadProducto;
    }
    public producto_unidad( int idProductoAseof,  String fechaUnidadProducto) {
        
        this.idProductoAseof = idProductoAseof;
        this.fechaUnidadProducto=fechaUnidadProducto;
    }

    public producto_unidad(int idProductoU, int idProductoAseof, String fechaUnidadProducto, int idServicioDf) {
        this.idProductoU = idProductoU;
        this.idServicioDf = idServicioDf;
        this.idProductoAseof = idProductoAseof;
        this.fechaUnidadProducto=fechaUnidadProducto;
    }

    public int getIdProductoU() {
        return idProductoU;
    }

    public void setIdProductoU(int idProductoU) {
        this.idProductoU = idProductoU;
    }

    public int getIdServicioDf() {
        return idServicioDf;
    }

    public void setIdServicioDf(int idServicioDf) {
        this.idServicioDf = idServicioDf;
    }

    public int getIdProductoAseof() {
        return idProductoAseof;
    }

    public void setIdProductoAseof(int idProductoAseof) {
        this.idProductoAseof = idProductoAseof;
    }
    
    
    public String getFechaUnidadProducto() {
        return fechaUnidadProducto;
    }

    public void setFechaUnidadProducto(String fechaUnidadProducto) {
        this.fechaUnidadProducto = fechaUnidadProducto;
    }
    

    @Override
    public String toString() {
        return "producto_unidad{" + "idProductoU=" + idProductoU + ", idServicioDf=" + idServicioDf + ", idProductoAseof=" + idProductoAseof + '}';
    }
    
     public boolean sqlProductoUnidad(String sql) {
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
     
     public LinkedList<producto_unidad> consultarProductoUnidad(String sql) {
        LinkedList<producto_unidad> listapu = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int id = 0;

        int idPA = 0;
        int idDS= 0;
        String fecha="";
        
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    id = rs.getInt("idProductoAseo");
                     idPA = rs.getInt("idProductoAseof");
                     idDS = rs.getInt("idServicioDf");
                    
                     fecha = rs.getString("fechaUnidadProducto");
                    
                    
                    listapu.add(new producto_unidad(id, idPA, fecha, idDS));
                }
            } catch (SQLException ex) {
                Logger.getLogger(producto_unidad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listapu;

    }

    public LinkedList<producto_unidadADV> consultarProductoUnidadADV(String sql) {
        LinkedList<producto_unidadADV> listapu = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int id = 0;

        String nombrePA="";
        int idDS= 0;
        String nombreUR="";
        String fecha="";
        
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    
                    
                    id = rs.getInt("idProductoAseo");
                    nombrePA= rs.getString("npa");
                    
                    
                     idDS = rs.getInt("untService");
                      nombreUR=rs.getString("nur");
                    
                     fecha = rs.getString("fecha");
                    
                    
                    listapu.add(new producto_unidadADV(id, nombrePA, idDS, nombreUR, fecha));
                }
            } catch (SQLException ex) {
                Logger.getLogger(producto_unidad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listapu;

    }

    
    public LinkedList<LinkedList>  busquedaAvanzada (String sql){
    LinkedList <LinkedList>lista= new LinkedList<>();
    LinkedList<String> subLista = new LinkedList<>();
    
    subLista.add("hola");
    subLista.add("foca");
    
    lista.add(subLista);
    
    return lista;
    }
    



   
}
