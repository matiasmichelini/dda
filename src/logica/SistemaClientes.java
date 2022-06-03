package logica;

import java.util.ArrayList;
import observador.Observable;


public class SistemaClientes extends Observable{

    private ArrayList<Cliente> clientes = new ArrayList();

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

        
        
}
