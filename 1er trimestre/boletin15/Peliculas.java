
package boletin15;


public class Peliculas extends Multimedia{
    private String actorPrincipal;
    private String actorSecundario;

    public Peliculas() {
    }

    public Peliculas(String actorPrincipal, String actorSecundario, String titulo, String autor, String formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actorSecundario = actorSecundario;
    }
    public String getActorPrincipal(){
        return actorPrincipal;
        
    }
    
    public String getActorSecundario(){
        return actorSecundario;
    }

    @Override
    public String toString() {
        return "Peliculas{" +super.toString()+ "actorPrincipal=" + actorPrincipal + ", actorSecundario=" + actorSecundario + '}';
    }
    
}
