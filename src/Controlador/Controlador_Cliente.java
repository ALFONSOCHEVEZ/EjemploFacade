/////  Alfonso Espinoza   /////
package Controlador;

import Vista.Cruce;
import Vista.Pantalla_Cliente;

/**
 *
 * @author USER A
 */
public class Controlador_Cliente {
    ////////////////////////////////////////////////////////////////////////////
    public static Pantalla_Cliente pc = new Pantalla_Cliente();
    public static Ingresar_Datos ind = new Ingresar_Datos();
    ////////////////////////////////////////////////////////////////////////////
    public Controlador_Cliente(Pantalla_Cliente pc){
        this.pc=pc;
        //////////
        abrir();
        cerebro();
        //////////
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void cerebro(){
        pc.getBtn_regresar().addActionListener(l->cerrar());
        ////////////////////
        pc.getBtn_hacerpedido().addActionListener(l->hacerpedidos());
      
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void abrir(){
        pc.setVisible(true);
    }
    public static void cerrar(){
        pc.setVisible(false);
        //////
        Cruce cruce = new Cruce();
        Controlador_Cruce cc = new Controlador_Cruce(cruce);       
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void hacerpedidos(){
        ind.ingresarpedidos();
    }
    ////////////////////////////////////////////////////////////////////////////
    
    
}
/////  Alfonso Espinoza   /////