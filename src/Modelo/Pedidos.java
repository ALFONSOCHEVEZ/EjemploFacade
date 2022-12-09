
package Modelo;


public class Pedidos {
    ////////////////////////////////////////////////////////////////////////////
    private String id;
    private String id_cliente;
    private String descripcion;
    private double monto_final;
    ////////////////////////////////////////////////////////////////////////////
    public Pedidos(String id, String id_cliente, String descripcion, double monto_final) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.descripcion = descripcion;
        this.monto_final = monto_final;
    }
    public Pedidos(){
    }
    ////////////////////////////////////////////////////////////////////////////
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto_final() {
        return monto_final;
    }

    public void setMonto_final(double monto_final) {
        this.monto_final = monto_final;
    }
    ////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return   "\n|| Pedidos{"
                +"\n|| ID: "+id+" ||"
                +"\n|| Id Cliente: "+ id_cliente + " ||"
                +"\n|| Descripcion: "+ descripcion + " ||"
                +"\n|| Monto_final: " + monto_final + '}';
    }
    
    
    
    
}
