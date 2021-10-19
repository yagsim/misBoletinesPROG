
import java.util.Scanner;
public class boletin2_5 {
public static void main(String []args){
Scanner gf= new Scanner(System.in) ;
System.out.println("Introduzca los millas");
double millas;
double metros;
final double EQUIVALENCIA=1852;
millas= gf.nextDouble();
System.out.println (millas+"millas son "+(millas*EQUIVALENCIA)+" metros");
}
}   