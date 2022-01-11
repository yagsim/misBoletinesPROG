
package boletin2_3;

/**
 *
 * @author dam1
impo
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    import java.util.Scanner;
        public class Boletin2_3 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("teclea el numero de euros");
        double euros= sc.nextDouble();
        System.out.println("Teclea el numero de dolares");
        double dolar= sc.nextDouble();
        double total=euros*dolar;
        System.out.println(euros+"€ son "+total+"$");
        
        }
    
}
