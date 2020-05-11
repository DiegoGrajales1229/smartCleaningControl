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
        
        String sql2="SELECT producto_unidad.idProductoU, productos_aseo.nombreProductoAseo npa, producto_unidad.idServicioDf untService,\n" +

" unidades_residenciales.nombreUnidadResidencial nur, producto_unidad.fechaUnidadProducto FROM (producto_unidad \n" +

" unidades_residenciales.nombreUnidadResidencial nur, producto_unidad.fechaUnidadProducto fecha FROM (producto_unidad \n" +

" LEFT JOIN unidades_residenciales ur ON untService= ur.nitUnidad)\n" +
" LEFT JOIN productos_aseo pa ON pa.idProductoAseo= producto_unidad.idProductoAseof\n" +
" ORDER BY  idServicioDf, fechaUnidadProducto;";
                
        lista = obj.consultarProductoUnidad(sql);
        return lista;
    }
     
     
      public LinkedList<producto_unidadADV> consultarProductoUnidadAdv() {
     LinkedList<producto_unidadADV> lista = new LinkedList<>();
        producto_unidad obj = new producto_unidad();
        
     
        String sql2="SELECT producto_unidad.idProductoU, productos_aseo.nombreProductoAseo npa, producto_unidad.idServicioDf untService,\n" +

" unidades_residenciales.nombreUnidadResidencial nur, producto_unidad.fechaUnidadProducto FROM (producto_unidad \n" +

" unidades_residenciales.nombreUnidadResidencial nur, producto_unidad.fechaUnidadProducto fecha FROM (producto_unidad \n" +

" LEFT JOIN unidades_residenciales ur ON untService= ur.nitUnidad)\n" +
" LEFT JOIN productos_aseo pa ON pa.idProductoAseo= producto_unidad.idProductoAseof\n" +
" ORDER BY   YEAR (fechaUnidadProducto) DESC, MONTH(fechaUnidadProducto) DESC, DAY(fechaUnidadProducto) DESC   GROUP BY idServicioDf;";
                
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
    
}
