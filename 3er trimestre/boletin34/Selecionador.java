/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin34;

/**
 *
 * @author yagos
 */
public class Selecionador extends SeleccionFutbol{

    public Selecionador(int ID, String nome, String apelidos, int edad) {
        super(ID, nome, apelidos, edad);
    }

    public void selecionaJugadores(){
        System.out.println("Selecciona xogadores " + super.getID() + (",") + super.getNome() + (",") + super.getApelidos() +(",") + super.getEdad());
    }

    @Override
    public String toString() {
        return  super.toString() ;
    }
    
    @Override
    public void concentrarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viajar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void entrenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void jugarPartido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
