/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.util.ArrayList;

public class ListaEmpleado {
    ArrayList <DatosEmpleado> listaE=new ArrayList<>();
    private int posicion;
    
    public ListaEmpleado () {  
        posicion = -1;    //la ultima posicion -
    }
    
    public void addEmpleado (DatosEmpleado empleado) {
        listaE.add(empleado);
        ++posicion;
    }
    
    public DatosEmpleado getEmpleado(int pos){
        if( pos>=0 && pos<=posicion)        //si esta dentro de las posiciones devuelve datos del empleado
            return listaE.get(pos);
        
            return null;
    
    }
    
    public int getPosicion(){    //para saber el tamaño
        return posicion;
    }

    @Override
    public String toString() {
        return  listaE + "\n Posicion=" + posicion + '}';
    }
    
    
    
}
