/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Datos.DatosEmpleado;
import java.util.GregorianCalendar;
public class PersoalDestajo  extends DatosEmpleado{
    private float soldo;
    private int numClientes;
    private int complemento;

    public PersoalDestajo() {
    }

    @Override
    public String toString() {
        return "\nPersoalDestajo{" +super.toString()+ "\nSoldo=" + this.getSoldo() + "\nNumClientes=" + numClientes + "\nComplemento=" + complemento + '}';
    }

    public PersoalDestajo( int numClientes, int complemento, String DNI, String nome, String apelido, GregorianCalendar data) {
        super(DNI, nome, apelido, data);
     
        this.numClientes = numClientes;
        this.complemento = complemento;
    }

    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    public float getSoldo() {
        return numClientes*complemento;
    }

    public void setSoldo(float soldo) {
        this.soldo = soldo;
    }

    public int getComplemento() {
        return complemento;
    }

    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }

   

  
    
}
