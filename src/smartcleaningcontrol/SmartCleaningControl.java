/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcleaningcontrol;

import control.BaseDatos;

/**
 *
 * @author Diego Alejandro
 */
public class SmartCleaningControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseDatos objB=new BaseDatos();
        boolean t=objB.crearConexion();
        if(t==true){
            System.out.println("Conexion exitosa");
        }else{
            System.out.println("Conexion No exitosa");
        }
    }
    
}
