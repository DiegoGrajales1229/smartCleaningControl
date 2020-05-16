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
    
}
