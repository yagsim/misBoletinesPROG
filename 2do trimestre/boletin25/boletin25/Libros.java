
package boletin25;


public class Libros /*implements Comparable*/ {
    private String nomeLibro;
    private String autor;
    private int precio;
    private int unidades;

    public Libros() {
    }

    public Libros(String nomeLibro, String autor, int precio, int unidades){
        this.nomeLibro = nomeLibro;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    

    public String getNomeLibro() {
        return nomeLibro;
    }

    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    /*@Override
    public int compareTo(Object o) {
        Libros a = (Libros) o;
        if(this.nomeLibro.compareToIgnoreCase()){
            
        }
        
    }

   
    */
    
}
