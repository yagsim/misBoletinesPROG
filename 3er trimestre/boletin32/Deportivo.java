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
public class Deportivo extends Barco{
    int potencia;

    public Deportivo(int potencia, String matricula, int eslora) {
        super(matricula, eslora);
        this.potencia = potencia;
    }

    @Override
    public float calcularAluguer(int dias) {
        return ((2*this.potencia)+(10*this.eslora)*dias);
    }
    
    
}
