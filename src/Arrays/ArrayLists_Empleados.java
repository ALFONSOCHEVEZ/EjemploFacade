///// Alfonso Espinoza /////
package Arrays;

import Modelo.Empleado;
import java.util.ArrayList;


public class ArrayLists_Empleados {
    ////////////////////////////////////////////////////////////////////////////
    private ArrayList<Empleado> empleados = new ArrayList<>();
    ////////////////////////////////////////////////////////////////////////////
    public static ArrayLists_Empleados controladorarrayempleado;
    ////////////////////////////////////////////////////////////////////////////
    public ArrayLists_Empleados(){
        empleados= new ArrayList<Empleado>();
    }
    ////////////////////////////////////////////////////////////////////////////
    public static ArrayLists_Empleados getInstance(){
        if(controladorarrayempleado == null)
            controladorarrayempleado = new ArrayLists_Empleados();
        return controladorarrayempleado;
    }
    ////////////////////////////////////////////////////////////////////////////
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    
}
///// Alfonso Espinoza /////