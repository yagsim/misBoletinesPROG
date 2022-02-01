
package boletin21_2;

import javax.swing.JOptionPane;


public class Notas {
    
    public static void mostrar(int[]lista){
        for(int i=0; i<lista.length; i++){
            System.out.println("posicion " + i + "--> " + lista[i]);  
        }
    }
    
     public static void AprobYSusp(int[]lista){
        int aprobados=0;int suspensos=0;
        int notas;
        
        for(int i=0;i<lista.length;i++){
            if(lista[i]<5){
              suspensos++;
        }else {
         aprobados++;
        }      
    }
    JOptionPane.showMessageDialog(null,"El numero de suspensos es " + suspensos + "\nEl numero de aprobados es "+ aprobados );
}
 
    public static float NotasMedia(int[]lista){
       int suma=0;
      for(int i=0;i< lista.length ; i++){
           suma +=lista[i];
        }
      float media= suma/ lista.length;
         return media;
      
    }
    
    public static int NotaAlta(int[]lista){
      int notAlta=lista[0];                      //lista[0] para empezar a ver por la posición 0
      for(int i =0;i<lista.length ;i++ ){
       if(lista[i]>notAlta){
        notAlta=lista[i];    
       }    
       
    }   
        return notAlta;
       
    }
}
