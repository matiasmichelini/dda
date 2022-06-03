/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import observador.Observable;
import observador.Observador;


public class Fachada extends Observable {
    
    private SistemaClientes sc = new SistemaClientes();

    private SistemaUsuarios su = new SistemaUsuarios();

    private SistemaControlStock scs = new SistemaControlStock();

    private SistemaMesas sm = new SistemaMesas();
    
    ////SINGLETON
    private static Fachada instancia = new Fachada();
    public static Fachada getInstancia() {
        return instancia;
    }
    private Fachada() {
    }
    ////DELEGACIONES


    
}
