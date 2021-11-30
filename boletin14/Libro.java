
package boletin14_1;


public class Libro extends Biblioteca {
    private String prestado;
    
    
    public Libro() {
    }

    public Libro(String cod, String titulo, String anoPubl,String prestado) {
        super(cod, titulo, anoPubl);
        this.prestado=prestado;
    }

    @Override
    public String toString() {
        return "Libro,"+ super.toString() + "prestado=" + prestado + '}';
    }

  
    
    
}
