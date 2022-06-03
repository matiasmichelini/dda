package logica;

import java.util.ArrayList;



public class Mesa {

	private int numero;

	private boolean abierta;

	private Mozo mozo;

	private ArrayList<Transferencia> transferencia;

	private Servicio servicio;

    public Mesa() {
    }

    public Mesa(int numero, boolean abierta, Mozo mozo, Cliente cliente, ArrayList<Transferencia> transferencia, Servicio servicio) {
        this.numero = numero;
        this.abierta = abierta;
        this.mozo = mozo;
        this.transferencia = transferencia;
        this.servicio = servicio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public Mozo getMozo() {
        return mozo;
    }

    public void setMozo(Mozo mozo) {
        this.mozo = mozo;
    }

    public ArrayList<Transferencia> getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(ArrayList<Transferencia> transferencia) {
        this.transferencia = transferencia;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", abierta=" + abierta + ", mozo=" + mozo + ", transferencia=" + transferencia + ", servicio=" + servicio + '}';
    }

        
}
