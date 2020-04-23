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
public class producto_unidad {
    
    private int idProductoU,idServicioDf,idProductoAseof;

    public producto_unidad() {
    }

    public producto_unidad(int idServicioDf, int idProductoAseof) {
        this.idServicioDf = idServicioDf;
        this.idProductoAseof = idProductoAseof;
    }

    public producto_unidad(int idProductoU, int idServicioDf, int idProductoAseof) {
        this.idProductoU = idProductoU;
        this.idServicioDf = idServicioDf;
        this.idProductoAseof = idProductoAseof;
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

    @Override
    public String toString() {
        return "producto_unidad{" + "idProductoU=" + idProductoU + ", idServicioDf=" + idServicioDf + ", idProductoAseof=" + idProductoAseof + '}';
    }
    
    
}
