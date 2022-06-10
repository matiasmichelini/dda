package modelo;

public abstract class TipoCliente {

    private String tipo;

    public TipoCliente() {
    }

    public TipoCliente(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TipoCliente{" + "tipo=" + tipo + '}';
    }

        
}
