/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iuEscritorio;

import java.awt.Frame;
import modelo.Fachada;
import modelo.Gestor;



public class LoginGestor extends Login{

    public LoginGestor(Frame parent, boolean modal) {
        super(parent, modal, "Ingreso a Administracion");
    }

    @Override
    public Object llamarLogin(String nombre, String pwd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void llamarProximoCasoUso(Object u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } 
    
}
