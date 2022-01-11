
package boletin17;

import javax.swing.JOptionPane;


public class Boletin17 {

   
    public static void main(String[] args) {
        Nota not=new Nota();
        not.setExaT1(Float.parseFloat(JOptionPane.showInputDialog( "Introduza a nota do examen teorico 1")));
        not.setExaT2(Float.parseFloat(JOptionPane.showInputDialog( "Introduza a nota do examen teorico 2")));
        not.setExaP(Float.parseFloat(JOptionPane.showInputDialog( "Introduza a nota do examen practico ")));
        not.setCantBol(Float.parseFloat(JOptionPane.showInputDialog( "Introduza a porcentaxe de boletines entregados ")));
        not.Medias();
    }
    
}
