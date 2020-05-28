/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.maquina_unidad;

/**
 *
 * @author Diego Alejandro
 */
public class ControlMaquina_Unidad {

    public boolean insertarMaquinaUnidad(LinkedList<maquina_unidad> listaMU) {
       boolean t=false;
     
        for (int i = 0; i <listaMU.size(); i++) {
          maquina_unidad pu = listaMU.get(i);
            String sql="insert into maquina_unidad ( idServicioDf, idMaquinaAseof) "
                    + "values('"+ pu.getIdServicioDf()+"' , '" + pu.getIdMaquinaAseof()+"' );";
            
            t=pu.SQL(sql);
        }
        
        
        return t;
    }
    
}
