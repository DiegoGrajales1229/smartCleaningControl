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
public class productos_aseo {
    
    private int idProductoAseo,idTipoProductof;
    private String nombreProductoAseo,fechaDeCompra;
    private double precioProductoAseo;

    public productos_aseo() {
    }

    public productos_aseo(int idProductoAseo, String nombreProductoAseo,double precioProductoAseo, String fechaDeCompra, int idTipoProductof ) {
        this.idProductoAseo = idProductoAseo;
        this.idTipoProductof = idTipoProductof;
        this.nombreProductoAseo = nombreProductoAseo;
        this.fechaDeCompra = fechaDeCompra;
        this.precioProductoAseo = precioProductoAseo;
    }

    public productos_aseo( String nombreProductoAseo,  double precioProductoAseo, String fechaDeCompra, int idTipoProductof ) {
        
        this.nombreProductoAseo = nombreProductoAseo;
        this.fechaDeCompra = fechaDeCompra;
        this.precioProductoAseo = precioProductoAseo;
        this.idTipoProductof = idTipoProductof;
    }

    public int getIdProductoAseo() {
        return idProductoAseo;
    }

    public void setIdProductoAseo(int idProductoAseo) {
        this.idProductoAseo = idProductoAseo;
    }

    public int getIdTipoProductof() {
        return idTipoProductof;
    }

    public void setIdTipoProductof(int idTipoProductof) {
        this.idTipoProductof = idTipoProductof;
    }

    public String getNombreProductoAseo() {
        return nombreProductoAseo;
    }

    public void setNombreProductoAseo(String nombreProductoAseo) {
        this.nombreProductoAseo = nombreProductoAseo;
    }

    public String getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(String fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public double getPrecioProductoAseo() {
        return precioProductoAseo;
    }

    public void setPrecioProductoAseo(double precioProductoAseo) {
        this.precioProductoAseo = precioProductoAseo;
    }

    @Override
    public String toString() {
        return "productos_aseo{" + "idProductoAseo=" + idProductoAseo + ", idTipoProductof=" + idTipoProductof + ", nombreProductoAseo=" + nombreProductoAseo + ", fechaDeCompra=" + fechaDeCompra + ", precioProductoAseo=" + precioProductoAseo + '}';
    }
    
    
     public boolean sqlProductoAseo(String sql) {
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
     
     public LinkedList<productos_aseo> consultarProducto(String sql) {
        LinkedList<productos_aseo> listap = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int id = 0;
        String nombre = "";
        double precio= 0;
        String fecha="";
        int idTp=0;
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    id = rs.getInt("idProductoAseo");
                    nombre = rs.getString("nombreProductoAseo");
                    precio= rs.getDouble("precioProductoAseo");
                     fecha = rs.getString("fechaDeCompraPA");
                     idTp= rs.getInt("idTipoProductof");
                    
                    listap.add(new productos_aseo(id, nombre, precio, fecha, idTp));
                }
            } catch (SQLException ex) {
                Logger.getLogger(productos_aseo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listap;

    }
    
    
    
}
