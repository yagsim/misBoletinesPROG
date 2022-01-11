
package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author yagos
 */
public class Rectangulo {
    public Rectangulo(){
    }
    public void area(){
    Scanner fd=new Scanner(System.in);
    System.out.println("Pedimos base");
    int ba;
    ba=fd.nextInt();
    System.out.println("Pedimos altura");
    int al;
    al=fd.nextInt();
    while(ba>0) {
       while(al>0){
       System.out.println(ba + " base + " + al + " altura *"+ ba*al);
       }
    
    }   
    }
}
