
package ejercomercio;

import ejercomercio.Excepcion3;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;
import libreriaYao.lerDatos;


public class Comercio  {
    public static void engadir(ArrayList<Libro>lista){
    String autor=lerDatos.lerString("Teclea ao autor ");
    String titulo=lerDatos.lerString("Teclea titulo");
    String ISBN=lerDatos.lerString("ISBN:");
    float prezo=lerDatos.lerfloat("prezo");
    int stock=lerDatos.lerInt("num stock");
    Libro libro=new Libro(titulo,autor,ISBN,prezo,stock);
    lista.add(libro);
    
    }
    
    public static void vender(ArrayList<Libro> lista) throws Excepcion3{
        String ISBN=lerDatos.lerString("Introduzca o ISBN  a borrar");
        
        for(int i =0;i<lista.size();i++){
            if(lista.get(i).getISBN().equals(ISBN)){
            int stock1=lista.get(i).getStock()-1;
            }else {
               throw new Excepcion3(" ISBN fallido ");
            }    
    }
    }
    
    public static void ordenar(ArrayList<Libro>lista){
        Libro copia;             //declaro para usar luego variable copia
    for(int i=0;i<lista.size();i++){
        for(int e=0;e<lista.size();e++){
            if(lista.get(i).compareTo(lista.get(e))>0){       //Si es mayor que cero ordena
                copia=lista.get(i);
                lista.get(i).compareTo(lista.get(e));
                copia=lista.get(e);
            }
        }
    }
}
    
        
     public static void amosar (ArrayList<Libro>lista) throws Excepcion3{
        if(lista.size()!=0){
          for(int i=0;i<lista.size();i++){
              System.out.println("Titulo " + lista.get(i).getTitulo()) ;
              System.out.println("Autor " + lista.get(i).getAutor());
              System.out.println("Isbn " + lista.get(i).getISBN());
              System.out.println("prezo " + lista.get(i).getPrezo());
              System.out.println("stock " + lista.get(i).getStock());
            }
        }else{
            throw new Excepcion3 ("Non hay posicions á encher");
        }
     }
     
           
     public static void borrar(ArrayList<Libro>lista) throws Excepcion3{
         
         for(int i=0;i<lista.size();i++){
                 if(lista.get(i).getStock()<=0){
                lista.remove(i);
                }else{
                 throw new Excepcion3("Non hay libros con  0 existencias");
                }
         }
     }
     
     public static void buscar(ArrayList<Libro> lista){
          String elemento=JOptionPane.showInputDialog("Que titulo desea buscar?");
        
        boolean buscar=false ;
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getTitulo().equals(elemento)){    //Para recoger el titulo en el get
                System.out.println("El titulo " + elemento + "se encuentra en la tiene " + lista.get(i).getStock() + " en Stock");
                buscar=true;
            }
            
        }
        if(buscar==false){
            JOptionPane.showMessageDialog(null, "El titulo no se encuentra en la matriz");
        }
       
    
    }
}

