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
            t=objTiProAs.insertTipoProducto(sql);
        }
        
        
        return t;
        
        
    }
    
}