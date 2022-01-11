
package boletin12_1;

import javax.swing.JOptionPane;


public class Coche {
    

    public Coche(){
    }
    
    
    
    
    
    public String lerMatricula(){
        String resposta=JOptionPane.showInputDialog("Matricula");
       // JOptionPane.showMessageDialog(null,"A matricula é" + resposta);
        return resposta;
    }
}