
package boletin15;

/**
 *
 * @author yagos
 */
public class Multimedia {
    private String titulo;
    private String autor;
    private String formato;
    private float duracion;
    public Multimedia(){
        
    }

    public Multimedia(String titulo, String autor, String formato, float duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getFormato(){
        return formato;
    }
    public float getDuracio(){
        return duracion;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion + '}';
    }
    
}
