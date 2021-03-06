/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.productos_aseo;
import modelo.unidad_residencial;

/**
 *
 * @author Diego Alejandro
 */
public class ControlUnidad_Residencial {
    
    
      public LinkedList<unidad_residencial> consultarUnidadResidencial() {
        LinkedList<unidad_residencial> lista = new LinkedList<>();
       unidad_residencial obj = new unidad_residencial();
        String sql = "select * from unidades_residenciales;";
        lista = obj.consultarUnidadR(sql);
        return lista;
    }
      
      
      public LinkedList<unidad_residencial> consultarUnidadResidencialLibre() {
        LinkedList<unidad_residencial> lista = new LinkedList<>();
       unidad_residencial obj = new unidad_residencial();
        String sql = "SELECT  ur.nitUnidad, ur.nombreUnidadResidencial, ur.fechaContratoUnidad, ur.direccionUnidad, ur.idAdminf FROM unidades_residenciales ur\n" +
"LEFT JOIN detalles_servicios ds ON ur.nitUnidad=ds.nitUnidadf WHERE ds.idServicioD is null ;";
        
        lista = obj.consultarUnidadR(sql);
        return lista;
    }
      
      
      
      
       public boolean insertarUnidadResidencial(LinkedList<unidad_residencial> listaUR) {
        boolean t=false;
       
        for (int i = 0; i <listaUR.size(); i++) {
           unidad_residencial ur = listaUR.get(i);
            String sql="insert into unidades_residenciales (nitUnidad,nombreUnidadResidencial,fechaContratoUnidad,direccionUnidad,idAdminf) "
                    + "value('"+ur.getNitUnidad()+"','"+ur.getNombreUnidadResidencial()+"','"+ur.getFechaContratoUnidad()+"','"+ur.getDireccionUnidad()+"',"+ur.getIdAdminf()+");";
            
            t=ur.sqlUnidadResidencial(sql);
        }
  
        return t;
        
    }
       
       public boolean deleteUnidadResidencial(String nit) {
        boolean t=false;
        productos_aseo obj2 = new productos_aseo();
        String sql="delete  from unidades_residenciales where nitUnidad= '"+nit+"';";
        t=obj2.sqlProductoAseo(sql);
        return t;
    }
       
       
       public boolean editarUnidadResidencial(unidad_residencial ur) {
        boolean t=false;
       
        
            String sql="UPDATE unidades_residenciales SET (nitUnidad='"+ur.getNitUnidad()+"',nombreUnidadResidencial='"+ur.getNombreUnidadResidencial()+"'"
                    + ",fechaContratoUnidad='"+ur.getFechaContratoUnidad()+"',direccionUnidad='"+ur.getDireccionUnidad()+"',idAdminf="+ur.getIdAdminf()+") "
                    + "WHERE nitUnidad=  '"+ur.getNitUnidad()+"';";              
            
            t=ur.sqlUnidadResidencial(sql);
        
  
        return t;
        
    }
}
