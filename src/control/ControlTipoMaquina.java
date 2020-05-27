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

    public boolean deleteTipoMaquina(tipo_maquina_aseo objTipoMaquina) {
        boolean t=false;
        tipo_maquina_aseo obj2 = new tipo_maquina_aseo();
        String sql="delete from tipos_de_maquina_aseo where idTipoMaquina= " + objTipoMaquina.getIdTipoMaquina()+"";
        t=obj2.SQL(sql);
        return t;
    }

    public LinkedList<tipo_maquina_aseo> consultarMaquinas() {
        LinkedList<tipo_maquina_aseo> listaa = new LinkedList<>();
        tipo_maquina_aseo objtm = new tipo_maquina_aseo();
        String sql = "select * from tipos_de_maquina_aseo;";
        listaa = objtm.consultarTipoMaquinas(sql);
        return listaa;
    }

    public boolean editarTipoMaquinas(tipo_maquina_aseo objT) {
        
        boolean t=false;
       
            String sql="UPDATE  tipos_de_maquina_aseo SET tipoMaquinaAseo='"+ objT.getTipoMquinaAseo()+"'" +" WHERE idTipoMaquina="+objT.getIdTipoMaquina()+";";

            t=objT.SQL(sql);
                 return t;
        
        
    }
    
}
