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
    
     public LinkedList<detalle_Servicio> consultarDetalleServicioX() {
        LinkedList<detalle_Servicio> listads = new LinkedList<>();
        detalle_Servicio objds = new detalle_Servicio();
        String sql = "select * from detalles_servicios;";
        listads = objds.consultarDetalleServicio(sql);
        return listads;
    }
    
    
    
    
    public boolean insertarDetalleServicio(LinkedList<detalle_Servicio> listaDS) {
        boolean t=false;
       
        for (int i = 0; i <listaDS.size(); i++) {
           detalle_Servicio objDS = listaDS.get(i);
            String sql="insert into detalles_servicios (fechaInicioServicio,fechaVenceServicio,nitUnidadf) "
                    + "value('"+objDS.getFechaInicioServicio()+"', '"+objDS.getFechaVenceServicio()+"','"+objDS.getNitUnidadf()+"');";
            
            t=objDS.sqlDetalleServicio(sql);
        }
        return t;
    }
    
     public boolean deleteDetalleServicio(int id) {
        boolean t=false;
        detalle_Servicio obj = new detalle_Servicio();
        String sql="delete  from detalle_servicio where idServicioD= "+id+";";
        t=obj.sqlDetalleServicio(sql);
        return t;
    }
     
     public boolean updateDetalleServicio(detalle_Servicio objDS) {
        boolean t=false;
       
           
            String sql="UPDATE detalles_servicios  SET fechaInicioServicio='"+objDS.getFechaInicioServicio() +"', fechaVenceServicio='"+ objDS.getFechaVenceServicio()+"' "
                    + "WHERE idServicioD="+objDS.getIdServicioD() +";"; 
            t=objDS.sqlDetalleServicio(sql);
        
        return t;
    }
     
}
