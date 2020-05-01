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
public class tipo_producto_aseo {
 
    private int idTipoProducto;
    private String tipoProductoAseo;

    public tipo_producto_aseo() {
    }

    public tipo_producto_aseo(int idTipoProducto, String tipoProductoAseo) {
        this.idTipoProducto = idTipoProducto;
        this.tipoProductoAseo = tipoProductoAseo;
    }

    public tipo_producto_aseo(String tipoProductoAseo) {
        this.tipoProductoAseo = tipoProductoAseo;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getTipoProductoAseo() {
        return tipoProductoAseo;
    }

    public void setTipoProductoAseo(String tipoProductoAseo) {
        this.tipoProductoAseo = tipoProductoAseo;
    }

    @Override
    public String toString() {
        return "tipo_producto_aseo{" + "idTipoProducto=" + idTipoProducto + ", tipoProductoAseo=" + tipoProductoAseo + '}';
    }
    
    public boolean sqlTipoProducto(String sql) {
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
    
     public LinkedList<tipo_producto_aseo> consultarTipoProducto(String sql) {
        LinkedList<tipo_producto_aseo> listatp = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int id = 0;
        String nombre = "";
       
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    id = rs.getInt("idTipoProducto");
                    nombre = rs.getString("tipoProductoAseo");
                    
                    listatp.add(new tipo_producto_aseo(id, nombre));
                }
            } catch (SQLException ex) {
                Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listatp;

    }
     
      
    
    
}
