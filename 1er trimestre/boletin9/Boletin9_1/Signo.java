
package boletin9_1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Signo {



    public  Signo(){
    }
    public void Contador(){
        Scanner dg=new Scanner(System.in);
        int positivo=0,negativo=0, ceros=0;
        int numero;
        for(int i=1;i<11;i++){
            System.out.println("Pedimos numero "+i);
            numero=dg.nextInt();
            if(numero>0){
                positivo++;
            }else if(numero<0){
                negativo++;
            }else{
            ceros++;
            }
        }
        System.out.println("positivos " + positivo+ " \nnegativos " +negativo + " \nceros " +ceros);

    }

    
}



















 