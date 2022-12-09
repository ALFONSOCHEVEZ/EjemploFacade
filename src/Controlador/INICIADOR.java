/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Controlador_Cruce;
import Controlador.Controlador_Empleado;
import Vista.Cruce;
import Vista.Pantalla_EmpleadoCaja;

/**
 *
 * @author USER A
 */
public class INICIADOR {

    //// public static Pantalla_EmpleadoCaja pantalla = new Pantalla_EmpleadoCaja();
        
    public static Cruce cruce = new Cruce();
        
    public static void main(String[] args) {
        Controlador_Cruce cc = new Controlador_Cruce(cruce); 
        ////Controlador_Pantalla cp = new Controlador_Empleado(pantalla);
    }
    
}
