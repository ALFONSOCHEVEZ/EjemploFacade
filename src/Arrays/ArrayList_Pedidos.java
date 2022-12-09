
package Arrays;

import Modelo.Pedidos;
import java.util.ArrayList;


public class ArrayList_Pedidos {
    ////////////////////////////////////////////////////////////////////////////
    private ArrayList<Pedidos> pedidoss = new ArrayList<>();
    ////////////////////////////////////////////////////////////////////////////
    public static ArrayList_Pedidos controladorarraypedidos;
    ////////////////////////////////////////////////////////////////////////////
    public ArrayList_Pedidos(){
        pedidoss= new ArrayList<Pedidos>();
    }
    ////////////////////////////////////////////////////////////////////////////
    public static ArrayList_Pedidos getInstance(){
        if(controladorarraypedidos == null)
            controladorarraypedidos = new ArrayList_Pedidos();
        return controladorarraypedidos;
    }
    ////////////////////////////////////////////////////////////////////////////
    public ArrayList<Pedidos> getPedidos() {
        return pedidoss;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    public void setPedidoss(ArrayList<Pedidos> pedidos) {
        this.pedidoss = pedidos;
    }

}
