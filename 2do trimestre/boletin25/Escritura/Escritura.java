
package com.yago.Escritura;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import boletin25.Libros;
import com.yago.Lectura.Lectura;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Escritura {
    FileWriter fichero;
    PrintWriter escribir;
    Scanner df;
    
    BufferedWriter bw  ;
    
   
    
    
    
    
    
    
    
    public void engadir(String nomFicheiro){
        try{
        fichero =new FileWriter(nomFicheiro,true);
        escribir=new PrintWriter(fichero);
       
        String titulo=(JOptionPane.showInputDialog("Libro"));
        String autor=(JOptionPane.showInputDialog("Autor;"));
        String precio= (JOptionPane.showInputDialog("Precio;"));
        String unidades= (JOptionPane.showInputDialog("Unidades;"));
        
        escribir.println(titulo + "," + autor+ "," + precio + ","+ unidades);
        System.out.println("Operacion realizada correctamente");
        }catch(IOException exc){
            System.out.println("erro escritura 1"+ exc.getMessage());
        }finally{
            try {
                fichero.close();
            } catch (IOException ex) {
                System.out.println("non se pode fechar");
            }
        }

    }
    
    
    public void consultaLibro(ArrayList<Libros>libreria, File fich){
           
        try{
         Lectura.libroALista(libreria, fich);
        
        String nom=JOptionPane.showInputDialog("Que tirulo desea buscar?");
        for(int i=0;i<libreria.size();i++){
            
           if( nom.equals(libreria.get(i).getNomeLibro())){
               System.out.println(libreria.get(i).getPrecio());
           }
        }
            
        
        }catch(FileNotFoundException ex){
            System.out.println("erro 4:"+ex.getMessage());
        }finally{
            System.out.println("Finalizado");
        }
            
    }
    
    
    public void borrarElemento(ArrayList<Libros> libreria,File fich) throws  IOException{
        
        try{
          Lectura.libroALista(libreria, fich);
           String nom= JOptionPane.showInputDialog("Que titulo desea borrar?");
           
        
        for(int i=0;i<libreria.size();i++){
            if(libreria.get(i).getUnidades()==0){
               System.out.println("se ha eliminado " + libreria.get(i).getNomeLibro() );
              libreria.remove(i);
              i=i-1;
           }else{
               System.out.println("non o temos na libreria");
            }
        }
             bw = new BufferedWriter(new FileWriter(fich));
            for (int i = 0; i < libreria.size(); i++) {
                bw.write(libreria.get(i).getNomeLibro()+ "," + libreria.get(i).getAutor() + "," + libreria.get(i).getPrecio() + "," + libreria.get(i).getUnidades());
            }
        }catch(FileNotFoundException ex){
            System.out.println("erro 4:"+ex.getMessage());
        }finally{
           bw.close();
        }
        
    }
    
    
   public void modificar(ArrayList<Libros>libreria,File fich) throws IOException{
        try{
            Lectura.libroALista(libreria, fich);
       String titulo=JOptionPane.showInputDialog("Titulo a buscar");
       boolean encontrado=false;
        for(int i=0;i<libreria.size();i++){
           if(libreria.get(i).getNomeLibro().equals(titulo)){
            int nprecio=Integer.parseInt(JOptionPane.showInputDialog("Novo precio;"));
            libreria.get(i).setPrecio(nprecio);
            encontrado=true;
               System.out.println("Precio modificado \n");
        }
       
       
        }
        
        if(encontrado==false){
            System.out.println("No se encuentra en la libreria");
        }
           bw = new BufferedWriter(new FileWriter(fich));
            for (int i = 0; i <libreria.size(); i++) {
                bw.write(libreria.get(i).getNomeLibro()+ "," + libreria.get(i).getAutor() + "," + libreria.get(i).getPrecio() + "," + libreria.get(i).getUnidades());
            }
        }catch(FileNotFoundException exc){
            System.out.println("erro");
        }finally{
            bw.close();
        }
   }
}
    

   


