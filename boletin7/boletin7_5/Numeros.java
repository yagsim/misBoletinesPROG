
package boletin7_5;

import javax.swing.JOptionPane;


public class Numeros {
    public void Numeros(){
        int num1 =lerNum();
        int num2 =lerNum();
        int num3 =lerNum();
    
    if (num1>num2){
        if (num1>num3){
    JOptionPane.showMessageDialog(null,num1 + " é o maior");
    }
    }
   if (num2>num1){
        if (num2>num3){
    JOptionPane.showMessageDialog(null,num2 + " é o maior");
   }
   }
        if (num3>num1){
        if (num3>num2){
    JOptionPane.showMessageDialog(null,num1 + " é o maior");
    }
    }

    
    
    }
    public int lerNum(){
    String resposta=JOptionPane.showInputDialog("teclea numero enteiro;");
    int num= Integer.parseInt(resposta);
    return num;
}
}
