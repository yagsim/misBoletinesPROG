/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.GregorianCalendar;


public class DatosEmpleado {
    private String DNI;
    private String nome;
    private String apelido;
    protected GregorianCalendar data;

    public DatosEmpleado() {
    }

    public DatosEmpleado(String DNI, String nome, String apelido, GregorianCalendar data) {
        this.DNI = DNI;
        this.nome = nome;
        this.apelido = apelido;
        this.data = data;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public GregorianCalendar getData() {
        return data;
    }

    public void setData(GregorianCalendar data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DatosPersonal" + "\nDNI=" + DNI + "\nNome=" + nome + "\nApelido=" + apelido + "\nDia=" + GregorianCalendar.DAY_OF_MONTH  + "\nMes" + GregorianCalendar.DAY_OF_MONTH + "\nAño" + GregorianCalendar.DAY_OF_YEAR;
    }
    
      
    
}
    

