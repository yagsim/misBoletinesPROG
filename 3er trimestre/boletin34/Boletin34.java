/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin34;

import java.util.ArrayList;

/**
 *
 * @author yagos
 */
public class Boletin34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList <SeleccionFutbol>lista=new ArrayList();
        SeleccionFutbol sel= new Futbolista(2,"Santi" ,9,"Marco","ASI SI" ,34);
        sel.concentrarse();
        ArrayList <Entrenador>lista1=new ArrayList();
        Entrenador ent=new Entrenador(3,54,"Manolo" ,"Reina" ,40);
        ent.planificarEntrenamiento();
         ArrayList <Masajista>lista2=new ArrayList();
        Masajista mas=new Masajista("Tecnico Superior en Masajes" ,8,12,"Sancho","Ramirez" ,87);
        mas.darMasaje();
        ArrayList <Selecionador> lista3=new ArrayList();
        Selecionador sel3=new Selecionador(5,"SalvaSevilla" , "Gimenez", 38);
        sel3.selecionaJugadores();
        
    }
    
}
