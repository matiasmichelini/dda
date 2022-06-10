package modelo;

public class Pedido {

	private int cant;
        
        private Producto producto;

	private String desc;

	private String estado;

	private UnidadProcesadora unidadProcesadora;

	private Gestor gestor;

	private Servicio servicio;

    public Pedido() {
    }

    public Pedido(int cant, Producto producto, String desc, String estado, UnidadProcesadora unidadProcesadora, Gestor gestor, Servicio servicio) {
        this.cant = cant;
        this.producto = producto;
        this.desc = desc;
        this.estado = estado;
        this.unidadProcesadora = unidadProcesadora;
        this.gestor = gestor;
        this.servicio = servicio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public UnidadProcesadora getUnidadProcesadora() {
        return unidadProcesadora;
    }

    public void setUnidadProcesadora(UnidadProcesadora unidadProcesadora) {
        this.unidadProcesadora = unidadProcesadora;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cant=" + cant + ", producto=" + producto + ", desc=" + desc + ", estado=" + estado + ", unidadProcesadora=" + unidadProcesadora + ", gestor=" + gestor + ", servicio=" + servicio + '}';
    }

        
}
