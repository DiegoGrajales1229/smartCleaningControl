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

    public LinkedList<telefono> consultarSoloTelefonos() {
        
         LinkedList<telefono> listatf = new LinkedList<>();
        telefono objte = new telefono();
        String sql = "select * from telefonos;";
        listatf = objte.consultarUnicamenteTelefonos(sql);
        return listatf;
    }

    public boolean deleteTelefono(telefono objTel) {
        boolean t=false;
        telefono obj2 = new telefono();
        String sql="delete from telefonos where idTelefono= " + objTel.getIdTelefono()+"";
        t=obj2.SQL(sql);
        return t;
    }

    public LinkedList<telefono> consultarTelefonoCompleto() {
         LinkedList<telefono> listatf = new LinkedList<>();
        telefono objte = new telefono();
        String sql = "select * from telefonos;";
        listatf = objte.consultarTelefonoCompleto(sql);
        return listatf;
    }
    
    public boolean editarTelefonos(telefono objT){
        boolean t=false;
       
            String sql="UPDATE  telefonos SET telefono='"+ objT.getTelefono()+"'" +" WHERE idTelefono="+objT.getIdTelefono()+";";

            t=objT.SQL(sql);
                 return t;
    }
            
    
}
