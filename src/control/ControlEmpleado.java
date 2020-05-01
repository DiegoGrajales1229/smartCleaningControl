/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.empleado;

/**
 *
 * @author Diego Alejandro
 */
public class ControlEmpleado {

    public LinkedList<empleado> consultarEmpleados() {
       LinkedList<empleado> listae = new LinkedList<>();
        empleado objem = new empleado();
        String sql = "select * from empleados;";
        listae = objem.consultarEmpleadoTelefonos(sql);
        return listae;
    }
    
}
