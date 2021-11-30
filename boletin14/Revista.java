
package boletin14_1;


public class Revista extends Biblioteca {
    private int num;

    public Revista() {
    }

    public Revista(String cod, String titulo, String anoPubl,int num) {
        super(cod, titulo, anoPubl);
        this.num=num;
    }

    @Override
    public String toString() {
        return "Revista," +super.toString() +"num=" + num + '}';
    }
    
    
}
