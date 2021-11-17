
package boletin7_1;

import javax.swing.JOptionPane;

public class Numeros {
    public void Num(){
    short num1= lerEnteiro();
    short num2=0;
    
    

    if(num1>=num2){
    JOptionPane.showMessageDialog(null, "é positivo");
    }
    
    
    }
       public short lerEnteiro(){
 String resposta = JOptionPane.showInputDialog("teclea numero enteiro: ");
 short num= Short.parseShort(resposta);
 return num;
     }

}
