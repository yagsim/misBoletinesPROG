
package boletin11_2;

import javax.swing.JOptionPane;

public class Juego {
    public Juego(){
        
    }
  
    public void Aleatorio(){
    double num=Math.round(1+Math.random()*50);
    System.out.println(num);
    int numIntroducido;
    boolean acierto=false;
    
    
    
        while(acierto==false){
            numIntroducido=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero del 1 al 50"));
            if(numIntroducido!=num){
                if(num-numIntroducido>20||numIntroducido-num>20){
                    JOptionPane.showMessageDialog(null,"moi lonxe");
                }else if((num-numIntroducido>=10&&num-numIntroducido<=20)||(numIntroducido-num>=10&&numIntroducido-num<=20)){
                     JOptionPane.showMessageDialog(null,"lonxe");
                }else if((num-numIntroducido<10&&num-numIntroducido>5)||(numIntroducido-num<10&&numIntroducido-num>5)){
                     JOptionPane.showMessageDialog(null,"cerca");
                }else if((num-numIntroducido<5)||(numIntroducido-num<5)){
                     JOptionPane.showMessageDialog(null,"moi cerca");
                }
                
            }
            if(numIntroducido==num){
                 JOptionPane.showMessageDialog(null, "Acertaste");
                 acierto=true;
            }
        }
    
    }
}
