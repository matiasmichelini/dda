package logica;

import java.util.ArrayList;

public class Servicio {

	private Cliente cliente;

	private ArrayList<Pedido> pedido;

	private Mesa mesa;

    public Servicio() {
    }

    public Servicio(Cliente cliente, ArrayList<Pedido> pedido, Mesa mesa) {
        this.cliente = cliente;
        this.pedido = pedido;
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Servicio{" + "cliente=" + cliente + ", pedido=" + pedido + ", mesa=" + mesa + '}';
    }

        
}
