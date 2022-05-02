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
public class Entrenador extends SeleccionFutbol{
    private int IDFederacion;

    public Entrenador() {
    }

    public Entrenador(int IDFederacion, int ID, String nome, String apelidos, int edad) {
        super(ID, nome, apelidos, edad);
        this.IDFederacion = IDFederacion;
    }

    public void planificarEntrenamiento(){
        System.out.println("o entrenador planifica " + this.toString());
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

    @Override
    public String toString() {
        return super.toString() + " IDFederacion=" + IDFederacion ;
    }
    
}
