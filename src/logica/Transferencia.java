package logica;


public class Transferencia implements EscuchadorTransferencia {

    private Mozo mozoOrigen;

    private Mozo mozoDestino;

    private Mesa mesa;

    public Transferencia() {
    }

    public Transferencia(Mozo mozoOrigen, Mozo mozoDestino, Mesa mesa) {
        this.mozoOrigen = mozoOrigen;
        this.mozoDestino = mozoDestino;
        this.mesa = mesa;
    }

    public Mozo getMozoOrigen() {
        return mozoOrigen;
    }

    public void setMozoOrigen(Mozo mozoOrigen) {
        this.mozoOrigen = mozoOrigen;
    }

    public Mozo getMozoDestino() {
        return mozoDestino;
    }

    public void setMozoDestino(Mozo mozoDestino) {
        this.mozoDestino = mozoDestino;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Transferencia{" + "mozoOrigen=" + mozoOrigen + ", mozoDestino=" + mozoDestino + ", mesa=" + mesa + '}';
    }

    @Override
    public void hayTransferencia() {
        transferirMesa();
    }

    private void transferirMesa() {
        this.getMozoDestino().getMesas().add(mesa);
        this.getMozoOrigen().getMesas().remove(mesa);
    }
    
    
}
