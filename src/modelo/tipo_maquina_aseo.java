/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Diego Alejandro
 */
public class tipo_maquina_aseo {
    private int idTipoMaquina;
    private String tipoMquinaAseo;

    public tipo_maquina_aseo(int idTipoMaquina, String tipoMquinaAseo) {
        this.idTipoMaquina = idTipoMaquina;
        this.tipoMquinaAseo = tipoMquinaAseo;
    }

    public tipo_maquina_aseo(String tipoMquinaAseo) {
        this.tipoMquinaAseo = tipoMquinaAseo;
    }

    public tipo_maquina_aseo() {
    }

    public int getIdTipoMaquina() {
        return idTipoMaquina;
    }

    public void setIdTipoMaquina(int idTipoMaquina) {
        this.idTipoMaquina = idTipoMaquina;
    }

    public String getTipoMquinaAseo() {
        return tipoMquinaAseo;
    }

    public void setTipoMquinaAseo(String tipoMquinaAseo) {
        this.tipoMquinaAseo = tipoMquinaAseo;
    }

    @Override
    public String toString() {
        return "tipo_maquina_aseo{" + "idTipoMaquina=" + idTipoMaquina + ", tipoMquinaAseo=" + tipoMquinaAseo + '}';
    }

    public boolean insertTipoMaquina(String sql) {
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
    
    
}
