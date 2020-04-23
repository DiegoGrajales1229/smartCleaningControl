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
public class productos_de_aseo {
    
    private int idProductoAseo,idTipoProductof;
    private String nombreProductoAseo,fechaDeCompra;
    private double precioProductoAseo;

    public productos_de_aseo() {
    }

    public productos_de_aseo(int idProductoAseo, int idTipoProductof, String nombreProductoAseo, String fechaDeCompra, double precioProductoAseo) {
        this.idProductoAseo = idProductoAseo;
        this.idTipoProductof = idTipoProductof;
        this.nombreProductoAseo = nombreProductoAseo;
        this.fechaDeCompra = fechaDeCompra;
        this.precioProductoAseo = precioProductoAseo;
    }

    public productos_de_aseo(int idTipoProductof, String nombreProductoAseo, String fechaDeCompra, double precioProductoAseo) {
        this.idTipoProductof = idTipoProductof;
        this.nombreProductoAseo = nombreProductoAseo;
        this.fechaDeCompra = fechaDeCompra;
        this.precioProductoAseo = precioProductoAseo;
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
        return "productos_de_aseo{" + "idProductoAseo=" + idProductoAseo + ", idTipoProductof=" + idTipoProductof + ", nombreProductoAseo=" + nombreProductoAseo + ", fechaDeCompra=" + fechaDeCompra + ", precioProductoAseo=" + precioProductoAseo + '}';
    }
    
    
    
}
