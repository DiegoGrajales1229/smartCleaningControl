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

    public boolean insertarEmpleados(empleado objEm) {

        boolean t = false;
        empleado objEmp2 = new empleado();
        String sql = "";
        sql = "insert into empleados(nombre1Empleado,nombre2Empleado,apellido1Empleado,apellido2Empleado,fotoEmpleado,correoEmpleado,direccionEmpleado,numeroContratoEmpleado,salarioMensualEmpleado,idServicioDf) "
                + "values(?,?,?,?,?,?,?,?,?,?)";
        t = objEmp2.insertarEmpleados(objEm, sql);

        return t;

    }

}
