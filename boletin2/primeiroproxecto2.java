
package proyecto_2;

/**
 *
 * @author dam1
 */
import java.util.Scanner;
 class Proyecto_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int enteiro;
        String frase;
        //para leer instancio un obxecto tipo scanner utilizando un constructor
        Scanner silla=new Scanner(System.in);
        System.out.println("teclea un numero enteiro");
        enteiro= silla.nextInt();
        System.out.println("enteiro="+enteiro);
        //float decimal=silla.nextFloat();*/
        System.out.println("Teclea una frase");
        frase= silla.nextLine();
         System.out.println("con nextLine()--->"+frase);
        frase= silla.next();
        System.out.println("con next()--->"+frase);
        
    }
    
}
