/////  Alfonso Espinoza   /////
package Controlador;


import Arrays.ArrayList_Clientes;
import Arrays.ArrayLists_Empleados;
import Modelo.Cliente;
import Modelo.Empleado;
import Vista.Pantalla_EmpleadoCaja;
import Vista.Pantalla_EmpleadoModerador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;



public class Controlador_Moderador {
    
    public static Pantalla_EmpleadoModerador pem = new Pantalla_EmpleadoModerador();
    public static DefaultTableModel modelo_tabla;
    ///////////////////////
    public Controlador_Moderador(Pantalla_EmpleadoModerador pem){
        this.pem=pem;
        ////////////////////
        abrir();
        cerebro();
        ////////////////////        
    }
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    public static void cerebro(){
        pem.getBtn_regresar().addActionListener(l->cerrar());
        //////////////////////
        pem.getBtn_ingresarem().addActionListener(l->ingresarempleados());
        //////////////////////
        pem.getBtn_ingresarclientes().addActionListener(l->ingresarclientes());
        //////////////////////
        pem.getBtn_mostrar_clientes().addActionListener(l->mostrardatosclientes());
        //////////////////////
        pem.getBtn_mostrar_empleados().addActionListener(l->mostrardatosempleados());
    }
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    public static void ingresarempleados(){
        Ingresar_Datos igd = new Ingresar_Datos();
        igd.ingresardatosempleados();
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void ingresarclientes(){
        Ingresar_Datos igd = new Ingresar_Datos();
        igd.ingresardatosclientes();
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void abrir(){
        pem.setVisible(true);
    }
    public static void cerrar(){
        pem.setVisible(false);
        //////
        Pantalla_EmpleadoCaja pe = new Pantalla_EmpleadoCaja();
        Controlador_Empleado cp = new Controlador_Empleado(pe);     
    }
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    public static void mostrardatosempleados(){

        ArrayLists_Empleados ae = new ArrayLists_Empleados();
        ArrayList<Empleado> empleadoss = new ArrayList<Empleado>();
        empleadoss=ArrayLists_Empleados.getInstance().getEmpleados();
        //////////////////// 
        modelo_tabla = (DefaultTableModel) pem.getTabla_empleados().getModel();
        modelo_tabla.setRowCount(0);
        //JOptionPane.showMessageDialog(null,""+arraypass.size());
        ////////////////////
        for(int i=0 ; i<empleadoss.size() ; i++){
            //(String identi, String id, String nombre, String apellido
            Object[] fila = {(i+1),empleadoss.get(i).getIdenti(),empleadoss.get(i).getId(),
            empleadoss.get(i).getNombre(),empleadoss.get(i).getApellido()};
            modelo_tabla.addRow(fila);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////// 
    public static void mostrardatosclientes(){

        ArrayList_Clientes ac = new ArrayList_Clientes();
        ArrayList<Cliente> clientess = new ArrayList<Cliente>();
        clientess=ArrayList_Clientes.getInstance().getClientes();
        //////////////////// 
        modelo_tabla = (DefaultTableModel) pem.getTabla_cliente().getModel();
        modelo_tabla.setRowCount(0);
        //JOptionPane.showMessageDialog(null,""+arraypass.size());
        ////////////////////
        for(int i=0 ; i<clientess.size() ; i++){
 
            Object[] fila = {(i+1),clientess.get(i).getId_clien(),clientess.get(i).getId(),
            clientess.get(i).getNombre(),clientess.get(i).getApellido()};
            modelo_tabla.addRow(fila);
        }
    }

}
/////  Alfonso Espinoza   /////