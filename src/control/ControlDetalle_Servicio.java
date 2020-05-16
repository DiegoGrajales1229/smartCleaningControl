/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.detalle_Servicio;

/**
 *
 * @author Diego Alejandro
 */
public class ControlDetalle_Servicio {
     public boolean insertarDetalleServicio(LinkedList<detalle_Servicio> listaDS) {
        boolean t=false;
       
        for (int i = 0; i <listaDS.size(); i++) {
           detalle_Servicio objDS = listaDS.get(i);
            String sql="insert into productos_aseo (fechaInicioServicio,fechaVenceServicio,nitUnidadf) "
                    + "value('"+objDS.getFechaInicioServicio()+"', '"+objDS.getFechaVenceServicio()+"','"+objDS.getNitUnidadf()+"');";
            
            t=objDS.sqlDetalleServicio(sql);
        }
        return t;
    }
    
    
    
     public LinkedList<detalle_Servicio> consultarDetalleServicios() {
        LinkedList<detalle_Servicio> lista = new LinkedList<>();
        detalle_Servicio obj = new detalle_Servicio();
        String sql = "select * from detalles_servicios;";
        lista = obj.consultarDetalleServicio(sql);
        return lista;
    }

    public boolean deleteDetalleServicio(int id) {
        boolean t=false;
        detalle_Servicio obj = new detalle_Servicio();
        String sql="delete  from detalle_servicio where idServicioD= "+id+";";
        t=obj.sqlDetalleServicio(sql);
        return t;
    }
    
}
