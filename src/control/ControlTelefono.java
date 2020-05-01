/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.telefono;

/**
 *
 * @author Diego Alejandro
 */
public class ControlTelefono {

    public boolean insertarTelefono(LinkedList<telefono> listaT) {
        boolean t=false;
        telefono objT=new telefono();
        for (int i = 0; i < listaT.size(); i++) {
            telefono getobjeto = listaT.get(i);
            String sql="insert into telefonos(telefono,idEmpleadof) "
                    + "value('"+getobjeto.getTelefono()+"','"+getobjeto.getIdEmpleadof()+"');";
            t=objT.SQL(sql);
        }
        
        
        return t;
    }
    
}
