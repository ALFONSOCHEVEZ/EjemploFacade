///// Alfonso Espinoza /////
package Controlador;
 
import Arrays.ArrayList_Clientes;
import Arrays.ArrayList_Pedidos;
import Arrays.ArrayLists_Empleados;
import static Controlador.Controlador_Cliente.pc;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Pedidos;
import Vista.Cruce;
import Vista.Pantalla_EmpleadoCaja;
import Vista.Pantalla_EmpleadoModerador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class Controlador_Empleado {
    ////////////////////////////////////////////////////////////////////////////
    public static Pantalla_EmpleadoCaja pantalla = new Pantalla_EmpleadoCaja();
    
    public static DefaultTableModel modelo_tabla;
    ////////////////////////////////////////////////////////////////////////////
    public Controlador_Empleado(Pantalla_EmpleadoCaja pantalla){
        pantalla=pantalla;
        abrir();
        abrircontrol();   
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void abrircontrol(){
        pantalla.getBtn_ver_pedidos().addActionListener(l->mostrardatospedidos());
        pantalla.getBtn_regresar().addActionListener(l->cerrar());
        pantalla.getBtn_irmoderador().addActionListener(l->abrirmoderador());
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void abrir(){
        pantalla.setVisible(true);
    }
    public static void cerrar(){
        pantalla.setVisible(false);
        //////
        Cruce cruce = new Cruce();
        Controlador_Cruce cc = new Controlador_Cruce(cruce);       
    }
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////    
    public static void abrirmoderador(){
        pantalla.setVisible(false);
        
        Pantalla_EmpleadoModerador pem = new Pantalla_EmpleadoModerador();
        Controlador_Moderador cm = new Controlador_Moderador(pem);
    }
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////   
    public static void mostrardatospedidos(){

        ArrayList_Pedidos ap = new ArrayList_Pedidos();
        ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();
        pedidos=ArrayList_Pedidos.getInstance().getPedidos();
        //////////////////// 
        modelo_tabla = (DefaultTableModel) pantalla.getTabla_pedidos().getModel();
        modelo_tabla.setRowCount(0);
        //JOptionPane.showMessageDialog(null,""+arraypass.size());
        ////////////////////
        for(int i=0 ; i<pedidos.size() ; i++){
            Object[] fila = {(i+1),pedidos.get(i).getId(),pedidos.get(i).getId_cliente(),pedidos.get(i).getDescripcion(),
            pedidos.get(i).getMonto_final()};
            modelo_tabla.addRow(fila);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////// 
}
///// Alfonso Espinoza /////