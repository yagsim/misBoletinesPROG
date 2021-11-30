
package boletin14_1;

public class Biblioteca {
    private String cod;
    private String titulo;
    private String anoPubl;

    
    
    public Biblioteca(){
        
    }
    public Biblioteca(String cod, String titulo, String anoPubl) {
        this.cod = cod;
        this.titulo = titulo;
        this.anoPubl = anoPubl;
    }
    
    
    
    
    public String getAnoPubl(){
        return anoPubl;
    
        
        
}

    @Override
    public String toString() {
        return "Biblioteca;" + "cod=" + cod + ", titulo=" + titulo + ", anoPubl=" + anoPubl + '"';
    }
}
