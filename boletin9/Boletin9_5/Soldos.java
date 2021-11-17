
package boletin9_5;

import java.util.Scanner;


public class Soldos {
   public Soldos(){
       
       
   }

        public void Contador(){
            Scanner tr=new Scanner(System.in);
            int soldosA=0 ,soldosB=0 ,soldo=0;
            int numero;
            for(int i=0;i>=0;i++){
              System.out.println("Soldo");
              numero=tr.nextInt();
              if(numero>1000&&numero<1700){
                  soldosA++;
                  
              }else if(numero>0&&numero<1000){
                  soldosB++;
                  
              } else{
                  soldo++;
              }
                System.out.println("Hay " +soldosA + " soldos maiores de 1000 e menores de 1700 \n" + soldosB +" soldos entre 0 y 1000  \n" + soldo + " que non cobran");
            }
            
        }
}
