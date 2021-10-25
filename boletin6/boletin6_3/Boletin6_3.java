
package boletin6_3;
import java.util.Scanner;
public class Boletin6_3 {

    public static void main(String[] args) {
    Scanner hg= new Scanner(System.in);
    Circulo circulo = new Circulo();
    System.out.println ("o radio");
    double radio=hg.nextDouble();
    circulo.setRadio(radio);
    circulo.getRadio();
    circulo.calcularArea();
    circulo.calcularLonxitude();
    System.out.println("O area é; " + circulo.calcularArea()+ " \n A lonxitude é " + circulo.calcularLonxitude());
    
    
    }
    
    
          
    }
    

