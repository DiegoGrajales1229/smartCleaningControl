/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.productos_aseo;

/**
 *
 * @author Diego Alejandro
 */
public class ControlProducto_aseo {
    
    
    public boolean insertarProductoAseo(LinkedList<productos_aseo> listaProAs) {
        boolean t=false;
       productos_aseo objTiProAs=new  productos_aseo();
        for (int i = 0; i <listaProAs.size(); i++) {
           productos_aseo pa = listaProAs.get(i);
            String sql="insert into productos_aseo (nombreProductoAseo, precioProductoAseo, fechaDeCompraPA, idTipoProductof) "
                    + "value('"+ pa.getNombreProductoAseo()+"' , " + pa.getPrecioProductoAseo()+", '"+pa.getFechaDeCompra()  +"' , "+ pa.getIdTipoProductof() +");";
            
            t=pa.sqlProductoAseo(sql);
        }
        
        
        return t;
        
        
    }
    
    
    
     public boolean editarProductoAseo(productos_aseo pa) {
        boolean t=false;
       
            String sql="UPDATE  productos_aseo SET nombreProductoAseo='"+ pa.getNombreProductoAseo()+"', precioProductoAseo=" + pa.getPrecioProductoAseo()+""
                    + ", fechaDeCompraPA='"+pa.getFechaDeCompra()  +"', idTipoProductof="+ pa.getIdTipoProductof() +" WHERE idProductoAseo="+pa.getIdProductoAseo()+";";

            t=pa.sqlProductoAseo(sql);
                 return t;

    }
    
    
    
     public LinkedList<productos_aseo> consultarProducto() {
        LinkedList<productos_aseo> lista = new LinkedList<>();
        productos_aseo obj = new productos_aseo();
        String sql = "select * from productos_aseo;";
        lista = obj.consultarProducto(sql);
        return lista;
    }
     
      public LinkedList<productos_aseo> consultarProductoLibre() {
        LinkedList<productos_aseo> lista = new LinkedList<>();
        productos_aseo obj = new productos_aseo();
        String sql = "SELECT pa.idProductoAseo, pa.nombreProductoAseo, pa.precioProductoAseo, pa.fechaDeCompraPA, pa.idTipoProductof "
                + "FROM smartcleaningcontrol.productos_aseo pa LEFT JOIN producto_unidad pu " +
                 "ON pa.idProductoAseo=pu.idProductoAseof WHERE pu.idProductoU IS NULL;";
        lista = obj.consultarProducto(sql);
        return lista;
    }
     

    public boolean deleteProducto(int id) {
        boolean t=false;
        productos_aseo obj2 = new productos_aseo();
        String sql="delete  from productos_aseo where idProductoAseo= "+id+";";
        t=obj2.sqlProductoAseo(sql);
        return t;
    }
    
    
    
}
