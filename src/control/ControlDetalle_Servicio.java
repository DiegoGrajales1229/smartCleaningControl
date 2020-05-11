/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.detalle_Servicio;
import modelo.empleado;

/**
 *
 * @author Diego Alejandro
 */
public class ControlDetalle_Servicio {

    public LinkedList<detalle_Servicio> consultarDetalleServicio() {
        LinkedList<detalle_Servicio> listads = new LinkedList<>();
        detalle_Servicio objds = new detalle_Servicio();
        String sql = "select * from detalles_servicios;";
        listads = objds.consultarUnicamenteRangoFechas(sql);
        return listads;
    }

    
    
}
