
package boletin3_2;
import java.util.Scanner;
public class Boletin3_2 {

    public static void main(String[] args) {
    Scanner hg= new Scanner(System.in);
    System.out.println("Introduzca a temperatura");
    double temperatura = hg.nextDouble();
    double fahrenheit= temperatura *1.8+32;
    double kelvin= temperatura + 273.13;
    System.out.println("la temperatura en Fahrenheit es " + fahrenheit);
    System.out.println("la temperatura en kelvin es " + kelvin);
    }
    
}
