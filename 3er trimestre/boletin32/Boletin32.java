/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin32;

import java.util.ArrayList;

/**
 *
 * @author yagos
 */
public class Boletin32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Barco> AlqBarc= new ArrayList<>();
        Barco Barco3=new Yate((float) 3.2,4,"htr7699",3);
        Barco Barco1=new Velero(2,"grt200", 7);
        Barco Barco2 =new Deportivo(15,"3255nyt" ,8 );
        AlqBarc.add(Barco1);
        AlqBarc.add(Barco2);
        AlqBarc.add(Barco3);
        
        System.out.println();
        
    }
    
} 
