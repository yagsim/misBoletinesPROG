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
public class Futbolista extends SeleccionFutbol  {
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int dorsal, String demarcacion, int ID, String nome, String apelidos, int edad) {
        super(ID, nome, apelidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return   super.toString() + "dorsal=" + dorsal + ", demarcacion=" + demarcacion ;
    }

   
    
    public  void entrevista(){
        System.out.println("o futbolista fai entrevistas " + this.toString());
    }

    @Override
    public void concentrarse() {
       
        System.out.println("concentrase o futbolista" + this.toString());
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
