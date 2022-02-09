
package ejercomercio;

import java.util.ArrayList;


public class Libro implements Comparable{
    String titulo;
    String autor;
    String ISBN;
    float prezo;
    int stock;
    ArrayList<Libro> lista=new ArrayList();
    public Libro() {
    }
    


    public Libro(String titulo, String autor, String ISBN, float prezo, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.stock = stock;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

  

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public int compareTo(Object o) {
        Libro x= (Libro) o;
        if(titulo.compareToIgnoreCase(x.titulo)>0){     //Comparas los titulos que pones por pantalla y si es mayor devuelve 1 si es = 0 y si es menor -1
            return 1;
        }else if(titulo.compareToIgnoreCase(x.titulo)<0){
            return -1;
        }else{
           return 0; 
        }
    }
       
   
    
    
}

    

    
    
     
       


