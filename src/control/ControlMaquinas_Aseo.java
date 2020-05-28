/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.maquinas_de_aseo;

/**
 *
 * @author Diego Alejandro
 */
public class ControlMaquinas_Aseo {

    public boolean insertarMaquinasAseo(LinkedList<maquinas_de_aseo> listaMaquina) {
        
         boolean t=false;
       maquinas_de_aseo objTipoMaquina=new  maquinas_de_aseo();
        for (int i = 0; i <listaMaquina.size(); i++) {
           maquinas_de_aseo maquina = listaMaquina.get(i);
            String sql="insert into maquinas_aseo (nombreMaquinaAseo, fechaLlegada, fechaSalida, idTipoMaquinaf) "
                    + "value('"+ maquina.getNombreMaquinaAseo()+"' , " + maquina.getFechaLlegada()+", '"+maquina.getFechaSalida()+"' , "+ maquina.getIdTipoMaquinaf()+");";
            
            t=maquina.SQL(sql);
        }
        
        
        return t;
        
        
        
    }

    public LinkedList<maquinas_de_aseo> consultarMaquinasAseo() {
        
        LinkedList<maquinas_de_aseo> ma = new LinkedList<>();
        
                
               return ma;
    }
    
}
