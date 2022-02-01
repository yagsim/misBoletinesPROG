
package boletin21_1;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Numeros {
    
    public static void numAleatorio(float[]lista){
        
        for(int i =0 ; i<lista.length; i++ ){
            lista[i]=Math.round(1+Math.random()*50);
          
        }
    
    }
    public static void mostrar(float[]lista){
        for(int i=0; i<lista.length; i++){
            System.out.println("posicion " + i + "--> " + lista[i]);  
        }
    }
    
    
    public static void ordReves(float[]lista){
     float[] lista1=new float[lista.length];
/*        for(int i=0; i<lista.length ;i++){
            for(int j=i+1 ;j<lista.length; j++){
                if(lista[i]>lista[j]){
                    aux=  lista[i];
                    lista[i]=lista[j];
                    lista[j]=(int) aux;
                } 
                    
                }
            }*/
            Arrays.sort(lista);
        }
}
    
   