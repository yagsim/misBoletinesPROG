/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin32;

/**
 *
 * @author yagos
 */
public class Velero extends Barco{
    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles, String matricula, int eslora) {
        super(matricula, eslora);
        this.numMastiles = numMastiles;
    }

    


    @Override
    public float calcularAluguer(int dias) {
       return ((8*this.numMastiles)+(10*this.eslora)*dias);
    }
  


   
    
    
}
