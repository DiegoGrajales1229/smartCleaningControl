/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.producto_unidad;
import modelo.producto_unidadADV;

/**
 *
 * @author Diego Alejandro
 */
public class ControlProducto_Unidad {
    
    
    
      public boolean insertarProductoUnidad(LinkedList<producto_unidad> listaProUn) {
        boolean t=false;
     
        for (int i = 0; i <listaProUn.size(); i++) {
          producto_unidad pu = listaProUn.get(i);
            String sql="insert into producto_unidad (idServicioDf, idProductoAseof, fechaUnidadProducto) "
                    + "value("+ pu.getIdServicioDf()+" , " + pu.getIdProductoAseof()+", '"+pu.getFechaUnidadProducto()  +"' );";
            
            t=pu.sqlProductoUnidad(sql);
        }
        
        
        return t;
        
        
    }
    
    
    
     public LinkedList<producto_unidad> consultarProductoUnidad() {
        LinkedList<producto_unidad> lista = new LinkedList<>();
        producto_unidad obj = new producto_unidad();
        String sql = "select * from producto_unidad;";
        
                
        lista = obj.consultarProductoUnidad(sql);
        return lista;
    }
     
     public LinkedList<producto_unidad> consultarProductoUnidadBodega() {
        LinkedList<producto_unidad> lista = new LinkedList<>();
        producto_unidad obj = new producto_unidad();
        String sql = "select * from producto_unidad PU WHERE PU.idServicioDf is null  or PU.idServicioDf=2;";
        
                
        lista = obj.consultarProductoUnidad(sql);
        return lista;
    }
     
      public LinkedList<producto_unidadADV> consultarProductoUnidadAdv() {
     LinkedList<producto_unidadADV> lista = new LinkedList<>();
        producto_unidad obj = new producto_unidad();
        
     
        String sql2="SELECT pu.idProductoU , pa.nombreProductoAseo npa, \n" +
"pu.idServicioDf untService, ur.nombreUnidadResidencial nur,\n" +
" pu.fechaUnidadProducto fecha FROM smartcleaningcontrol.producto_unidad pu\n" +
" LEFT JOIN detalles_servicios ds ON pu.idServicioDf= ds.idServicioD\n" +
" LEFT JOIN unidades_residenciales ur ON ds.nitUnidadf= ur.nitUnidad  \n" +
" LEFT JOIN productos_aseo pa ON pa.idProductoAseo= pu.idProductoAseof\n" +
" ORDER BY   YEAR (fechaUnidadProducto) DESC, MONTH(fechaUnidadProducto) DESC, DAY(fechaUnidadProducto) DESC;";
                
        lista = obj.consultarProductoUnidadADV(sql2);
        return lista;
      }
      
      
      
      

    public boolean deleteProductoUnidad(int id) {
        boolean t=false;
        producto_unidad obj2 = new producto_unidad();
        String sql="delete  fromproducto_unidad where idProductoU= "+id+";";
        t=obj2.sqlProductoUnidad(sql);
        return t;
    }
    
    
    public boolean updateTipoProducto(producto_unidad tpa) {
        boolean t=false;
        producto_unidad obj2 = new producto_unidad();
        String sql="UPDATE producto_unidad SET  idServicioDf="+ tpa.getIdServicioDf() +"  WHERE idProductoU="+tpa.getIdProductoU();
        t=obj2.sqlProductoUnidad(sql);
        return t;
    }
    
}
