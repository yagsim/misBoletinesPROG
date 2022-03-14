
package boletin25;

import com.yago.Escritura.Escritura;
import com.yago.Lectura.Lectura;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin25 {

   
    public static void main(String[] args)  {
       Escritura escrit=new Escritura();
       Lectura lect=new Lectura();
       File f=new File("libros.txt");
       ArrayList<Libros> libreria=new ArrayList<>();
     int opcion;
     
      do{
            
           opcion=Integer.parseInt(JOptionPane.showInputDialog("MENU \n1.Añadir  \n2.Amosar \n3.Comparar \n4.Borrar \n5.Modificar "));
        switch(opcion){
            
            case 1:escrit.engadir("libros.txt");
            break;
            case 2:lect.visulizar(f);
            break;
            case 3:escrit.consultaLibro(libreria,f);
            break;
            case 4:try{
                escrit.borrarElemento(libreria,f);
            }catch(FileNotFoundException exc){
                System.out.println("erro borrado"+ exc.toString());
            }catch(IOException exc){
                System.out.println("erro borrado"+ exc.toString());
            }
            break;
            case 5:
            try{
                 escrit.modificar(libreria,f);
            }catch(IOException ex){
                System.out.println("erro"+ ex.toString());
            }
            
           
                
           
                
        }
    } while(opcion<6);      
 
    
        }
      }

