package logica;

import java.util.ArrayList;


public class Cliente {

	private String id;

	private String nombre;

	private String email;

	private ArrayList<Servicio> servicio;

	private TipoCliente tipoCliente;

        
    public Cliente() {
      
    }
     
    public Cliente(String id, String nombre, String email, ArrayList<Servicio> servicio, TipoCliente tipoCliente) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.servicio = servicio;
        this.tipoCliente = tipoCliente;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Servicio> getServicio() {
        return servicio;
    }

    public void setServicio(ArrayList<Servicio> servicio) {
        this.servicio = servicio;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", servicio=" + servicio + ", tipoCliente=" + tipoCliente + '}';
    }

}
