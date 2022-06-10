/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelo.Mesa;
import modelo.ObliException;
import observador.Observable;
import observador.Observador;

/**
 *
 * @author matia
 */
public class ControladorAbrirMesa implements Observador{
    private VistaAbrirMesa vista;
    private Mesa mesa;
    
    public ControladorAbrirMesa(VistaAbrirMesa vista, Mesa mesa) throws ObliException{
        vista = this.vista;
        mesa = this.mesa;
        inicializarVista();
    }
    
    public Mesa getMesa(){
        return mesa;
    }
    
    private void inicializarVista() throws ObliException {
        if(mesa.isAbierta()){
            throw new ObliException("La mesa ya está abierta.");
        }else{
            getMesa().setAbierta(true);
        }   
    }

    @Override
    public void actualizar(Object evento, Observable origen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   

}
