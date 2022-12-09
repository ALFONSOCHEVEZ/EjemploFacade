///// Alfonso Espinoza /////
package Arrays;

import Modelo.Cliente;
import java.util.ArrayList;

/////Hola negro (probado si se actualiza el GITHUB)  ///////7
public class ArrayList_Clientes {
    
    ////////////////////////////////////////////////////////////////////////////
    private ArrayList<Cliente> clientes = new ArrayList<>();
    ////////////////////////////////////////////////////////////////////////////
    public static ArrayList_Clientes controladorarraycliente;
    ////////////////////////////////////////////////////////////////////////////
    public ArrayList_Clientes(){
        clientes= new ArrayList<Cliente>();
    }
    ////////////////////////////////////////////////////////////////////////////
    public static ArrayList_Clientes getInstance(){
        if(controladorarraycliente == null)
            controladorarraycliente = new ArrayList_Clientes();
        return controladorarraycliente;
    }
    ////////////////////////////////////////////////////////////////////////////
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
///// Alfonso Espinoza /////