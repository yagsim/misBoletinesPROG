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
public abstract class Barco {
     String matricula="";
     float eslora=0f;
   

    public Barco(String matricula, int eslora) {
        this.matricula = matricula;
        this.eslora = eslora;
     
    }

    public Barco() {
    }

    public String getMatricula() {
        return matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public abstract float calcularAluguer(int dias);
}
