/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin32;


public class Yate extends Barco{
    float potencia;
    int camarote;

    public Yate(float potencia, int camarote, String matricula, int eslora) {
        super(matricula, eslora);
        this.potencia = potencia;
        this.camarote = camarote;
    }

    @Override
    public float calcularAluguer(int dias) {
        return((2*this.potencia)+(25*this.camarote)+(10*this.eslora)+(10*dias));
    }
    
    
}
