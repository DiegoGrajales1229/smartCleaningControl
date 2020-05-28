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
public class maquinas_de_aseo {
    private int idMaquinaAseo,idTipoMaquinaf;
    private String nombreMaquinaAseo,fechaLlegada,fechaSalida;

    public maquinas_de_aseo() {
    }

    public maquinas_de_aseo(int idTipoMaquinaf, String nombreMaquinaAseo, String fechaLlegada, String fechaSalida) {
        this.idTipoMaquinaf = idTipoMaquinaf;
        this.nombreMaquinaAseo = nombreMaquinaAseo;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
    }

    public maquinas_de_aseo(int idMaquinaAseo, int idTipoMaquinaf, String nombreMaquinaAseo, String fechaLlegada, String fechaSalida) {
        this.idMaquinaAseo = idMaquinaAseo;
        this.idTipoMaquinaf = idTipoMaquinaf;
        this.nombreMaquinaAseo = nombreMaquinaAseo;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
    }

    public int getIdMaquinaAseo() {
        return idMaquinaAseo;
    }

    public void setIdMaquinaAseo(int idMaquinaAseo) {
        this.idMaquinaAseo = idMaquinaAseo;
    }

    public int getIdTipoMaquinaf() {
        return idTipoMaquinaf;
    }

    public void setIdTipoMaquinaf(int idTipoMaquinaf) {
        this.idTipoMaquinaf = idTipoMaquinaf;
    }

    public String getNombreMaquinaAseo() {
        return nombreMaquinaAseo;
    }

    public void setNombreMaquinaAseo(String nombreMaquinaAseo) {
        this.nombreMaquinaAseo = nombreMaquinaAseo;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "maquinas_de_aseo{" + "idMaquinaAseo=" + idMaquinaAseo + ", idTipoMaquinaf=" + idTipoMaquinaf + ", nombreMaquinaAseo=" + nombreMaquinaAseo + ", fechaLlegada=" + fechaLlegada + ", fechaSalida=" + fechaSalida + '}';
    }

    public boolean SQL(String sql) {
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

    public LinkedList<maquinas_de_aseo> consultarMaquinas(String sql) {
       LinkedList<maquinas_de_aseo> listaM = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int id = 0;
        String nombre = "";
        String fechaL= "";
        String fechaS="";
        int idTp=0;
        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    id = rs.getInt("idMaquinaAseo");
                    nombre = rs.getString("nombreMaquinaAseo");
                    fechaL= rs.getString("fechaLlegada");
                     fechaS = rs.getString("fechaSalida");
                     idTp= rs.getInt("idTipoMaquinaf");
                    
                    listaM.add(new maquinas_de_aseo(id, idTp, nombre, fechaL, fechaS));
                }
            } catch (SQLException ex) {
                Logger.getLogger(productos_aseo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaM;
    }
    
    
}
