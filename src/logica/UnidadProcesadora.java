package logica;

import java.util.ArrayList;


public class UnidadProcesadora {

    private String tipo;

    private ArrayList<Gestor> gestores;

    private ArrayList<Producto> productos;

    private ArrayList<Pedido> pedidos;

    public UnidadProcesadora() {
    }

    public UnidadProcesadora(String tipo, ArrayList<Gestor> gestores, ArrayList<Producto> productos, ArrayList<Pedido> pedidos) {
        this.tipo = tipo;
        this.gestores = gestores;
        this.productos = productos;
        this.pedidos = pedidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Gestor> getGestores() {
        return gestores;
    }

    public void setGestores(ArrayList<Gestor> gestores) {
        this.gestores = gestores;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "UnidadProcesadora{" + "tipo=" + tipo + ", gestores=" + gestores + ", productos=" + productos + ", pedidos=" + pedidos + '}';
    }
    
    

}
