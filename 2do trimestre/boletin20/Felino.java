
package boletin20;


public class Felino extends Mamifero implements  IPodeNadar{
    @Override
    public void camiñar(){
        System.out.println("Os gatos camiñan");
    }
     @Override
    public void nadar(){
        System.out.println("Os gatos nadan");
    }
}

