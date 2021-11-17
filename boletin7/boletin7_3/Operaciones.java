
package boletin7_3;

import javax.swing.JOptionPane;

public class Operaciones {
    public void Numeros(){
    short num1= lerEnteiro();
    
    if(num1>0){
     JOptionPane.showMessageDialog(null," + ");
    }else if(num1<0){
     JOptionPane.showMessageDialog(null," - ");
    }else if(num1==0){
     JOptionPane.showMessageDialog(null,"0");
    }

    
    }
 public short lerEnteiro(){
   String resposta=JOptionPane.showInputDialog("teclea o numero ");
   short num=Short.parseShort(resposta);
   return num;
  
   }
   }

