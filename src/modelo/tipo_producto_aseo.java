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
    
    
}
