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
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    private int ID;
    private String nome;
    private String apelidos;
    private int edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int ID, String nome, String apelidos, int edad) {
        this.ID = ID;
        this.nome = nome;
        this.apelidos = apelidos;
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ID=" + ID + ", nome=" + nome + ", apelidos=" + apelidos + ", edad=" + edad ;
    }

    
    
   
    
}
