
package boletin3_3;

import java.util.Scanner;
public class Boletin3_3 {
    public static void main(String[] args) {
    Scanner dd= new Scanner (System.in);
    System.out.println("introduzca la cantidad de billetes de 100 que tiene");
    double billetes100= dd.nextDouble();
    double total100= billetes100 * 100;
    System.out.println("el total de billetes de 100 es " + total100);
    System.out.println("introduzca la cantidad de billetes de 20 que tiene");
     double billetes20= dd.nextInt();
    double total20= billetes20 * 20;
    System.out.println("el total de billetes de 20 es " + total20);
    System.out.println("introduzca la cantidad de billetes de 5 que tiene");
     double billetes5= dd.nextInt();
    double total5= billetes5 * 5;
    System.out.println("el total de billetes de 5 es " + total5);
     System.out.println("introduzca la cantidad de monedas de 1 que tiene");
      int monedas1= dd.nextInt();
  double total1= monedas1 * 1;
    System.out.println("el total de monedas de 1 es " + total1);
  double total= total100 + total20 + total5 + total1;
    System.out.print("el total es de " + total );
    }
    
}
