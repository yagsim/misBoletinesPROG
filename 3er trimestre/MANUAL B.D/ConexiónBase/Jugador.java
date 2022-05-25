/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiónbase;

/**
 *
 * @author yagos
 */
public class Jugador {
    String dni,nombre,apellido;

    public Jugador(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Jugador() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
