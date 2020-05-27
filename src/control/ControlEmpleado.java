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

    public boolean editarEmpleados(empleado objE) {
        
          boolean t=false;
       
            String sql="UPDATE  empleados SET nombre1Empleado='"+ objE.getNombre1Empleado()+"', nombre2Empleado='" + objE.getNombre2Empleado()+"' "
                    + ", apellido1Empleado='"+objE.getApellido1Empleado()+"', apellido2Empleado='"+ objE.getApellido2Empleado()+"'"+", correoEmpleado='"+objE.getCorreoEmpleado()+"'"+", direccionEmpleado='"+objE.getDireccionEmpleado()+"', numeroContratoEmpleado='"+objE.getNumeroContratoEmpleado()+"', salarioMensualEmpleado='"+objE.getSalarioMensualEmpleado() +"' WHERE idEmpleado="+objE.getIdEmpleado()+";";

            t=objE.SQL(sql);
                 return t;
        
        
        
        
    }

    public LinkedList<empleado> consultarTodosLosEmpleados() {
        LinkedList<empleado> listae = new LinkedList<>();
        empleado objem = new empleado();
        String sql = "select * from empleados;";
        listae = objem.consultarEmpleados(sql);
        return listae;
    }

}
