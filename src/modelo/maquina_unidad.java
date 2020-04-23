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
public class maquina_unidad {
    
    private int idMaquinaU,idServicioDf,idMaquinaAseof;

    public maquina_unidad() {
    }

    public maquina_unidad(int idServicioDf, int idMaquinaAseof) {
        this.idServicioDf = idServicioDf;
        this.idMaquinaAseof = idMaquinaAseof;
    }

    public maquina_unidad(int idMaquinaU, int idServicioDf, int idMaquinaAseof) {
        this.idMaquinaU = idMaquinaU;
        this.idServicioDf = idServicioDf;
        this.idMaquinaAseof = idMaquinaAseof;
    }

    public int getIdMaquinaU() {
        return idMaquinaU;
    }

    public void setIdMaquinaU(int idMaquinaU) {
        this.idMaquinaU = idMaquinaU;
    }

    public int getIdServicioDf() {
        return idServicioDf;
    }

    public void setIdServicioDf(int idServicioDf) {
        this.idServicioDf = idServicioDf;
    }

    public int getIdMaquinaAseof() {
        return idMaquinaAseof;
    }

    public void setIdMaquinaAseof(int idMaquinaAseof) {
        this.idMaquinaAseof = idMaquinaAseof;
    }

    @Override
    public String toString() {
        return "maquina_unidad{" + "idMaquinaU=" + idMaquinaU + ", idServicioDf=" + idServicioDf + ", idMaquinaAseof=" + idMaquinaAseof + '}';
    }

   
}
