
package boletin20;


public class Morcego extends  Mamifero implements IPodeVoar{
    @Override
    public void camiñar(){
        System.out.println("O morcego camiña");
    }
    @Override
    public void voar(){
        System.out.println("O morcego voa");
    }
}
