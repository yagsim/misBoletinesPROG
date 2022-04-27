
package boletin33;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Operacions <T>{
    private static double menor;
    private static double cambiante;
    private static double mayor;
    
    public static <T> double calcularMin(T[] array){
        double resultado=-0;
    try{
                
        menor= Double.parseDouble(array[0].toString());    //array[0]to String es para devolver el valor que tiene .0 primera posicion
       
         for(int i =0; i< array.length ;i++){    //recorro el bucle
         try{
           cambiante= (Double.parseDouble(array[i].toString()));  //los valores de i se guardan en num2
           if(menor>cambiante){
               menor=cambiante;
           }
         }catch(Exception e){
                 System.out.println("no se puede comparar");
         }
         }
        
    }catch(Exception e){
        System.out.println("Distinto tipo de datos");
    }   
      resultado=menor;
      return resultado;
   }
    
    
    
    public static <T> double calcularMax(T[] array){
        double resultado=-0;
    try{
                
        mayor= Double.parseDouble(array[0].toString());    //array[0]to String es para devolver el valor que tiene .0 primera posicion
       
         for(int i =0; i< array.length ;i++){    //recorro el bucle
         try{
           cambiante= (Double.parseDouble(array[i].toString()));  //los valores de i se guardan en num2
           if(mayor>cambiante){
               mayor=cambiante;
           }
         }catch(Exception e){
                 System.out.println("no se puede comparar");
         }
         }
        
    }catch(Exception e){
        System.out.println("Distinto tipo de datos");
    }   
      resultado=mayor;
      return resultado;
   }
    
     public static <T> int buscarElemento(T[]lista,T elemento){
         
         int res=-1;
        int posicion=0;
        
        for(int i=0;i<lista.length;i++){
          
            if(lista[i].equals(elemento)){
                res=i;
            } 
        }
        return res;

    }
     
      public static <T>String  borrarElemento(T[]lista,T elemento){
        String res="-1";
        for(int i=0;i<lista.length;i++){
            if(lista[i].equals(elemento)){
                res=elemento.toString();
                lista[i]=null;
                break;
            }
        }
        return res;
       
    }    
  
      
   }

   
    
 


