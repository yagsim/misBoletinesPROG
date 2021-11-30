
package boletin15;


public class Boletin15 {

  
    public static void main(String[] args) {
        Peliculas pel=new Peliculas("Mauricio Pochettino","Kim Domeneck","El show de truman","Sam Perkins","DVD",320.9f);
        System.out.println(pel);
        Discos disc=new Discos("Michael Laudrup","Moncloa Getters","El ejercito hippie","Vinilo",97.3f);
        disc.setXenero("rock-pop");
        System.out.println(disc);
    }
    
}
