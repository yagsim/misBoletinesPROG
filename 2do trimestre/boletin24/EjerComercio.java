
package ejercomercio;

import ejercomercio.Excepcion3;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class EjerComercio {

    
    public static void main(String[] args) {
        Comercio com=new Comercio();
    ArrayList lista=new ArrayList();
        int opcion;
        
      do{
           opcion=Integer.parseInt(JOptionPane.showInputDialog("MENU \n1.Engadir \n2.Vender \n3.Borrar \n4.Ordenar \n5.Amosar  \n6.Buscar "));
        switch(opcion){
            
            case 1:Comercio.engadir(lista);
            break;
            
            case 2:
            try{
                Comercio.vender(lista);
            }catch(Excepcion3 exc){
                System.out.println("erro1: Non existe ese valor // " + exc.toString());
            }
            break;
            
            case 3:try{
                Comercio.borrar(lista);
            }catch(Excepcion3 ex){
                System.out.println("erro2:" + ex.toString());
            }
            break;
            
            case 4:Comercio.ordenar(lista);
            break;
            
            case 5:try{
                Comercio.amosar(lista);
            }catch(Excepcion3 ece){
                System.out.println("erro3:" + ece.toString());
            }
            break;
            
            case 6:Comercio.buscar(lista);
            break;
      }
        
    }while(opcion<=5);
}
}
    

