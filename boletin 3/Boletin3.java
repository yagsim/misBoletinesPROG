
package boletin3;
import java.util.Scanner;
public class Boletin3 {

    public static void main(String[] args) {
    Scanner sd= new Scanner(System.in);
    System.out.println("Introduzca el precio de la tarifa");
    double tarifa= sd.nextDouble();
    System.out.println("Introduzca el precio pagado");
    double pagado= sd.nextDouble();
    double descuento= pagado/tarifa*100;
    double total= 100- descuento;
    System.out.println("el porcentaje de descuento es de "+ descuento);
    
    }
    
}
