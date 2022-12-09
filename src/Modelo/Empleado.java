
package Modelo;


public class Empleado extends Persona {
    ////////////////////////////////////////////////////////////////////////////
    private String identi;
    ////////////////////////////////////////////////////////////////////////////
    public Empleado(String identi, String id, String nombre, String apellido) {
        super(id, nombre, apellido);
        this.identi = identi;
    }
    public Empleado() {
    }
    ////////////////////////////////////////////////////////////////////////////
    public String getIdenti() {
        return identi;
    }
    public void setIdenti(String identi) {
        this.identi = identi;
    }
    ////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return   "\n|| Empleado "
              +"\n|| ID: "+id+" ||"
              +"\n|| Apellido: "+ apellido+" ||"
              +"\n|| Nombre: "+nombre+" ||"
              +"\n|| Identi: " + identi + '}';
    }
    ////////////////////////////////////////////////////////////////////////////
    
}
