/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.tipo_maquina_aseo;

/**
 *
 * @author Diego Alejandro
 */
public class ControlTipoMaquina {

    public boolean insertarTipoMaquina(LinkedList<tipo_maquina_aseo> listaTipoMaq) {
        boolean t=false;
        tipo_maquina_aseo objTM=new  tipo_maquina_aseo();
        for (int i = 0; i <listaTipoMaq.size(); i++) {
           tipo_maquina_aseo getobjeto = listaTipoMaq.get(i);
            String sql="insert into tipos_de_maquina_aseo (tipoMaquinaAseo) value('"+getobjeto.getTipoMquinaAseo()+"');";
            t=objTM.insertTipoMaquina(sql);
        }
        
        
        return t;
    }
    
}
