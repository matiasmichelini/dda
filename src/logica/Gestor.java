package logica;

import java.util.ArrayList;
import java.util.Date;

public class Gestor extends Usuario {
    
    private Date conexion;

    private ArrayList<UnidadProcesadora> unidadProcesadora;

    private ArrayList<Pedido> pedido;


     public Gestor() {
    }

    public Gestor(Date conexion, ArrayList<UnidadProcesadora> unidadProcesadora, ArrayList<Pedido> pedido) {
        this.conexion = conexion;
        this.unidadProcesadora = unidadProcesadora;
        this.pedido = pedido;
    }

    public Date getConexion() {
        return conexion;
    }

    public void setConexion(Date conexion) {
        this.conexion = conexion;
    }

    public ArrayList<UnidadProcesadora> getUnidadProcesadora() {
        return unidadProcesadora;
    }

    public void setUnidadProcesadora(ArrayList<UnidadProcesadora> unidadProcesadora) {
        this.unidadProcesadora = unidadProcesadora;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Gestor{" + "conexion=" + conexion + ", unidadProcesadora=" + unidadProcesadora + ", pedido=" + pedido + '}';
    }
         
         
         
}
