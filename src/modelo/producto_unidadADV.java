/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juan Diego Tabares
 */
public class producto_unidadADV {
    
    
         private  int id ;

        private        String nombrePA;
       private  int idDS;
        private String nombreUR;
        private String fecha;

    public producto_unidadADV(int id, String nombrePA, int idDS, String nombreUR, String fecha) {
        this.id = id;
        this.nombrePA = nombrePA;
        this.idDS = idDS;
        this.nombreUR = nombreUR;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePA() {
        return nombrePA;
    }

    public void setNombrePA(String nombrePA) {
        this.nombrePA = nombrePA;
    }

    public int getIdDS() {
        return idDS;
    }

    public void setIdDS(int idDS) {
        this.idDS = idDS;
    }

    public String getNombreUR() {
        return nombreUR;
    }

    public void setNombreUR(String nombreUR) {
        this.nombreUR = nombreUR;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    
    
}
