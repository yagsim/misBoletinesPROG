
package boletin22;

import javax.swing.JOptionPane;
import libreriaYao.lerDatos;
public class Boletin22 {

    
    public static void main(String[] args) {
        int columna=lerDatos.lerInt("numero de jornadas");
        int[][]taboa=new int[2][columna+1];
        String []nombres ={"Celta", "Levante"};
        String[] xornada=new String[columna+1];
        
        
         int opcion;
         
      do{
           opcion=Integer.parseInt(JOptionPane.showInputDialog("MENU \n1.Crear  \n2.Amosar \n3.Suma \n4.Ordenar \n5.Equipo con mas goles \n6.Amosar Taboa Completa"));
        switch(opcion){
            
            case 1:MetodosBol22.crear(taboa, nombres, xornada);
            break;
            case 2:MetodosBol22.amosar(taboa,xornada,nombres);
            break;
            case 3:MetodosBol22.suma(taboa, xornada, nombres);
            break;
            case 4:MetodosBol22.ordenar(taboa, xornada, nombres);
            break;
            case 5:MetodosBol22.maisGoles(taboa, xornada, nombres);
            break;
            case 6:MetodosBol22.amosarTaboaCompleta(taboa, xornada, nombres);
            break;
        }
    }while(opcion<6);
}
}
    
  