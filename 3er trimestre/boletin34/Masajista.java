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
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int anosExp;

    public Masajista() {
    }

    public Masajista(String titulacion, int anosExp, int ID, String nome, String apelidos, int edad) {
        super(ID, nome, apelidos, edad);
        this.titulacion = titulacion;
        this.anosExp = anosExp;
    }
    
    public void darMasaje(){
        System.out.println("o masajista da masajes " + this.toString());
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
        return   super.toString() + "titulacion=" + titulacion + ", anosExp=" + anosExp ;
    }
    
}
