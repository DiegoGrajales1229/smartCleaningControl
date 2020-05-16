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
    
    
}
