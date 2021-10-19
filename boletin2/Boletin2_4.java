
package boletin2_4;

/**
 *
 * @author dam1
 */
import java.util.Scanner;
public class Boletin2_4 {
    public static void main(String[] args) {
    Scanner fl= new Scanner(System.in);
    System.out.println("Introduce el valor del numero 1");
    double num1= fl.nextDouble();
    System.out.println("Introduce el valor del numero 2");
    double num2= fl.nextDouble();
    double suma=num1+num2;
    System.out.println("el resultado ded la suma es "+suma);
    double resta=num1-num2 ;
    System.out.println("El resultado de la resta es" +resta);
    double producto=num1*num2 ;
    System.out.println("El resultado del producto es" +producto);
    double cociente=num1/num2;
    System.out.println("El resultado del cociente es" +cociente);
    
    
    }
    
}
