
package boletin20;

public class Papagaio extends Ave implements IPodeCamiñar{
    @Override
    public void camiñar(){
        System.out.println("O papagaio camiña");
    }
    @Override
    public void voar(){
        System.out.println("O papagaio voa");
    }
}
