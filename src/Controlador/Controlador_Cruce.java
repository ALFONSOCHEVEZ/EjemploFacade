/////  Alfonso Espinoza   /////
package Controlador;

import Vista.Cruce;
import Vista.Pantalla_Cliente;
import Vista.Pantalla_EmpleadoCaja;

public class Controlador_Cruce {
    
    public static Cruce cruce = new Cruce();
        
    public Controlador_Cruce(Cruce cruce){
        this.cruce=cruce;
        abrir();
        cerebro();
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void cerebro(){
        cruce.getBtn_cliente().addActionListener(l->abrircliente());
        ///////////////////////
        cruce.getBtn_salir().addActionListener(l->cerrar());
        ///////////////////////
        cruce.getBtn_empleado().addActionListener(l->abrirempleado());
        ///////////////////////
    }
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    public static void abrir(){
        cruce.setVisible(true);
    }
    public static void cerrar(){
        cruce.setVisible(false);
        System.exit(0);
    }
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////   
    public static void abrircliente(){
        cruce.setVisible(false);
        /////
        Pantalla_Cliente pantallac = new Pantalla_Cliente();
        Controlador_Cliente cc = new Controlador_Cliente(pantallac);
        cruce.setVisible(false);
    }    
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    public static void abrirempleado(){
        cruce.setVisible(false);
        /////
        Pantalla_EmpleadoCaja pe = new Pantalla_EmpleadoCaja();
        Controlador_Empleado cp = new Controlador_Empleado(pe);  
        cruce.setVisible(false);
    }
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
}
/////  Alfonso Espinoza   /////
//​ (卐) //