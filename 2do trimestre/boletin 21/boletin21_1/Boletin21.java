
package boletin21_1;

import javax.swing.JOptionPane;


public class Boletin21{

  
    public static void main(String[] args) {
        float[]numeros=new float[6];
      
        int list=0 ;
    
                do{
                list= Integer.parseInt(JOptionPane.showInputDialog("1.NumAleatorio \n2.Ordenar lista al reves \n3.Mostrar"));
                switch(list){
                    case 1:Numeros.numAleatorio(numeros);
                    break;
                    case 2:Numeros.ordReves(numeros);
                    break; 
                    case 3:Numeros.mostrar(numeros);
                    }
    }while(list<=3);
                
    }
    
    
}
