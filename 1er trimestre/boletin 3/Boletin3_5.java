
package boletin3_5;

import java.util.Scanner;
public class Boletin3_5 {

    public static void main(String[] args) {
    Scanner dg= new Scanner(System.in);
    System.out.println("Introducir soldo fixo");
    double sfixo=dg.nextDouble();
    System.out.println("Introducir total ventas");
    double tventas=dg.nextDouble();
    System.out.println("Introducir km");
    double km= dg.nextDouble();
    System.out.println("Introducir dietas");
    double dietas= dg.nextDouble();
    double sbruto=sfixo+tventas+km*2+dietas*30;
    System.out.println("El sueldo total es de " +sbruto);
    double sliquido=sbruto-(sbruto*0.18)-36;
    System.out.println("El sueldo liquido es de " +sliquido);
    }
    
}
