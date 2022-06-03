package logica;

import java.util.ArrayList;
import observador.Observable;


public class SistemaMesas extends Observable{

    private ArrayList<Mesa> mesa = new ArrayList();

    private Fachada fachada;

    public ArrayList<Mesa> getMesa() {
        return mesa;
    }

    public Fachada getFachada() {
        return fachada;
    }
        

}
