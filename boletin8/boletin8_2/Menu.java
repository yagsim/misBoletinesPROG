
package boletin8_2;
import java.util.Scanner;

public class Menu {
    
    public Menu(){
}

    public void Opciones(){
    Scanner sd= new Scanner(System.in);
    System.out.println("1.cudrado \n2.Triángulo \n3.Circulo");
    int numero= sd.nextInt();
    
    switch(numero){
        case 1:
            System.out.println("Pedimos lado");
            double lado= sd.nextDouble();
            double area=lado*lado;
            System.out.println( "El area es "+area);
            break;
    
    
        case 2:
            System.out.println("Pedimos Base ");
            double base= sd.nextDouble();
            System.out.println("Pedimos Altura");
            double altura= sd.nextDouble();
            double areatri=base*altura;
            System.out.println( "El area es "+areatri);
            break;

        
        case 3:
            System.out.println("Pedimos Radio ");
            double radio= sd.nextDouble();
            double PI=  3.1416;
            double areacir=PI*radio/2;
            System.out.println( "El area es "+areacir);
            break;
            
        default:
            System.out.println("opción incorrecta");
}
    
    }    
}

 

