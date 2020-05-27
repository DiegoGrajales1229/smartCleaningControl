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
            t=objAdmin.SQL(sql);
        }
        
        
        return t;
        
        
    }

    public LinkedList<administrador> consultarAdministradores() {
        LinkedList<administrador> listaa = new LinkedList<>();
        administrador objad = new administrador();
        String sql = "select * from administradores;";
        listaa = objad.consultarAdministradores(sql);
        return listaa;
    }

    public boolean deleteAdmin(administrador objAdmin) {
        boolean t=false;
        administrador obj2 = new administrador();
        String sql="delete from administradores where idAdmin= " + objAdmin.getIdAdmin()+"";
        t=obj2.SQL(sql);
        return t;
    }

    public boolean editarAdministrador(administrador objA) {
         boolean t=false;
       
            String sql="UPDATE  administradores SET nombre1Admin='"+ objA.getNombre1Admin()+"', nombre2Admin='" + objA.getNombre2Admin()+"' "
                    + ", apellido1Admin='"+objA.getApellido1Admin()  +"', apellido2Admin='"+ objA.getApellido2Admin()+"'"+", correoAdmin='"+objA.getCorreoAdmin()+"'" +" WHERE idAdmin="+objA.getIdAdmin()+";";

            t=objA.SQL(sql);
                 return t;
    }

}
