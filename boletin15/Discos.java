
package boletin15;


public class Discos extends Multimedia {
    private String xenero;

    public Discos() {
    }

    public Discos(String xenero, String titulo, String autor, String formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.xenero = xenero;
    }
    
    
    
    public void setXenero(String xenero){
        this.xenero=xenero;
    }
    
    public String getXenero(){
        return xenero;
    }

    @Override
    public String toString() {
        return "Discos{" + super.toString()+ "xenero=" + xenero + '}';
    }
    
    
}
