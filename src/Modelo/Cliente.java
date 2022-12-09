///// Alfonso Espinoza /////
package Modelo;

 
public class Cliente extends Persona{
    ////////////////////////////////////////////////////////////////////////////
    private String direction;
    private String id_clien;
    ////////////////////////////////////////////////////////////////////////////
    public Cliente(String direction, String id_clien, String id, String nombre, String apellido) {
        super(id, nombre, apellido);
        this.direction = direction;
        this.id_clien = id_clien;
    }
    public Cliente(String id_pedido, String direction, String id_clien) {
        this.direction = direction;
        this.id_clien = id_clien;
    }
    ////////////////////////////////////////////////////////////////////////////
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getId_clien() {
        return id_clien;
    }
    public void setId_clien(String id_clien) {
        this.id_clien = id_clien;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    ////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return   "\n|| Cliente "
              +"\n|| ID: "+id+" ||"
              +"\n|| Apellido: "+ apellido+" ||"
              +"\n|| Nombre: "+nombre+" ||"
              +"\n|| Direccion: "+direction+" ||"
              +"\n|| Id Cliente: " + id_clien +" ||"+ '}';
    }
    ////////////////////////////////////////////////////////////////////////////

    
}
///// Alfonso Espinoza /////