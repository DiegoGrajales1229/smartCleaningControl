/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.tipo_producto_aseo;

/**
 *
 * @author Juan Diego Tabares
 */
public class controlTipoProducto {
    
    public boolean insertarTipoProducto(LinkedList<tipo_producto_aseo> listaTiProAs) {
        boolean t=false;
        tipo_producto_aseo objTiProAs=new  tipo_producto_aseo();
        for (int i = 0; i <listaTiProAs.size(); i++) {
           tipo_producto_aseo getobjeto = listaTiProAs.get(i);
            String sql="insert into tipos_de_producto_aseo (tipoProductoAseo) value('"+getobjeto.getTipoProductoAseo()+"');";
            t=objTiProAs.sqlTipoProducto(sql);
        }
        
        
        return t;
        
        
    }
    
    
    
     public LinkedList<tipo_producto_aseo> consultarTipoProducto() {
        LinkedList<tipo_producto_aseo> lista = new LinkedList<>();
        tipo_producto_aseo obj = new tipo_producto_aseo();
        String sql = "select * from tipos_de_producto_aseo;";
        lista = obj.consultarTipoProducto(sql);
        return lista;
    }
     
     public LinkedList<tipo_producto_aseo> consultarTipoProductoLibres() {
        LinkedList<tipo_producto_aseo> lista = new LinkedList<>();
        tipo_producto_aseo obj = new tipo_producto_aseo();
        String sql ="select tpa.idTipoProducto, tpa.tipoProductoAseo from tipos_de_producto_aseo tpa "
                + "LEFT JOIN  productos_aseo pa ON tpa.idTipoProducto=pa.idTipoProductof WHERE pa.idProductoAseo is null ;";
        lista = obj.consultarTipoProducto(sql);
        return lista;
    }

    public boolean deleteTipoProducto(int id) {
        boolean t=false;
        tipo_producto_aseo obj2 = new tipo_producto_aseo();
        String sql="delete  from tipos_de_producto_aseo where idTipoProducto= "+id+";";
        t=obj2.sqlTipoProducto(sql);
        return t;
    }
    
    
    
    public boolean updateTipoProducto(tipo_producto_aseo tpa) {
        boolean t=false;
        tipo_producto_aseo obj2 = new tipo_producto_aseo();
        String sql="UPDATE tipos_de_producto_aseo SET  tipoProductoAseo ='"+ tpa.getTipoProductoAseo()+"'  WHERE idTipoProducto= "+tpa.getIdTipoProducto()+";";
        t=obj2.sqlTipoProducto(sql);
        return t;
    }
    
}
