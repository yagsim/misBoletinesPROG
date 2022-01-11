
package boletin6;

import java.util.Scanner;
public class boletin6_1 {
    public static void main(String[]args){
        Coche coche=new Coche();
        Scanner fd=new Scanner(System.in);
        System.out.println("aceleracion");
        int aceleracion= fd.nextInt();
        coche.acelerar(aceleracion);
        System.out.println("freada");
        int disminucion= fd.nextInt();
        coche.frear(disminucion);
        System.out.println(coche.getVelocidade());
        }

}
