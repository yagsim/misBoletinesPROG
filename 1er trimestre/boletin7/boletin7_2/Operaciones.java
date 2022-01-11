
package boletin7_2;

import javax.swing.JOptionPane;


public class Operaciones {
    public void Numeros(){
    short num1=lerEnteiro();
    short num2=lerEnteiro();
    float num3 = num1-num2;
    float num4=num1+num2;
    if(num1>=num2){
        JOptionPane.showMessageDialog(null,num1+" - "+num2+"= "+num3);
    }
    else{
    JOptionPane.showMessageDialog(null,num1+ " +" +num2 +"=" +num4);
        
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   public short lerEnteiro(){
   String resposta=JOptionPane.showInputDialog("teclea o numero enteiro");
   short num=Short.parseShort(resposta);
   return num;
  
}
}

