///// Alfonso Espinoza /////
package Controlador;

import Arrays.ArrayList_Clientes;
import Arrays.ArrayList_Pedidos;
import Arrays.ArrayLists_Empleados;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Pedidos;
import java.util.ArrayList;



public class Ingresar_Datos {
    
    public static ArrayLists_Empleados arrayempleados = new ArrayLists_Empleados();
    public static ArrayList_Clientes arrayclientes = new ArrayList_Clientes();
    public static ArrayList_Pedidos arraypedidos = new ArrayList_Pedidos();
    ////////////////////////////////////////////////////////////////////////////
    public static ArrayList<Cliente> clientes = new ArrayList();
    public static ArrayList<Empleado> empleados = new ArrayList();
    public static ArrayList<Pedidos> pedidos = new ArrayList();
    ////////////////////////////////////////////////////////////////////////////
    public static void ingresardatosclientes(){
        Cliente messi = new Cliente("Gualaceo","10023","0912347856",
                "Lionel","Messi");
        //////////////////////////////////////////////
        Cliente neymar = new Cliente("Cuenca","10056","0978123456",
                "Neymar","DeSantos");
        //////////////////////////////////////////////
        Cliente cr7 = new Cliente("Azogues","07001","0914572386",
                "Cristiano","Ronaldo");
        //////////////////////////////////////////////
        clientes.add(messi);
        clientes.add(neymar);
        clientes.add(cr7);
        arrayclientes.getInstance().setClientes(clientes);
        //////////////////////////////////////////////
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void ingresardatosempleados(){
        Empleado salah = new Empleado("11001","0912214756","Mohamed","Salah");
        Empleado modrick = new Empleado("10031","0922147156","Luka","Modric");
        Empleado lewandowski= new Empleado("09001","0946212751","Robert","Lewandowski");
        //////////////////////////////////////////////
        empleados.add(salah);
        empleados.add(modrick);
        empleados.add(lewandowski);
        arrayempleados.getInstance().setEmpleados(empleados);
        //////////////////////////////////////////////
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void ingresarpedidos(){
    Pedidos pedido1 = new Pedidos("001100","10023","Salchipapa Grande",2.50);
    Pedidos pedido2 = new Pedidos("012340","10056","Papi Pollo Sencillo",1.50);
    Pedidos pedido3 = new Pedidos("014321","07001","Seco de Pollo",2.50);
    pedidos.add(pedido1);
    pedidos.add(pedido2);
    pedidos.add(pedido3);
    arraypedidos.getInstance().setPedidoss(pedidos);
    }
    ////////////////////////////////////////////////////////////////////////////

}
    
    
    
///// Alfonso Espinoza /////