package modelo;

import java.util.ArrayList;


public class Mozo extends Usuario {

	private String telefono;

	private ArrayList<Mesa> mesas;

	private ArrayList<Transferencia> transferenciaRealizadas;

	private ArrayList<Transferencia> transferenciaRecibidas;

    public Mozo() {
    }

    public Mozo(String telefono, ArrayList<Mesa> mesas, ArrayList<Transferencia> transferenciaRealizadas, ArrayList<Transferencia> transferenciaRecibidas) {
        this.telefono = telefono;
        this.mesas = mesas;
        this.transferenciaRealizadas = transferenciaRealizadas;
        this.transferenciaRecibidas = transferenciaRecibidas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }

    public ArrayList<Transferencia> getTransferenciaRealizadas() {
        return transferenciaRealizadas;
    }

    public void setTransferenciaRealizadas(ArrayList<Transferencia> transferenciaRealizadas) {
        this.transferenciaRealizadas = transferenciaRealizadas;
    }

    public ArrayList<Transferencia> getTransferenciaRecibidas() {
        return transferenciaRecibidas;
    }

    public void setTransferenciaRecibidas(ArrayList<Transferencia> transferenciaRecibidas) {
        this.transferenciaRecibidas = transferenciaRecibidas;
    }

    @Override
    public String toString() {
        return "Mozo{" + "telefono=" + telefono + ", mesas=" + mesas + ", transferenciaRealizadas=" + transferenciaRealizadas + ", transferenciaRecibidas=" + transferenciaRecibidas + '}';
    }

        
}
