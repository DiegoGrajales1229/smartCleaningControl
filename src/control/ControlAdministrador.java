/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.administrador;

/**
 *
 * @author Diego Alejandro
 */
public class ControlAdministrador {

    public boolean insertarAdministradores(LinkedList<administrador> listaAdmin) {
        boolean t=false;
        administrador objAdmin=new administrador();
        for (int i = 0; i < listaAdmin.size(); i++) {
            administrador getobjeto = listaAdmin.get(i);
            String sql="insert into administradores(nombre1Admin,nombre2Admin,apellido1Admin,apellido2Admin,correoAdmin) "
                    + "value('"+getobjeto.getNombre1Admin()+"','"+getobjeto.getNombre2Admin()+"','"+getobjeto.getApellido1Admin()+"','"+getobjeto.getApellido2Admin()+"','"+getobjeto.getCorreoAdmin()+"');";
            t=objAdmin.insertAdmin(sql);
        }
        
        
        return t;
        
        
    }
    
}
