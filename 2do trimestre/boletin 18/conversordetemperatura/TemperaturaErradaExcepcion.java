
package conversordetemperatura;

import javax.swing.JOptionPane;


public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion() {
        super();
    }
    public TemperaturaErradaExcepcion(String mensaxe){
        super(mensaxe);
    }

 public void TemperaturaErradaExcepcion ()throws TemperaturaErradaExcepcion{
        float num=Float.parseFloat(JOptionPane.showInputDialog("Introduzca a temperatura en grados centigrados"));;
        
        if(num<80){
            throw new TemperaturaErradaExcepcion("non pode ser menor a 80º Grados");
        }
    }
}