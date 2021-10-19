
package boletin3_4;
import java.util.Scanner;
public class Boletin3_4 {

    public static void main(String[] args) {
    Scanner fp= new Scanner(System.in);
    System.out.println("Introduzca la cantidad total");
    double cantidad= fp.nextDouble();
    double b100= cantidad/100;
    double b20= cantidad%b100/20;
    double b5= b100%b20/5;
    double m1= b20%b5/1;
    System.out.println("la cantidad de billetes de 100 es " +b100+ " \nla cantidad total de billetes de 20 es " +b20+ " \nla cantidad total de billetes de 5 es " +b5+ "\n la cantidad de monedas de 1 euro es " +m1);
    
            
    }
    
}
