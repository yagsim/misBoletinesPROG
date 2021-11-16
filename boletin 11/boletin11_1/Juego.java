
package boletin11_1;

import javax.swing.JOptionPane;


public class Juego {
 public Juego(){
 }
 
 
 public void NumAleatorio(){
    
      int num = Integer.parseInt(JOptionPane.showInputDialog("Teclea o numero a adiviñar entre o 1 e o 10"));
      int numIntentos=Integer.parseInt(JOptionPane.showInputDialog("Teclea o numero de intentos"));
      int i=0;
      while(i<numIntentos){
        int numIntroducido=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
                      
            if(numIntroducido==num){
            JOptionPane.showMessageDialog(null, "acertaste");
            break;
            }
          if(numIntroducido!=num){
            if(numIntroducido<num){
                JOptionPane.showMessageDialog(null," fallo,e menor");
            }else if(numIntroducido>num){
                JOptionPane.showMessageDialog(null,"fallo,e maior");     
            }
            
     
      
      }
          i++;
     
     
 }
}
}

    
    
  


