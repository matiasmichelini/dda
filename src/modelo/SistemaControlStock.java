package modelo;

import java.util.ArrayList;
import observador.Observable;


public class SistemaControlStock extends Observable{

    private ArrayList<Producto> productos = new ArrayList();

    private ArrayList<UnidadProcesadora> unidadesProcesadoras = new ArrayList();

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<UnidadProcesadora> getUnidadesProcesadoras() {
        return unidadesProcesadoras;
    }

        
}
