
package boletin21_4;

import javax.swing.JOptionPane;


public class Boletin21_4 {

   
    public static void main(String[] args) {
          int nif = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los números del NIF: "));
        char letra = MetodosDNI.calcularLetraDNI(nif);
        if (letra == 'ñ') {
            JOptionPane.showMessageDialog(null, " números no inválida");
        } else {
            JOptionPane.showMessageDialog(null, " "+letra);
        }
        
    }
}
    
    

