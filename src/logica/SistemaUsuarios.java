package logica;

import java.util.ArrayList;
import observador.Observable;

public class SistemaUsuarios extends Observable {

    private ArrayList<Gestor> gestores = new ArrayList();

    private ArrayList<Mozo> mozos = new ArrayList();

    public ArrayList<Gestor> getGestores() {
        return gestores;
    }

    public ArrayList<Mozo> getMozos() {
        return mozos;
    }
        
        
    public void login(String username, String password) {

    }

}
